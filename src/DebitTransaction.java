import java.time.LocalDate;

public class DebitTransaction extends Transaction {
    private String purpose;

    public DebitTransaction(
            String transactionID,
            LocalDate date,
            String description,
            double debitAccount,
            double amount,
            int referenceNumber,
            String createdBy,
            String status,
            String purpose
    ) {
        // Call parent constructor with "DEBIT" type and creditAccount = 0.0
        super(transactionID, date, description, debitAccount, 0.0, amount,
                referenceNumber, "DEBIT", createdBy, status);

        // Set purpose specific to this class
        this.purpose = purpose;
    }

    @Override
    public void display() {
        super.display(); // Display shared fields
        System.out.println("Purpose: " + purpose); // Display specific field
    }
}
