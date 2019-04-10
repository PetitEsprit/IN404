import java.util.*;

public class Dns
{
	HashMap<AdresseIP, NomMachine> ipToMachine;
	HashMap<NomMachine, AdresseIP> machineToIp;
	
	public Dns()
	{
		ipToMachine = new HashMap<AdresseIP, NosafemMachine>();
		machineToIp = new HashMap<NomMachine,AdresseIP>();
	}
	
	public void dnsAdd(DnsItem item)
	{
		ipToMachine.put(item.adrip, item.nm);
		machineToIp.put(item.nm, item.adrip);
	}
	public DnsItem getItem(AdresseIP aip)
	{
		return new DnsItem(aip, ipToMachine.get(aip));
	}
	
	public DnsItem getItem(NomMachine nm)
	{
		return new DnsItem(machineToIp.get(nm), nm);
	}
	
	//Unsafe !!!!!!!!!
	public Collection<DnsItem> getItems(String nomDomaine)
	{
		ArrayList<DnsItem> output = new ArrayList();
		for(NomMachine nm : ipToMachine.values())
		{
			if(nm.getNm().equals(nomDomaine))
			{
				output.add(getItem(nm));
			}
		}
		return output;
	}
	
	public static void main(String [] args)
	{
		Dns db = new Dns();
		AdresseIP adip = new AdresseIP("255.255.255.255");
		NomMachine nm = new NomMachine("rien.rien.duvent");
		DnsItem item = new DnsItem(adip, nm);
		db.dnsAdd(item);
	
		System.out.println(db.getItem(adip).toString());
		
	}
	
}
