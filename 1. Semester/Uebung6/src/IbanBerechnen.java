import java.util.Scanner;

public class IbanBerechnen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String laenderkennung = sc.next();
        String bankleitzahl = sc.next();
        String kontonummer = sc.next();
        sc.close();

        String iban = erzeugeIban(laenderkennung, bankleitzahl, kontonummer);
        System.out.println(iban);
    }

    public static String erzeugeIban(String laenderkennung, String blz, String nummer) {
        laenderkennung = laendercodeNormalisierung(laenderkennung);
        nummer = kontonummerNormalisierung(nummer);
        String bban = bbanErzeugen(blz, nummer, laenderkennung);
        int moduloWert = modulo97(bban, laenderkennung);
        String moduloString = Integer.toString(moduloWert);
        if (moduloWert < 10) {
            moduloString = "0" + moduloString;
        }
        laenderkennung = laenderkennung + moduloString;
        String iban = laenderkennung + blz + nummer;
        return iban;
    }

    public static String laendercodeNormalisierung(String eingabe) {
        String ausgabe = eingabe.toUpperCase();
        return ausgabe;
    }

    public static String kontonummerNormalisierung(String eingabe) {
        String ausgabe = eingabe;
        if (eingabe.length() < 10) {
            int anzahlNullen = 10 - eingabe.length();
            while (anzahlNullen > 0) {
                ausgabe = "0" + ausgabe;
                anzahlNullen--;
            }
        }
        return ausgabe;
    }

    public static String bbanErzeugen(String bankleitzahl, String kontonummer, String laenderkennung) {
        String ausgabe = bankleitzahl + kontonummer;
        int buchstabe1 = zahlenCodierung(laenderkennung.charAt(0));
        int buchstabe2 = zahlenCodierung(laenderkennung.charAt(1));
        ausgabe = ausgabe + buchstabe1 + buchstabe2 + "00";
        return ausgabe;
    }

    public static int zahlenCodierung(char eingabe) {
        int ziffer = eingabe - 'A' + 1;
        int ausgabe = ziffer + 9;
        return ausgabe;
    }

    public static int modulo97(String bban, String laenderkennung) {
        String tmp = bban;
        long moduloWert = 0;
        int ausgabe;

        while (tmp.length() > 0) {
            String substring;
            if (tmp.length() > 9) {
                substring = tmp.substring(0, 9);
            } else {
                substring = tmp;
            }

            moduloWert = Long.parseLong(substring) % 97;
            String rest = tmp.substring(substring.length());
            tmp = Long.toString(moduloWert) + rest;
            if (rest.length() == 0) {
                break;
            }
        }

        ausgabe = 98 - (int) moduloWert;
        return ausgabe;
    }
}
