//method returning
package wrapper_Classes;

public class Coffee {
	String name="exprso";
	int price=250;
	@Override
	public String toString() {
		return this.name+" "+this.price;
	}
}
	class Tea
	{
		String name="Wah-taj";
		int price=50;
		@Override
		public String toString() {
			return this.name+" "+this.price;
		}
	}
		class VendingMachine
		{
			Coffee button()
			{
				Coffee c=new Coffee();
				return c;
			}
			Tea button1()
			{
				Tea t=new Tea();
				return t;
			}
			public static void main(String[] args) {
				VendingMachine v=new VendingMachine();
				Coffee x=v.button();
				System.out.println(x);
				Tea y=v.button1();
				System.out.println(y);
			}
}
