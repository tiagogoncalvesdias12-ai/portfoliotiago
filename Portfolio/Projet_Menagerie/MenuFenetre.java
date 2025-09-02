import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFenetre extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton btnAjouter, btnRechercher, btnSupprimer;

    public MenuFenetre() {
        this.setTitle("Ménagerie - Menu");
        this.setSize(400, 150);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        btnAjouter = new JButton("Ajouter un animal");
        btnRechercher = new JButton("Rechercher un animal");
        btnSupprimer = new JButton("Supprimer un animal");

        btnAjouter.addActionListener(this);
        btnRechercher.addActionListener(this);
        btnSupprimer.addActionListener(this);

        panel.add(btnAjouter);
        panel.add(btnRechercher);
        panel.add(btnSupprimer);

        this.getContentPane().add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent evenement) {
        if (evenement.getSource() == btnAjouter) {
            new AjoutAnimalFenetre();
        } else if (evenement.getSource() == btnRechercher) {
            new RechercheAnimalFenetre();
        } else if (evenement.getSource() == btnSupprimer) {
            new SuppressionAnimalFenetre();
        }
    }
}