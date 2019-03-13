package in404.exo61.serveur;
import in404.exo61.client.Client;

import java.util.ArrayList;
import java.util.List;
/**
 * Décrivez votre classe Serveur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Serveur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private List<Client> membres;

    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur(String nom)
    {
        this.nom = nom;
        membres = new ArrayList<Client>();
    }

    /**
     * 
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public boolean connecter(Client client)
    {
        if(client != null) return membres.add(client);
        return false;
    }
    
    public void diffuser(String message)
    {
        for(int i=0; i<membres.size(); i++)
        {
            membres.get(i).recevoir(message);
        }
    }
}
