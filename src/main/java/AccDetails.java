import java.util.Scanner;

public class AccDetails {
    private String name;
    private String accNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    public void createAccount(){
        System.out.println("Provide account name");
        name = scanner.next();
        System.out.println("Provide account number");
        accNumber = scanner.next();
        System.out.println("Provide login");
        login = scanner.next();
        System.out.println("Provide account balance");
        balance = scanner.nextLong();


    }
    public void showAccount(){
        System.out.println("Your account name is: " + name);
        System.out.println("Your account number is: " + accNumber);
        System.out.println("Your login is: " + login);
        System.out.println("Your balance is: " + balance);

    }

    public void deposit(){
        System.out.println("Ile chesz wplacic");
        long pieniadze;
        pieniadze = scanner.nextLong();
        balance = pieniadze + balance;
    }

}
