
/**
 * Décrivez votre classe Regular ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Regular extends File
{
    private int size;
    /**
     * Constructeur d'objets de classe Regular
     */
    public Regular(String name, int size)
    {
        super(name);
        this.size = size;
    }
    
    @Override
    public int getSize()
    {
        return size;
    }
    
    public boolean search(Directory d)
    {
        return false;
    }
}
