/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.poo2.ejercicio.banco;

/**
 *
 * @author juan_
 */
public class CurrentAccount extends Account{
    
    private double overdraftLimit;

    public CurrentAccount(int a) {
        super(a);
        this.overdraftLimit = 10;
    }
    
    @Override
    public void withdraw(double sum) {

        if(sum <= verifyOverdraftLimit())
        {
        
            super.withdraw(sum);
        
        }else{
        
            System.err.println("Account.withdraw(...): " + "cannot withdraw if limit of overdraft is exceeded.");
        
        }
        
    }
    
    private double verifyOverdraftLimit()
    {
    
        return getBalance() + this.overdraftLimit;
        
    }
    
    public boolean OverdraftAccount()
    {
    
        return getBalance() < 0;
    
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

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
}
