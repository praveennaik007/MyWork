package Interface;

public interface DemoMain extends Demo, Demo1 {
	public static void main(String[] args) {
		Demo d = new Demo() {

			public void run() {
				System.out.println("FRom DEmo");
			}
		};
		
		Demo1 d1 = new Demo1() {

			public void run() {
				System.out.println("From Demo1 ");
			}
		};
		d.run();
		d1.run();
	}
}
