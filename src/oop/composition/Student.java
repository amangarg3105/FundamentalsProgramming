package oop.composition;


public class Student {


    private int rollNumber;

    private BankAcount bankAcount;


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public BankAcount getBankAcount() {
        return bankAcount;
    }

    public void setBankAcount(BankAcount bankAcount) {
        this.bankAcount = bankAcount;
    }
}
