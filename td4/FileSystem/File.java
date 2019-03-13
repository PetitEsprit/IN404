
/**
 * Décrivez votre classe abstraite File ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class File
{
    // variable d'instance - remplacez cet exemple par le vôtre
    private String name;

    public File(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    abstract public int getSize();
    abstract public boolean search(Directory d);
}
