// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        QuadratischePyramide pyramide = new QuadratischePyramide(4, 9);
        System.out.println("Höhe der Pyramide: " + pyramide.getHohe());
        System.out.println("Seitenlänge der Grundfläche: " + pyramide.getSeitenlaenge());
        System.out.println("Volumen der Pyramide: " + pyramide.calcVolumen());
    }
}