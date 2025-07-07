import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transaction> myList = new ArrayList<>();

        myList.add(new Transaction("T001", LocalDate.now(), "Laptop Purchase", 1001, 2001, 1200.0, 12345, "Expense", "Jawad", "Approved"));
        myList.add(new Transaction("T002", LocalDate.now(), "Service Revenue", 2002, 1002, 800.0, 12346, "Revenue", "Ahmad", "Pending"));
        myList.add(new Transaction("T003", LocalDate.now(), "Office Supplies", 1003, 2003, 300.0, 12347, "Expense", "Jawad", "Approved"));
        myList.add(new Transaction("T004", LocalDate.now(), "Consulting Fee", 2004, 1004, 600.0, 12348, "Revenue", "Sara", "Rejected"));

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



