public class Main {
    public static void main(String[] args) {
        quadratPyramide pyramide = new quadratPyramide(4, 9);
        System.out.println("Höhe der Pyramide: " + pyramide.getHohe());
        System.out.println("Seitenlänge der Grundfläche: " + pyramide.getSeitenlaenge());
        System.out.println("Volumen der Pyramide: " + pyramide.calcVolumen());
    }
}