public enum Main
{
	APP;
	
	public void run()
	{
		File a = new Regular("lol.txt", 4);
		System.out.println(a.toString());
	}
	
	public static void main(String [] args)
	{
		APP.run();
	}
}
