
/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String encrypt;
    private int decalage;
    
    public static ChaineCryptee deEnClair(String enclair, int decal)
    {
        return new ChaineCryptee(crypte(enclair, decal) , decal);
    }
    
    public static ChaineCryptee deCryptee(String encrypt, int decal)
    {
        return new ChaineCryptee(encrypt , decal);
    }
    
    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    private ChaineCryptee(String str, int decalage)
    {
        // initialisation des variables d'instance
        this.encrypt = str;
        this.decalage = decalage;
    }
    
    
    /**
     * Renvoie la version cryptée de la chaine de caractère stockée
     * Renvoie null si chaine est null
     */
    public static String crypte(String str, int decal)
    {
        String tmp = "";
        if(str == null) return null;
        for(int i=0; i<str.length(); i++)
        {
            tmp += decaleCaractere(str.charAt(i), decal);
        }
        
        return tmp;
    }
    
    
    public static String decrypte(String str, int decal)
    {
        String tmp = "";
        if(str == null) return null;
        for(int i=0; i<str.length(); i++)
        {
            tmp += decaleCaractere(str.charAt(i), -decal);
        }
        
        return tmp;
    }
    
    private static char decaleCaractere(char c, int decalage)
    {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
    
}
