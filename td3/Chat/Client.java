
/**
 * Décrivez votre classe Client ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private Serveur monServeur;
    private String message;

    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nom)
    {
        this.nom = nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean seConnecter(Serveur serveur)
    {
       if(serveur != null)
       {
           this.monServeur = serveur;
           return serveur.connecter(this);
       }
       return false;
    }
    
    public void envoyer(String message)
    {
        monServeur.diffuser(message);
    }
    
    public void recevoir(String message)
    {
        this.message = message;
    }
}
