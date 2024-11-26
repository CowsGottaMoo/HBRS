package Uebung4;

import java.util.Scanner;

public class DatumErweiterung {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int j = scn.nextInt();
        int m = scn.nextInt();
        int t = scn.nextInt();
        int s = scn.nextInt();
        int m1 = scn.nextInt();
        int m2 = scn.nextInt();
        scn.close();
        int tageMonat = 0;

        int m3 = (m1 + m2) % 60;
        int s1 = s + (m1 + m2) / 60;

        if (s1 >= 24) {
            s1 -= 24;
            t++;
        }

        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                tageMonat = 31;
                break;
            case 4: case 6: case 9: case 11:
                tageMonat = 30;
                break;
            case 2:
                tageMonat = 28;
                break;
        }

        if (t > tageMonat) {
            t = 1;
            m++;
        }

        if (m > 12) {
            m = 1;
            j++;
        }

        System.out.println(j + " " + m + " " + t + " " + s1 + " " + m3);
    }

}
