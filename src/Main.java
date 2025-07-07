import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transaction> myList = new ArrayList<>();
        myList.add(new CreditTransaction("TX1002", LocalDate.now(), "Client Payment", 2500.0, 2500.0, 1112, "Admin", "PENDING", "Bank Transfer"));
        myList.add(new DebitTransaction("TX1003", LocalDate.now(), "Office Rent", 800.0, 800.0, 1113, "Jawad", "APPROVED", "Monthly Rent"));





        JournalLedgerManager ledger = new JournalLedgerManager(myList);
        Scanner input = new Scanner(System.in);

        System.out.println("\n📊 Welcome to Journal & Ledger Manager");
        System.out.println("1. View Simple Ledger");
        System.out.println("2. Filter Transactions");

        System.out.print("Choose an option: ");
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                ledger.printSimpleLedger();
                break;
            case "2":
                ledger.filterLedgerMulti(input);
                break;
            default:
                System.out.println("❌ Invalid choice.");
        }

        input.close();
    }
}



