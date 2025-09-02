import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SuppressionAnimalFenetre extends JFrame implements ActionListener {

    private JPanel monPanel;
    private JTextField jtfNom;
    private JButton btnValider;

    public SuppressionAnimalFenetre() {
        this.setTitle("Supprimer un animal");
        this.setSize(350, 150);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        monPanel = new JPanel();

        jtfNom = new JTextField("");
        jtfNom.setPreferredSize(new Dimension(150, 25));
        btnValider = new JButton("Supprimer");

        btnValider.addActionListener(this);

        monPanel.add(new JLabel("Nom : "));
        monPanel.add(jtfNom);
        monPanel.add(btnValider);

        this.getContentPane().add(monPanel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent evenement) {
        if (evenement.getSource() == btnValider) {
            String nom = jtfNom.getText();
            int position = Programme.maMenagerie.rechercherAnimal(nom);
            if (position != -1) {
                Animal aSupprimer = Programme.maMenagerie.listeAnimaux.get(position);
                Programme.maMenagerie.retirerUnAnimal(aSupprimer);
                JOptionPane.showMessageDialog(this, "Animal supprimé !");
            } else {
                JOptionPane.showMessageDialog(this, "Animal non trouvé !");
            }
            this.dispose();
        }
    }
}