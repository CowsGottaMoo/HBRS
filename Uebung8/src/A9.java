
public class A9 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean er = istenthalten(arr, 1, arr.length);
        System.out.println(er);
    }

    public static boolean istenthalten(int[] arr, int x, int index) {
        if (index == 0) {
            return false;
        }
        if (arr[index - 1] == x) {
            return true;
        } else {
            return istenthalten(arr, x, index - 1);
        }
    }
}
