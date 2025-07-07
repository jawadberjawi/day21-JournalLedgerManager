import java.time.LocalDate;

public class CreditTransaction extends Transaction {
    private String source;

    public CreditTransaction(
            String transactionID,
            LocalDate date,
            String description,
            double creditAccount,
            double amount,
            int referenceNumber,
            String createdBy,
            String status,
            String source
    ) {
        // Call parent constructor with "CREDIT" type and debitAccount = 0.0
        super(transactionID, date, description, 0.0, creditAccount, amount,
                referenceNumber, "CREDIT", createdBy, status);

        // Set source specific to this class
        this.source = source;
    }

    @Override
    public void display() {
        super.display(); // Display shared fields
        System.out.println("Source: " + source); // Display specific field
    }
}
