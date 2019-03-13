import java.util.Scanner;
/**
 * Décrivez votre classe SaisieRPN ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class SaisieRPN
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Scanner sc;
    private MoteurRPN mrpn;

    /**
     * Constructeur d'objets de classe SaisieRPN
     */
    public SaisieRPN()
    {
        sc = new Scanner(System.in);
        mrpn = new MoteurRPN();
    }
    
    public void work()
    {
        String in = "";
        String stackinf = "";
        int oper = 0;
        while(!in.equals("exit"))
        {
            System.out.print("Entrez un nombre ou une operation...");
            in = sc.next();
            try
            {
                oper = Integer.parseInt(in);
                mrpn.addOper(oper);
            }
            catch(NumberFormatException ne)
            {
               if(!in.equals("exit"))
               {
                   mrpn.addOper(mrpn.getResult(in.charAt(0)));
               }
            }
            
            mrpn.printStack();
        }
    }
}
