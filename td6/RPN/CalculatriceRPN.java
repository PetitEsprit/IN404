
/**
 * Enumeration CalculatriceRPN - écrire ici la description de l'énumération
 *
 * @author (votre nom)
 * @version (numéro de version ou date)
 */
public enum CalculatriceRPN
{
    ENVIRONNEMENT;
    
    void run()
    {
        SaisieRPN s = new SaisieRPN();
        s.work();
    }
    
    public static void main(String [] args)
    {
        ENVIRONNEMENT.run();
    }
}
