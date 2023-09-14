package single;

public class MultiLevel {
	public void methods()
	{
		System.out.println("Multi inheritance is possible........");
	}
}
class Best extends MultiLevel
{
	void destroy()
	{
		System.out.println("destroy the unit.....");
	}
}
class c extends Best
{
	void recreate()
	{
		System.out.println("recreate it-------");
	}
}
