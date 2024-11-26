
public class Aufgabe3 {

    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 2;
        array[3] = 4;
        array[4] = 3;
        array[5] = 2;
        int wert = 2;
        arrayDrehen2(array);
        System.out.println(findeAnzahl(array, wert));
    }

    public static int findeAnzahl(int[] feld, int wert) {
        int counter = 0;
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == wert) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] arrayDrehen(int[] feld) {
        int[] neu = new int[feld.length];
        for (int i = 0; i < feld.length; i++) {
            neu[i] = feld[feld.length - 1 - i];
        }
        return neu;
    }

    public static int[] arrayDrehen2(int[] feld) {
        for (int i = 0; i < feld.length / 2; i++) {
            int temp = feld[i];
            feld[i] = feld[feld.length - 1 - i];
            feld[feld.length - 1 - i] = temp;
        }
        return feld;
    }
}
