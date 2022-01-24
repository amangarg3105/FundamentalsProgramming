package oop.composition;


public class StudentRecord {


    public static void main(String[] args) {

        Student student = new Student();

        BankAcount account =
                new BankAcount();

        account.setAccountNumber(1234);
        account.setAccountBalance(10000);

        //Setting bankProperty
        student.setBankAcount(account);


        BankAcount studentAccount =
                student.getBankAcount();

        System.out.println(studentAccount.getAccountBalance());


    }
}
