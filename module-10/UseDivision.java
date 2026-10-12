/*
 * Name: Natalia Carbajal
 * Date: 10/11/2026
 * Assignment: Module 10.2 (Make up Module 11.3)
 */

public class UseDivision {

    public static void main(String[] args) {

        Division[] divisions = {
            new InternationalDivision(
                    "Asia Pacific", 3145, "South Korea", "Korean"),
            new InternationalDivision(
                    "Northern Europe", 6283, "Sweden", "Swedish"),
            new DomesticDivision(
                    "Pacific Coast", 4721, "Oregon"),
            new DomesticDivision(
                    "Great Lakes", 8562, "Michigan")
        };

        System.out.println("COMPANY DIVISION REPORT");
        System.out.println("=======================");

        for (Division division : divisions) {
            division.display();
        }
    }
}
