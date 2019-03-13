import in404.exo61.serveur.*;
import in404.exo61.client.*;
 
public class Test
{
	public static void main(String []args)
	{
		Client c1 = new Client("Jean Baptiste");
		Client c2 = new Client("Moman");
		Serveur s = new Serveur("The server");
		
		c1.seConnecter(s);
		c2.seConnecter(s);
		c2.envoyer("Mais t'es pas net !!");
		c1.envoyer("Mais si je suis tres net......");
		System.out.println("Lol");
		
	}
}