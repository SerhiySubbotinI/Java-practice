package ua.javaPractice.task22;

public class Customer {
    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private double customerAmountOfMoney;

    public Customer(int customerId, String customerFirstName, String customerLastName, double customerAmountOfMoney) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAmountOfMoney = customerAmountOfMoney;
    }

    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setCustomerAmountOfMoney(double customerAmountOfMoney) {
        this.customerAmountOfMoney = customerAmountOfMoney;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", customer_FirstName='" + customerFirstName + '\'' +
                ", customer_LastName='" + customerLastName + '\'' +
                ", customer_AmountOfMoney=" + customerAmountOfMoney +
                '}';
    }
}
