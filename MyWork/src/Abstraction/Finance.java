package Abstraction;

public class Finance {
	public static void main(String[] args) {
		Bank b = new Bank();
		Atm a = b.atm();
		a.withdraw();
		a.checkBal();
		a.deposite();
//		Atm s=Bank.m1();
	}
}
