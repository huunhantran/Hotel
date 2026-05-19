package model;

public class Invoice {
    private String invoiceId;
    private String bookingId;
    private String customerName;
    private String roomNumber;
    private double totalAmount;
    private String paymentDate;

    public Invoice(String invoiceId, String bookingId, String customerName, String roomNumber, double totalAmount, String paymentDate) {
        this.invoiceId = invoiceId;
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.totalAmount = totalAmount;
        this.paymentDate = paymentDate;
    }

    public String getInvoiceId() { return invoiceId; }
    public String getBookingId() { return bookingId; }
    public String getCustomerName() { return customerName; }
    public String getRoomNumber() { return roomNumber; }
    public double getTotalAmount() { return totalAmount; }
    public String getPaymentDate() { return paymentDate; }
}