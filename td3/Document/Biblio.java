import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Biblio ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Biblio
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<Document> catalogue;

    /**
     * Constructeur d'objets de classe Biblio
     */
    public Biblio()
    {
       this.catalogue = new ArrayList<Document>();
    }
    
    public void addDoc(Document d)
    {
        if(d != null) catalogue.add(d);
    }
    
    public Document rechercheTitre(String titre)
    {
        Document d;
        for(int i=0; i<catalogue.size(); i++)
        {
            d = catalogue.get(i);
            if(d.getTitre().compareTo(titre) == 0)
            {
                return d;
            }
        }
        return  null;
    }
    
    public ArrayList<Document> rechercheRef(String titre)
    {
        Document d;
        ArrayList<Document> res = new ArrayList<Document>();
        for(int j=0; j<catalogue.size(); j++)
        {
            d = catalogue.get(j);
            for(int i = 0; i<d.getRefs().size(); i++)
            {
                if(d.getRefs().get(i).getTitre().compareTo(titre) == 0)
                {
                    res.add(d);
                }
            }
        }
        return  res;
    }
}
