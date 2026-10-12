/*
 * Name: Natalia Carbajal
 * Date: 10/11/2026
 * Assignment: Module 10.2 (Make up Module 11.3)
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    public Division(String name, int number) {
        divisionName = name;
        accountNumber = number;
    }

    protected void showBasicInfo() {
        System.out.println("Division: " + divisionName);
        System.out.println("Account #: " + accountNumber);
    }

    public abstract void display();
}