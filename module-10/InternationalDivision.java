/*
 * Name: Natalia Carbajal
 * Date: 10/11/2026
 * Assignment: Module 10.2 (Make up Module 11.3)
 */

public class InternationalDivision extends Division {

    private String country;
    private String language;

    public InternationalDivision(String name, int number,
                                 String country, String language) {
        super(name, number);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("[International Division]");
        showBasicInfo();
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("--------------------");
    }
}