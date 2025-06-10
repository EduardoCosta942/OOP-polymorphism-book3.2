import Sales.*;

public class Main {
    public static void main(String[] args) {
        // Instantiating classes:
        Seller seller = new Seller("123.456.789-00", "Rei", 15000.0, 2500.0);
        External externalSeller = new External("987.654.321-99", "Ana", 20000.0, 3000.0, 250.0, 45);
        Commissioned commissionedSeller = new Commissioned("555.666.777-88", "Lucas", 18000.0, 2800.0, 7.5);

        // Printing all the objects:
        System.out.println("-----------------------------" + "\nPrinting all the objects: \n"
                +seller + "\n" + externalSeller + "\n" + commissionedSeller + "\n-----------------------------");

        // Rising their base salaries:
        seller.riseBaseSalary(1000);
        externalSeller.riseBaseSalary(1000);
        commissionedSeller.riseBaseSalary(1000);
        System.out.println("-----------------------------" + "\nPrinting their new baseSalaries: \n"
                +seller.getBaseSalary() + "\n" + externalSeller.getBaseSalary() + "\n"
                + commissionedSeller.getBaseSalary() + "\n-----------------------------");

        // Printing their calculated salaries:
        System.out.println("-----------------------------" + "\nPrinting their salaries: \n"
                +seller.calcSalary(321) + "\n" + externalSeller.calcSalary() + "\n"
                + commissionedSeller.calcSalary() + "\n-----------------------------");

    }
}
