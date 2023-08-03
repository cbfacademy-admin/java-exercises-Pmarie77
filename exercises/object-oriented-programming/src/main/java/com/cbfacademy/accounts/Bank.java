package com.cbfacademy.accounts;

public class Bank {
   
    Account savingsAccount, currentAccount;

    currentAccount = new currentAccount();
    savingsAccount = new savingsAccount();

    Account [] allAccounts = {currentAccount,savingsAccount};

    public update (){
        for( Account accounts:allAccounts ){

            if (accounts = savingsAccount){
                addInterest();

            } else if (accounts = currentAccount && currentAccount.overdraftLimit < 0) {
               System.out.println("letter sent"); 
        }
    }


    }
}
