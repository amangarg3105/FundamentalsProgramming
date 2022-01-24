package oop.foodordering;


public class Bill {


    private long invoiceId;

    private Order order;

    private long transactionId;

    private User user;

    private String paymentMode;


    public Bill(long invoiceId, Order order, long transactionId, User user, String paymentMode) {
        this.invoiceId = invoiceId;
        this.order = order;
        this.transactionId = transactionId;
        this.user = user;
        this.paymentMode = paymentMode;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public Order getOrder() {
        return order;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public User getUser() {
        return user;
    }

    public String getPaymentMode() {
        return paymentMode;
    }
}
