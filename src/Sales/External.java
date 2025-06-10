package Sales;

public class External extends Seller {
    // Declaring attributes:
    private double traveledDistance;
    private int sellsAmount;

    // Special Methods:
        // Builder:
    public External(String cpf, String name, double salesValues, double baseSalary, double traveledDistance, int sellsAmount) {
        super(cpf, name, salesValues, baseSalary);
        this.traveledDistance = traveledDistance;
        this.sellsAmount = sellsAmount;
    }

        // Getters:
    public double getTraveledDistance() {
        return traveledDistance;
    }

    public int getSellsAmount() {
        return sellsAmount;
    }

        // Setters:
    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setSellsAmount(int sellsAmount) {
        this.sellsAmount = sellsAmount;
    }

        // toString:
    public String toString() {
        return super.toString() +
                ", traveledDistance=" + traveledDistance
                + ", sellsAmount=" + sellsAmount;
    }

    // Behaviour Methods:
    @Override
    public double calcSalary() {
        return super.getBaseSalary() + super.getSalesValues()/sellsAmount + 0.80 * traveledDistance;
    }
}