package Abstraction;

public class Bank {
	private class Sbi implements Atm {

		public void withdraw() {
			System.out.println("From withdraw ");
		}

		public void checkBal() {
			System.out.println("From check balance ");
		}

		public void deposite() {
			System.out.println("from deposite ");
		}

	}
	public Atm atm() {
		return new Sbi();
	}
}
