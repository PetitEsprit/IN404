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

    /**
     * Constructeur d'objets de classe Directory
     */
    public Directory(String name)
    {
        super(name);
        insidefile = new ArrayList<File>();
    }

    public ArrayList<File> getInside()
    {
        return insidefile;
    }
    
    void addFile(File f)
    {
        if(f!=null && !this.equals(f)) insidefile.add(f);
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
    
    public boolean search(Directory d)
    {
            ArrayList<File> fin = d.getInside();
            for(int i=0; i<fin.size(); i++)
            {
                if(fin.get(i) instanceof Directory)
                {
                    if(fin.get(i).equals(this)) return true;
                    fin.get(i).search(d);
                }
            }
        return false;
    }
}
