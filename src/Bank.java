import java.util.Scanner;

public class Bank {
    String namn;
    String SSN;
    Account AC1;
    Scanner scanner = new Scanner(System.in);

    public Bank() {
        start();
    }

    public void start() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till banken");
        System.out.println("Skriv in ditt namn");
        System.out.println("Namn: ");
        namn = scanner.next();
        System.out.println("Hejsan " + namn);
        System.out.println("Skriv in ditt personnummer");
        System.out.println("Personnummer: ");
        SSN = scanner.next();

        AC1 = new Account();
        AC1.BankAccount(namn, "001", SSN);


    }

    public void menu(String namn, String SSN) {
        char val = '\0';

        System.out.println("Välkommen" + namn);
        System.out.println("\n");
        System.out.println("1. Se saldo");
        System.out.println("2. Insättning");
        System.out.println("3. Uttag");
        System.out.println("4. Transaktions historik");
        System.out.println("5. Avsluta");

        do {
            System.out.println("============================================================================");
            System.out.println("Gör ett val");
            System.out.println("============================================================================");
            val = scanner.next().charAt(0);
            System.out.println("\n");

            switch (val) {
                case '1':
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ditt saldo: " + AC1.getBalance());
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println('\n');
                    break;

                case '2':
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Hur mycket vill du sätta in?: ");
                    System.out.println("--------------------------------------------------------------------------");
                    int amount = scanner.nextInt();
                    AC1.deposit(amount);
                    System.out.println("\n");
                    break;

                case '3':
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Hur mycket vill du ta ut?: ");
                    System.out.println("--------------------------------------------------------------------------");
                    int amount2 = scanner.nextInt();
                    AC1.withdraw(amount2);
                    System.out.println("\n");
                    break;

                case '4':
                    System.out.println("--------------------------------------------------------------------------");
                    AC1.getPreTransaction();
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("FEL! Skriv in ett nummer!");
                    break;

            }


        } while (val != '5');

        System.out.println("Tack och hejdå");
    }
}

