import java.util.ArrayList;

public class Menagerie {
    ArrayList<Animal> listeAnimaux;

    public Menagerie() {
        this.listeAnimaux = new ArrayList<Animal>();
    }

    public void ajouterUnAnimal(Animal unAnimal) {
        this.listeAnimaux.add(unAnimal);
    }

    public void retirerUnAnimal(Animal unAnimal) {
        this.listeAnimaux.remove(unAnimal);
    }

    public int rechercherAnimal(String unNom) {
        if (listeAnimaux.size() == 0) {
            return -1;
        }
        int compteur = 0;
        while (compteur < listeAnimaux.size() && !listeAnimaux.get(compteur).getNom().equals(unNom)) {
            compteur++;
        }
        if (compteur < listeAnimaux.size()) {
            return compteur;
        } else {
            return -1;
        }
    }

    public String presenter() {
        String chaine = "***** PRESENTATION DE LA MENAGERIE *****\n";
        for (Animal a : listeAnimaux) {
            chaine += "Nom : " + a.getNom() + " - Espèce : " + a.getEspece() + "\n";
        }
        return chaine;
    }
}