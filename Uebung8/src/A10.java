
public class A10 {

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 5};
        int[] er = ersetzen(arr, 4, arr.length, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(er[i] + " ");
        }
    }

    public static int[] ersetzen(int[] arr, int x, int index, int ersetzWert) {
        if (index == 0) {
            return arr;
        }
        if (arr[index - 1] == x) {
            arr[index - 1] = ersetzWert;
        }
        return ersetzen(arr, x, index - 1, ersetzWert);
    }
}
