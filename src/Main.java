public class Main {
    public static void main(String[] args) {
        quadratPyramide pyramide = new quadratPyramide(4, 9);
        System.out.println("Quadratische Pyramide:");
        System.out.println("Höhe: " + pyramide.getHohe());
        System.out.println("Seitenlänge: " + pyramide.getSeitenlaenge());
        System.out.println("Volumen: " + pyramide.calcVolumen());
        System.out.println("Oberfläche: " + pyramide.calcOberflaeche());
    }
}