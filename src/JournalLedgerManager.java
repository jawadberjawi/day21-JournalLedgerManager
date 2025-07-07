import java.util.ArrayList;
import java.util.Scanner;

public class JournalLedgerManager{
public ArrayList<Transaction>transactions;

public JournalLedgerManager(ArrayList<Transaction>transactions){

    this.transactions=transactions;
}
public void printSimpleLedger(){
   System.out.println("Simple Ledger View:");
   for (Transaction t:transactions){
       System.out.println("ID: " + t.getTransactionID() +
               " | Description: " + t.getDescription() +
               " | Amount: " + t.getAmount());


   }
}
    public void filterLedgerMulti(Scanner input){
        System.out.println("\n📚 Multi-Filter Options:");
        System.out.println("1. Filter by Status");
        System.out.println("2. Filter by Created By");
        System.out.println("3. Filter by Min Amount");
        System.out.println("Enter the numbers of filters you want (e.g. 1,2): ");
        String[] choices= input.nextLine().split(",");

        String statusFilter = null;
        String creatorFilter = null;
        double minAmount = -1;

        for (String choice:choices){
            switch (choice.trim()){
                case "1":
                    System.out.print("Enter Status (Approved / Pending / Rejected): ");
                    statusFilter = input.nextLine();
                    break;
                case "2":
                    System.out.println("Enter Created By: ");
                    creatorFilter = input.nextLine();
                    break;

                case "3":
                    System.out.println("Enter Minimum Amount: ");
                    try {
                        minAmount = Double.parseDouble(input.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("❌ Invalid number.");

                    }
                    break;

                default: System.out.println("❌ Unknown filter option: " + choice);


            }



        }
        System.out.println("Filtered Transactions");
        for (Transaction t:transactions){
            boolean match=true;
            if (statusFilter!=null && !t.getStatus().equalsIgnoreCase(statusFilter)){
                match = false;
            }
            if (creatorFilter != null && !t.getCreatedBy().equalsIgnoreCase(creatorFilter)) {
                match = false;
            }

            if (minAmount != -1 && t.getAmount() < minAmount) {
                match = false;
            }

            if (match) {
                t.display();
            }


        }



}





}