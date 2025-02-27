abstract class pyramide {
    private double hohe;


    public pyramide(double hohe) {
        this.hohe = hohe;
    }

    public abstract double calcVolumen();
    public abstract double calcOberflaeche();


    public double getHohe() {
        return hohe;
    }
}