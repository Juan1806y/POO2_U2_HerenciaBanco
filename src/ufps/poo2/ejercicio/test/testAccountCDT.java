package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.*;

public class testAccountCDT {

	public static void main(String[] args) {
		
		Bank bank = Bank.getInstance();
		
		bank.openAccount('D', 3678223);
		bank.openAccount('D', 3678455);
		bank.openAccount('D', 3250155);
		bank.openAccount('D', 3425478);
		
		bank.payDividend(3425478, -25);
		bank.payDividend(3678223, 50);
		bank.payDividend(3678455, 100);
		bank.payDividend(3250155, 5000);
		
		System.out.println("Account 3425478: " + bank.getBalance(3425478));
		System.out.println("Account 3678223: " + bank.getBalance(3678223));
		System.out.println("Account 3678455: " + bank.getBalance(3678455));
		System.out.println("Account 3250155: " + bank.getBalance(3250155));
		
		bank.withdrawAccount(3425478, 20);
		bank.withdrawAccount(3678223, 5);
		bank.withdrawAccount(3678455, 25);
		bank.withdrawAccount(3250155, 30);
		
		bank.rentabilidadCuentasCDT(50);
		
	}
	
}
