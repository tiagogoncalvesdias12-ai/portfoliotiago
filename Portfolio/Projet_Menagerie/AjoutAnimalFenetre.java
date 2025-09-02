import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AjoutAnimalFenetre extends JFrame implements ActionListener {

    private JPanel monPanel;
    private JTextField jtfNom, jtfEspece;
    private JButton btnValider;

    public AjoutAnimalFenetre() {
        this.setTitle("Ajouter un animal");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        monPanel = new JPanel();

        jtfNom = new JTextField("");
        jtfNom.setPreferredSize(new Dimension(150, 25));
        jtfEspece = new JTextField("");
        jtfEspece.setPreferredSize(new Dimension(150, 25));
        btnValider = new JButton("Valider");

        btnValider.addActionListener(this);

        monPanel.add(new JLabel("Nom : "));
        monPanel.add(jtfNom);
        monPanel.add(new JLabel("Espèce : "));
        monPanel.add(jtfEspece);
        monPanel.add(btnValider);

        this.getContentPane().add(monPanel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent evenement) {
        if (evenement.getSource() == btnValider) {
            String nom = jtfNom.getText();
            String espece = jtfEspece.getText();
            Animal nouvelAnimal = new Animal(nom, espece);
            Programme.maMenagerie.ajouterUnAnimal(nouvelAnimal);
            JOptionPane.showMessageDialog(this, "Animal ajouté avec succès !");
            this.dispose();
        }
    }
}