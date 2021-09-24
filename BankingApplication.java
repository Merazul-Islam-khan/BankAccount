/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

/**
 *
 * @author User
 */
public class BankingApplication {
    public static void main(String args[]){
        
        BankAccount person1=new BankAccount("Merazul Islam","1D213");
        person1.show();
        BankAccount person2=new BankAccount("Sadia","111S12");
        person2.show();
    }
}
