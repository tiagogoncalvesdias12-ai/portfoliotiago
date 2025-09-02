import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RechercheAnimalFenetre extends JFrame implements ActionListener {

    private JPanel monPanel;
    private JTextField jtfNom;
    private JButton btnValider;

    public RechercheAnimalFenetre() {
        this.setTitle("Rechercher un animal");
        this.setSize(350, 150);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        monPanel = new JPanel();

        jtfNom = new JTextField("");
        jtfNom.setPreferredSize(new Dimension(150, 25));
        btnValider = new JButton("Rechercher");

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
                JOptionPane.showMessageDialog(this, "Animal trouvé à la position " + position + " !");
            } else {
                JOptionPane.showMessageDialog(this, "Animal non trouvé.");
            }
            this.dispose();
        }
    }
}