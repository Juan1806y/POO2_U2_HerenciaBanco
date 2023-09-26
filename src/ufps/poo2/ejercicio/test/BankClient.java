/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.*;

/**
/**
 * @author Samir Conde 1152364
 * @author David Rincón 1152327
 * @author Juan David Ortiz Cano 1152298
 */
public class BankClient {
    
    public static void main(String[] args) {

        try
        {
        
            // Account acObj = new Account(); // Genera error, ¿por qué?

            // ================================================
            // TESTING ACCOUNT CLASS	
            // ================================================

            // -------------------------------------------------
            // Debe descomentar este bloque cuando implemente las clases
            // -------------------------------------------------

            Account acObj = new Account(4); 

            System.out.println(acObj.getBalance());
            acObj.deposit(10);
            acObj.deposit(40);
            acObj.deposit(20);
            System.out.println(acObj.getBalance());
            acObj.withdraw(20);
            System.out.println(acObj.getBalance());

            // ================================================
            // TESTING SAVINGSACCOUNT CLASS	
            // ================================================

            // -------------------------------------------------
            // Debe descomentar este bloque cuando implemente las clases
            // -------------------------------------------------

            SavingsAccount saObj = new SavingsAccount (3362189);

            System.out.println(saObj.toString());
            saObj.deposit(-10);
            saObj.deposit(70);
            saObj.deposit(10);
            saObj.deposit(34);
            System.out.println(saObj.toString());
            saObj.withdraw(65);
            System.out.println(saObj.toString());
            saObj.withdraw(8000);

            // ================================================
            // TESTING SAVINGSACCOUNT CLASS	
            // ================================================

            // -------------------------------------------------
            // Debe descomentar este bloque cuando implemente las clases
            // -------------------------------------------------

            CurrentAccount caObj = new CurrentAccount (3362189);

            System.out.println(saObj.toString());
            caObj.deposit(-10);
            caObj.deposit(70);
            caObj.deposit(10);
            caObj.deposit(34);
            System.out.println(saObj.toString());
            caObj.withdraw(65);
            System.out.println(saObj.toString());
            caObj.withdraw(70500);

            // ================================================
            // TESTING BANK CLASS	
            // ================================================

            // -------------------------------------------------
            // Debe descomentar este bloque cuando implemente las clases
            // -------------------------------------------------


            Bank bank = Bank.getInstance(); 		

            bank.openAccount('A', 3354678);
            bank.openAccount('A', 3359302);
            bank.openAccount('C', 3379844);
            bank.openAccount('A', 3312332);
            bank.openAccount('C', 3324224);
            bank.openAccount('C', 3379844);
            bank.openAccount('A', 3399655);

            bank.payDividend(3354678, 10);
            bank.payDividend(3354678, 30);

            bank.payDividend(3359302, 50);
            bank.payDividend(3359302, 50);

            bank.payDividend(3379844, 10);
            bank.payDividend(3379844, 10);

            bank.payDividend(3324224, 10);
            bank.payDividend(3324224, 10);

            System.out.println("*** Val = "+bank.getBalance(3379844));

            bank.withdrawAccount(3379844, 20);
            bank.withdrawAccount(3379844, 5);

            bank.withdrawAccount(3324224, 20);
            bank.withdrawAccount(3324224, 5);

            System.out.println("*** Val = "+bank.getBalance(3379844));

            bank.withdrawAccount(3379844, 15);

            System.out.println("*** Val = "+bank.getBalance(3379844));

            bank.sendLetterToOverdraftAccounts();

            bank.closeAccount(3324224);
            bank.closeAccount(3379844);
            bank.closeAccount(3399655);  

            // ==================================================


            /*
                     Debería obtener un resultado similar a este:

                     *** Val = 20.0
                    CurrentAccount.withdraw
                    CurrentAccount.withdraw
                    Bank.getBalance
                    Bank.payDividend ::: ac.getBalance() = -5.0
                    *** Val = -5.0
                    CurrentAccount.withdraw
                    CurrentAccount.withdraw(...): cannot withdraw this amount.
                    Bank.getBalance
                    Bank.payDividend ::: ac.getBalance() = -5.0
                    *** Val = -5.0
                    Sending letter to this 3379844 account
            */            
        
        }catch(Exception e)
        {
        
            System.err.println(e.getMessage());
        
        }
		
    }
    
}
