/*
 * Name: Natalia Carbajal
 * Date: 10/11/2026
 * Assignment: Module 10.2 (Make up Module 11.3)
 */

public class DomesticDivision extends Division {

    private String state;

    public DomesticDivision(String name, int number, String state) {
        super(name, number);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("[Domestic Division]");
        showBasicInfo();
        System.out.println("State: " + state);
        System.out.println("--------------------");
    }
}