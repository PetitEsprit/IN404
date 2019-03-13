
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private final int num;
    private final int denom;
    
    public static final Fraction ONE = new Fraction(1, 1);
    public static final Fraction ZERO = new Fraction(0, 1);
    
    /**
     * Constructeur d'objets de classe Fraction
     */
    public Fraction()
    {
        num = 0;
        denom = 1;
    }
    
    public Fraction(int num)
    {
        this.num = num;
        denom = 1;
    }
    
    public Fraction(int num, int denom)
    {
       this.num = num;
       this.denom = denom;
    }
    
    public int getNum()
    {
        return num;
    }
    
    public int getDenom()
    {
        return denom;
    }
    
    public double getValue()
    {
        return (double)num/(double)denom;
    }
    
    public Fraction addFrac(Fraction f)
    {
        int fnum = f.getNum();
        int fdenom = f.getDenom();
        if(f!=null)
        {
            if(denom == fdenom) return new Fraction(num + fnum, denom);
            else
            {
               return new Fraction(num*fdenom + fnum*denom, denom * fdenom);
            }
        }
        return null;
    }
    
    public boolean equals(Fraction f)
    {
        double fnum = f.getNum();
        double fdenom = f.getDenom();
        double coef = (num < fnum ? (double)fnum/num : (double)num/fnum);
        
        if((num*coef) == fnum && (denom*coef) == fdenom)
        {
            return true;
        }
        return false;
    }
    
    public boolean superior(Fraction f)
    {
        return (((double)num/(double)denom) < f.getValue() ? false : true);
    }
    
    public String toString()
    {
        
        String str= num + " / " + denom;
        return str;
    }
}
