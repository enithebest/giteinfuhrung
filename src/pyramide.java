abstract class pyramide {
    private double hohe;


    public pyramide(double hohe) {
        this.hohe = hohe;
    }

    public abstract double calcVolumen();

    // Getter for height
    public double getHohe() {
        return hohe;
    }
}