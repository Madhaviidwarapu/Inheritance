package single;

public class SingleLevel {
	public void method()
	{
		System.out.println("single level inheritance is possible........");
	}
}
	class B extends SingleLevel {
		public static void reuse()
		{
			System.out.println("reusability ......");
		}
	}
	class Inherits extends B
	{
		public static void main(String[] args) {
			B work=new B();
			work.method();
			work.reuse();
		}
}
