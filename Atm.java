
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String user_1 = "Sanjay",password_1="1523";
        long amount_1 = 2000;
        
        System.out.println("WELCOM to the AD ATM");

        Scanner in = new Scanner(System.in);
        System.out.println("press 1 for ADMIN or press 2 for USER");
        int input = in.nextInt();

        if(input == 1){
            System.out.println("Only can accessed by Authorized Users!");
        }
        else if(input == 2){
            System.out.println("WELCOME to the USER side");
            System.out.print("Enter the User Name : ");
            String tem_user_1 = in.next();

            if(user_1.equals(tem_user_1)){

                System.out.print("Enter the Password : ");
                String tem_password_1 = in.next();
                if(password_1.equals(tem_password_1)){
                    System.out.print("Select the option");
                    System.out.println("Check Balance(1)");
                    System.out.println("Widthdraw(2)");
                    System.out.println("Deposite(3)");
                    System.out.println("Exit(4)");

                    System.out.println("Choose the option");
                    int Option = in.nextInt();

                    
                    long balance_amount=0;
                    
                    switch (Option) {
                        case 1 -> System.out.println(user_1+"account balance is "+amount_1);
                        case 2 -> {
                            System.out.print("Enter the amount : ");
                            long input_amount = in.nextLong();
                            if(input_amount>amount_1){
                                System.out.println("INSUFFICIENT AMOUNT");
                            }
                            else if(input_amount<=amount_1){
                                System.out.println("Process is successful");
                                balance_amount=amount_1-input_amount;
                                System.out.println("Want check balance yes or no");
                                String w = in.next();

                                switch (w) {
                                    case "yes" -> {
                                        System.out.println(balance_amount);
                                        System.out.println("Thank you for using AD ATM");
                                    }
                                    default -> System.out.println("Thank you for using AD ATM");
                                }
                            }
                            else{
                                System.out.println("Invalid amount");
                            }
                        }
                        case 3 -> {
                            System.out.print("Enter the "+user_1+" want to deposit amount : ");
                            long deposit_amount =in.nextLong();
                            
                            long total_amount = 0;
                            if(deposit_amount==0){
                                System.out.println("Enter the valid amount");
                            }
                            else{
                                System.out.println("Enter how much demonstration in 100");
                                int hundred =in.nextInt();
                                System.out.println("Enter how much demonstration in 200");
                                int two_hundred =in.nextInt();
                                System.out.println("Enter how much demonstration in 500");
                                int five_hundred =in.nextInt();
                                
                                total_amount = 100*hundred+200*two_hundred+500*five_hundred;
                                if(deposit_amount==total_amount){
                                    balance_amount = amount_1+total_amount;
                                    
                                    System.out.println("Want check balance yes or no");
                                    String w = in.next();
                                    switch (w) {
                                        case "yes" -> System.out.println(balance_amount);
                                        default -> System.out.println("Thank you for using AD ATM");
                                    }
                                }
                                else{
                                    System.out.println(deposit_amount-total_amount+" is not depoited");
                                }
                            }
                        }

                        default -> System.out.println("Thank you for using AD ATM");
                    }
                }
                
                else{
                    int f =3;
                    for (int i = 1; i <= 3; i++) {
                        if(!"1127".equals(tem_password_1))
                        {
                            System.out.println("invalid password");
                            f--;
                            System.out.println();
                            System.out.println(f+"more attempts are left");
                            System.out.println("enter the password again");
                            String k=in.next();
                            tem_password_1=k;
                        }
                        
                    }
                    
                    System.out.println(user_1+" accont has been blocked");
                }
            }
            else{
                System.out.println("INVALID User Name");
            }
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
