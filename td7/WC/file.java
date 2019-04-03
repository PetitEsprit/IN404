import java.io.*; 
public class file
{ 
  public static void main(String[] args) throws Exception 
  {
    FileReader in = new FileReader("test.txt"); 
  
    int c; 
    int n = 1;
    if((c=in.read()) != -1)
    {
		if(c == '\n') n++;
		while ((c=in.read()) != -1) 
			if(c == '\n') n++;
		
	}
	else{n = 0;}
	System.out.println("Nb de lignes: " + n);
  } 
}