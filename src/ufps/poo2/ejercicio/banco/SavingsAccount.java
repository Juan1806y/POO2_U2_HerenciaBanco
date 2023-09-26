/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco;

/**
 *
 * @author juan_
 */
public class SavingsAccount extends Account{
    
    private double interest;

    public SavingsAccount(int a) {
        super(a);
        interest = 9;
    }
    
    @Override
    public void deposit(double sum) {
        
        double interestAmount = addInterest();
        
        super.deposit(sum + interestAmount);
        
    }
    
    @Override
    public void withdraw(double sum) {

        if(sum <= getBalance())
        {
        
            super.withdraw(sum);
        
        }else{
        
            System.err.println("You cannot withdraw more than the balance value.");
        
        }
        
    }
    
    private double addInterest()
    {
        
        return getBalance() * this.interest;
        
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    
    @Override
    public boolean equals(Object obj)
    {
    
        boolean isEquals = false;
        
        if(obj instanceof Account)
        {
        
            Account temp = (Account)obj;
            isEquals = this.getAccountNumber() == temp.getAccountNumber();
        
        }
        
        return isEquals;
    
    }
    
}
