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

    @Override
    public double calcOberflaeche() {
        double grundflaeche = seitenlaenge * seitenlaenge;
        double schraegHoehe = Math.sqrt(Math.pow(seitenlaenge / 2, 2) + Math.pow(getHohe(), 2));
        double dreiecksfläche = (1.0 / 2) * seitenlaenge * schraegHoehe;
        return grundflaeche + 4 * dreiecksfläche;
    }


    public double getSeitenlaenge() {
        return seitenlaenge;
    }
}
