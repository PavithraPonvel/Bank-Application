
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Data data = new Data();
            
            System.out.println("Enter your customer Id");
            int customerId = sc.nextInt();

            Customer c = null;
            for(Customer cs:data.list){
                if(cs.getCusId() == customerId){
                    c = cs;
                    break;
                }
            }
            if(c != null){
                String flag = "";
                System.out.println("Enter your pin");
                int pin = sc.nextInt();
                if(pin == c.getPin()){
                    do{
                        System.out.println("The menu");
                        System.out.println("1. Withdrawl");
                        System.out.println("2. Deposit");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Pin Change");
                        System.out.println("5. Pin Generator");
                        System.out.println("6. Transfer");
                        System.out.println("7. Mini Statement");
                        System.out.println("Enter the choice");
                        int ch = sc.nextInt();
                        
                        switch (ch) {
                            case 1:
                                c.withdrawl();
                                data.updateCustomer(c);
                                break;
                            case 2:
                                c.deposit();
                                data.updateCustomer(c);
                                break;
                            case 3:
                                System.out.println("The current balance is "+c.getBalance());
                                break;
                            case 4:
                                System.out.println("Enter the new pin");
                                int Change = sc.nextInt();
                                c.setPin(Change);
                                data.updateCustomer(c);
                                System.out.println("The pin is changed");
                                break;
                            // case 5:
                            //     c.pinGenerator();
                            //     break;
                            // case 6:
                            //     c.transfer();
                            //     break;
                            // case 7:
                            //     c.miniStatement();
                            //     break;
                            // default:
                                // break;
                        }
                        sc.nextLine();
                        System.out.println("Do you want to exit. Type Yes/No");
                        flag = sc.nextLine();
                    }while(flag.equals("No"));
                }else{
                    System.out.println("Incorrect Pin");
                }
            }else{
                System.out.println("The account is not found");
            }
        }
    }
}