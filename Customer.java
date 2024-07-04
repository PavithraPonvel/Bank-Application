import java.util.Scanner;

public class Customer {
    private int cusId;
    private String name;
    private String bank;
    private int pin;
    private double balance;

    Scanner scanner = new Scanner(System.in);
    
    public Customer(int cusId,String name,String bank,int pin,double balance){
        this.cusId = cusId;
        this.name = name;
        this.bank = bank;
        this.pin = pin;
        this.balance = balance;
    }
    public int getCusId(){
        return cusId;
    }
    public void setCusId(int cusId){
        this.cusId = cusId;
    }
    public String getName(){
        return new String(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBank(){
        return new String(bank);
    }
    public void setBank(String bank){
        this.bank = bank;
    }
    public int getPin(){
        return pin;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void withdrawl(){
        System.out.println("Enter the amount for withdrawl");
        int amount = scanner.nextInt();
        if(balance < amount){
            System.out.println("Insufficient balance");
        }else{
            balance = balance-amount;
            System.out.println("The amount is withdrawn");
        }
    }
    public void deposit(){
        System.out.println("Enter the amount to deposited");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("The amount is deposited");
    }
    void display(){
        System.out.println("Customer Id: "+cusId);
        System.out.println("Name: "+name);
        System.out.println("Bank: "+bank);
        System.out.println("Pin: "+pin);
        System.out.println("Balance: "+balance);
    }

}
