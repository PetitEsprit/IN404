import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Document ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Document
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String titre;
    private String auteur;
    private int annee;
    private ArrayList<Document> refs;

    /**
     * Constructeur d'objets de classe Document
     */
    public Document(String titre, String auteur, int annee)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        refs = new ArrayList<Document>(); 
    }

    public String getTitre()
    {
        return this.titre;
    }
    
    public String getAuteur()
    {
        return this.auteur;
    }
    
    public int getAnnee()
    {
        return this.annee;
    }
    
    public ArrayList<Document> getRefs()
    {
        return this.refs;
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void addRef(Document d)
    {
        if(d != null) refs.add(d);
    }
    
    public String toString()
    {
        String str = "";
        str += "Document: "+titre+", "+auteur+", "+annee;
        str += "\nRefs: ";
        for(int i = 0; i<refs.size(); i++)
        {
            str += "\n\t- "+refs.get(i).getAuteur()+", "+refs.get(i).getTitre();
        }
        System.out.println(str);
        return str;
    }
}
