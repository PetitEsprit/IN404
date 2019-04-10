public class DnsItem
{
	AdresseIP adrip;
	NomMachine nm;
	
	public DnsItem(AdresseIP ip, NomMachine nmachine)
	{
		this.adrip = ip;
		this.nm = nmachine;
	}
	
	public AdresseIP getAdresse()
	{
		return adrip;
	}
	
	public NomMachine getNom()
	{
		return nm;
	}
	
	public String toString()
	{
		return nm.toString() + " " + adrip.toString();
	}
}
