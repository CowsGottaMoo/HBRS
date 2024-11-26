package Uebung4;

public class ScheffelWeizen {
    public static void main(String[] args) {
        int s = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
    
    
        for (int m = 0; m <= n; m++) {
            for (int f = 0; f <= n - m; f++) {
                int k = n - m - f;
                if (s * 2 == m * 6 + f * 4 + k * 1) { 
                    System.out.println(m + " " + f + " " + k);
                }
            }
        }
    
    }
    }
    