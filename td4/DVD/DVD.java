
/**
 * Décrivez votre classe DVD ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class DVD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre;
    private String real;
    private int annee;

    /**
     * Constructeur d'objets de classe DVD
     */
    public DVD(String titre, String real, int annee)
    {
        // initialisation des variables d'instance
        this.titre = titre;
        this.real = real;
        this.annee = annee;
    }

    public String getTitre()
    {
        return titre;
    }
    
    public String getReal()
    {
        return real;
    }
    
    public int getAnnee()
    {
        return annee;
    }
    
    public boolean search(String str)
    {
        if(titre.contains(str) || real.contains(str)) return true;
        return false;
    }
    
    public String toString()
    {
        String str="";
        str += titre + ", " + real + ", " + annee;
        return str;
    }
}
