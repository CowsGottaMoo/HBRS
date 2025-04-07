import java.util.Scanner;

public class Caesar{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        // System.out.println("scanner 1");
        int k = Integer.parseInt(scn.nextLine());

        // System.out.println("scanner 2");
        char b = scn.nextLine().charAt(0);


        char x = (char) ('A' + (b - 'A' + k) % 26);
        System.out.println(x);
    }

}