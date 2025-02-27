class quadratPyramide extends pyramide {
    private double seitenlaenge;


    public quadratPyramide(double seitenlaenge, double hohe) {
        super(hohe);
        this.seitenlaenge = seitenlaenge;
    }

    @Override
    public double calcVolumen() {
        return (1.0 / 3) * (seitenlaenge * seitenlaenge) * getHohe();
    }

    public double getSeitenlaenge() {
        return seitenlaenge;
    }
}
