import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Accounts> accounts = new ArrayList<>();
    
        public static void main(String[] args) throws Exception {
            System.out.println("Hola mundo este es el primer punto de programacion del parcial.");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Create saving account");
                System.out.println("2. Create checking account");
                System.out.println("3. Deposit");
                System.out.println("4. Withdrow");
                System.out.println("5. Finish program\n");
                int opcion = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcion) {
                    case 1:
                        createSavingAccount(scanner);
                        break;
                    case 2:
                        createCheckingAccount(scanner);
                        break;
                    case 3:
                        deposit(scanner);
                        break;
                    case 4:
                        withdrow(scanner);
                        break;
                    case 5:
                        System.out.println("\nProgram finalized.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("\nNot valid option.");
                }
            }
        }
    
        public static void createSavingAccount(Scanner scanner) {
            System.out.println("\nEnter de account number:");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter the balance:");
            float balance = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Enter the owner name:");
            String ownerName = scanner.nextLine();
            System.out.println("Enter the interest rate:");
            float interesRate = scanner.nextFloat();
    
            Accounts cuentaAhorro = new SavingsAccount(accountNumber, balance, ownerName, interesRate);
            accounts.add(cuentaAhorro);
        System.out.println("\nSaving account create succesfully!.");
    }

    public static void createCheckingAccount(Scanner scanner) {
        System.out.println("\nEnter the account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter the balance:");
        float balance = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter the owner name:");
        String ownerName = scanner.nextLine();
        System.out.println("Enter the overdraf tLimit:");
        float overdraftLimit = scanner.nextFloat();

        Accounts cuentaCorriente = new CheckingAccount(accountNumber, balance, ownerName, overdraftLimit);
        accounts.add(cuentaCorriente);
        System.out.println("\nChecking account created succesfully!.");
    }

    public static void deposit(Scanner scanner) {
        System.out.println("Enter the account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter the deposit amount:");
        float amount = scanner.nextFloat();

        Accounts cuenta = buscarCuenta(accountNumber);
        if (cuenta != null) {
            cuenta.deposit(amount);
        } else {
            System.out.println("\nThe account does not exists.");
        }
    }

    public static void withdrow(Scanner scanner) {
        System.out.println("Enter the account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter the withdrow amount:");
        float amount = scanner.nextFloat();

        Accounts cuenta = buscarCuenta(accountNumber);
        if (cuenta != null) {
            cuenta.withdraw(amount);
        } else {
            System.out.println("the account dows not exists.");
        }
    }

    public static Accounts buscarCuenta(int accountNumber) {
        for (Accounts cuenta : accounts) {
            if (cuenta.getAccountNumber() == accountNumber) {
                return cuenta;
            }
        }
        return null;
    }
}
