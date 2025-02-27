
// Subclass for a pyramid with a square base
class QuadratischePyramide extends pyramide {
    private double seitenlaenge; // Side length of the base

    // Constructor
    public QuadratischePyramide(double seitenlaenge, double hohe) {
        super(hohe);
        this.seitenlaenge = seitenlaenge;
    }

    // Implement volume calculation
    @Override
    public double calcVolumen() {
        return (1.0 / 3) * (seitenlaenge * seitenlaenge) * getHohe();
    }

    // Getter for side length
    public double getSeitenlaenge() {
        return seitenlaenge;
    }
}