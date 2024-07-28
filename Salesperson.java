public class Salesperson {
    private int salespersonID;
    private double salesAmount;

    public Salesperson(int salespersonID, double salesAmount) {
        this.salespersonID = salespersonID;
        this.salesAmount = salesAmount;
    }

    public int getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(int salespersonID) {
        this.salespersonID = salespersonID;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "salespersonID=" + salespersonID +
                ", salesAmount=" + salesAmount +
                '}';
    }

}
