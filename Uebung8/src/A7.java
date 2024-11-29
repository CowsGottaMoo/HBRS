
public class A7 {

    public static void main(String[] args) {
        double[] arr = {2, 1, 3, 3, 4, 5};
        System.out.println("arithemetischer Mittelwert: " + arithemtischenMittelwert(arr));
        System.out.println("harmonischer Mittelwert: " + harmonischenMittelwert(arr));
        System.out.println("Standardabweichung: " + standardabweichung(arr));
    }

    public static double arithemtischenMittelwert(double[] array) {
        double summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe / array.length;
    }

    public static double harmonischenMittelwert(double[] array) {
        double summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += 1 / array[i];
        }
        return array.length / summe;
    }

    public static double standardabweichung(double[] array) {
        double summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += Math.pow(array[i] - arithemtischenMittelwert(array), 2);
        }
        summe = summe / (array.length - 1);
        return Math.sqrt(summe);
    }
}
