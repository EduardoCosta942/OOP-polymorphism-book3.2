package Sales;

public class Seller {
    // Declaring attributes:
    private String cpf;
    private String name;
    private double salesValues;
    private double baseSalary;

    // Special Methods:
        // Builder Method:
    public Seller(String cpf, String name, double salesValues, double baseSalary) {
        this.cpf = cpf;
        this.name = name;
        this.salesValues = salesValues;
        this.baseSalary = baseSalary;
    }

        // Getters:
    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }
    public double getSalesValues() {
        return salesValues;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

        // Setters:

    public void setName(String name) {
        this.name = name;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

        // ToString:

    @Override
    public String toString() {
        return "Seller{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", salesValues=" + salesValues +
                ", baseSalary=" + baseSalary +
                '}';
    }

    // behavior Methods:
    public double calcSalary() {
        return baseSalary;
    }

    public double calcSalary(double extra) {
        return baseSalary + extra;
    }

    public boolean riseBaseSalary(double toAdd) {
        if (toAdd > 0) {
            baseSalary+=toAdd;
            return true;
        }
        return false;
    }
}
