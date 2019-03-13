import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Collection ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Collection
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<Document> collec;

    /**
     * Constructeur d'objets de classe Collection
     */
    public Collection()
    {
        collec = new ArrayList<Document>();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public ArrayList<Document> getCollec()
    {
        return collec;
    }
    
    public void addDoc(Document d)
    {
        if(d!=null)collec.add(d);
    }
    
    public String listDoc()
    {
        String str="";
        for(int i=0; i<collec.size(); i++)
        {
            str += collec.get(i).toString() + "\n";
        }
        return str;
    }
    
    public ArrayList<Document> searchDoc(String str)
    {
        ArrayList<Document> list = new ArrayList<Document>();
        Document d;
        for(int i=0; i<collec.size(); i++)
        {
            d = collec.get(i);
            if(d.search(str)) list.add(d);
        }
        return list;
    }
}
