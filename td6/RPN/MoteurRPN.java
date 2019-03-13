import java.util.Stack;

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
        int res;
        if(operateur == '+'){res = Operation.PLUS.eval(oper.pop(), oper.pop());}
        else if(operateur == '-'){res = Operation.MOINS.eval(oper.pop(), oper.pop());}
        else if(operateur == '*'){res = Operation.MULT.eval(oper.pop(), oper.pop());}
        else {res = Operation.DIV.eval(oper.pop(), oper.pop());}
        return res;
    }
    
    public void addOper(int nb)
    {
        oper.push(nb);
    }
    
}
