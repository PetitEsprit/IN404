
/**
 * Décrivez votre classe CD ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CD extends Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre;
    private String groupe;
    private int nbtitre;

    /**
     * Constructeur d'objets de classe CD
     */
    public CD(String titre, String groupe, int nbtitre)
    {
        this.titre = titre;
        this.groupe = groupe;
        this.nbtitre = nbtitre;
    }
    
    public String getTitre()
    {
        return titre;
    }
    
    public String getGroupe()
    {
        return groupe;
    }
    
    public int getNbTitre()
    {
        return nbtitre;
    }
    
    public boolean search(String str)
    {
        if(titre.contains(str) || groupe.contains(str)) return true;
        return false;
    }
    
    public String toString()
    {
        String str="";
        str += titre + ", " + groupe + ", " + nbtitre;
        return str;
    }
}
