abstract class pyramide {
    private double hohe; // Private height attribute

    // Constructor
    public pyramide(double hohe) {
        this.hohe = hohe;
    }

    // Abstract method for volume calculation
    public abstract double calcVolumen();

    // Getter for height
    public double getHohe() {
        return hohe;
    }
}