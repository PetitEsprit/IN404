import java.util.Stack;
import java.util.EmptyStackException;

/**
 * Décrivez votre classe MoteurRPN ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MoteurRPN
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Stack<Integer> oper;

    /**
     * Constructeur d'objets de classe MoteurRPN
     */
    public MoteurRPN()
    {
         oper = new Stack<Integer>();
    }
    
    public Stack<Integer> getOper()
    {
        return this.oper;
    }
    
    public int getResult(char operateur)
    {
        int res = 0;
        int oper2 = 0;
        int oper1 = 0;
        
        try
        {
            if(!oper.empty())
            {
                oper2 = oper.pop();
                oper1 = oper.pop();
                switch(operateur)
                {
                        case '+' :
                        res = Operation.PLUS.eval(oper1, oper2);
                        break;
                        case '-' :
                        res = Operation.MOINS.eval(oper1, oper2); 
                        break;
                        case '*' :
                        res = Operation.MULT.eval(oper1, oper2); 
                        break;
                        case '/' :
                        res = Operation.DIV.eval(oper1, oper2); 
                        break;
                        default :
                        System.out.println("Operateur non reconnue");
                        oper.push(oper1);res = oper2;
                        break;
                }
            }
        }
        
        catch(EmptyStackException ee)
        {
          System.out.println("Operation Impossible");
          res = oper2;
        }
        
        return res;
    }
    
    public void addOper(int nb)
    {
        oper.push(nb);
    }
    
    public void printStack()
    {
        Object[] objects = oper.toArray();
        for (Object obj : objects) 
            System.out.print(obj + " ");
        System.out.print("\n");
    }
    
}
