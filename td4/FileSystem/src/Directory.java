import java.util.List;
import java.util.ArrayList;
/**
 * Décrivez votre classe Directory ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Directory extends File
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList<File> insidefile;
    private Directory father;

    /**
     * Constructeur d'objets de classe Directory
     */
    public Directory(String name)
    {
        super(name);
        insidefile = new ArrayList<File>();
        father = null;
    }

    public ArrayList<File> getInside()
    {
        return insidefile;
    }
    
    public Directory getFather()
    {
        return father;
    }
    
    void setFather(Directory d)
    {
        if(d!=null) this.father = d;
    }
    
    void addFile(File f)
    {
        f.addTo(this);
    }
    
    @Override
    public void addTo(Directory d)
    {
        if(d != null && !d.ismyancestor(this))
        {
            d.getInside().add(this);
            setFather(d);
        }
    }
    
    @Override
    public int getSize()
    {
        int size = 0;
        for(int i=0; i<insidefile.size(); i++)
        {
            size += insidefile.get(i).getSize();
        }
        return size;
    }
    
    public boolean ismyancestor(Directory d)
    {
        Directory a = this.father;
        while(a != null)
        {
            if(a == d) return true;
            a = a.getFather();
        }
        
        return false;
    }
    
}
