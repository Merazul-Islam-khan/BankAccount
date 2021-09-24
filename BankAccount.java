/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BankAccount {
    int balance;
    int previousTranscation;
    String CustomerName;
    String CustomerId;
    
    BankAccount(String cname,String cid){
        CustomerName=cname;
        CustomerId=cid;
    }
    
    void deposite(int amount){
        if(amount!=0){
            balance=balance+amount;
            previousTranscation=amount;
            
        }
    }
    
    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;
            previousTranscation=-amount;
            
        }
    }
    void getpreviousTranscation(){
        if(previousTranscation>0){
            System.out.println("Deposite:"+previousTranscation);
        }
        else if(previousTranscation<0){
            System.out.println("Withdraw:"+Math.abs(previousTranscation));
            
        }
        else{
            System.out.println("No Transcation occured");
        }
    }
    
    void show(){
        char option='\0';
        Scanner user_input=new Scanner(System.in);
        System.out.println("Wellcome to "+CustomerName);
        System.out.println("Your id is "+CustomerId);
        System.out.println("\n");
        System.out.println("A.Check Balance ");
        System.out.println("B.Deposite");
        System.out.println("C.WithDraw");
        System.out.println("D.Previous Transcation");
        
        do{
            System.out.println("------------");
            System.out.println("Enter a option:");
            System.out.println("................");
            option=user_input.next().charAt(0);
            System.out.println("\n");
            
            switch(option){
                case 'A':
                    System.out.println("........");
                    System.out.println("Balance:"+balance);
                    System.out.println(".........");
                    System.out.println("\n");
                    break;
                
                case 'B':
                    System.out.println("........");
                    System.out.println("Enter a deposite amonut:");
                    System.out.println("........");
                    int amount=user_input.nextInt();
                    deposite(amount);
                    System.out.println("\n");
                    break;
                    
                case 'C':
                    System.out.println("........");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("........");
                    int amount2=user_input.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                    
                case 'D':
                    System.out.println("........");
                    getpreviousTranscation();
                    System.out.println("........");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("Exit");
                
                default:
                    System.out.println("Invali option! Please Enter agine");
                    break;
                    
                    
            }
            
        }while(option!='E');
        System.out.println("Thanks you Using our services");
    }
    
    
    
}
