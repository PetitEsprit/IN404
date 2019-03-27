
/**
 * Enumeration Operation - écrire ici la description de l'énumération
 *
 * @author (votre nom)
 * @version (numéro de version ou date)
 */
public enum Operation
{
    PLUS('+')
    {
        @Override
        public double eval(double oper1, double oper2)
        {
            return oper1 + oper2;
        }
    },
    MOINS('-')
    {
        @Override
        public double eval(double oper1, double oper2)
        {
            return oper1 - oper2;
        }
    },
    MULT('*')
    {
        @Override
        public double eval(double oper1, double oper2)
        {
            return oper1 * oper2;
        }
    },
    DIV('/')
    {
        @Override
        public double eval(double oper1, double oper2)
        {
            return oper1 / oper2;
        }
    };
    
    private char symbole;
    
    Operation(char symbole)
    {
        this.symbole = symbole;
    }
    
    public abstract double eval(double oper1, double oper2);
}
