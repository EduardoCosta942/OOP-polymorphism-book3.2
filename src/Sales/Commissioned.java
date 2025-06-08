package Sales;

public class Commissioned extends Seller{
    // Declaring attributes:
    private double commissionPercentual;

    // Builder Method:
    public Commissioned(String cpf, String name, double salesValues, double baseSalary, double commissionPercentual) {
        super(cpf, name, salesValues, baseSalary);
        this.commissionPercentual = commissionPercentual;
    }


    // Special Methods:
        // Getters:
    public double getCommissionPercentual() {
        return commissionPercentual;
    }

        // Setters:
    public void setCommissionPercentual(double commissionPercentual) {
        this.commissionPercentual = commissionPercentual;
    }

        // toString():

    @Override
    public String toString() {
        return super.toString() + "Comissioned{" +
                "commissionPercentual=" + commissionPercentual +
                '}';
    }

    // Behavior methods:
    @Override
    public double calcSalary() {
        return super.getBaseSalary() + commissionPercentual * super.getSalesValues();
    }
}
