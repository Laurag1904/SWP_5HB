package NamespacingInnerType;

import java.util.Random;

public class generatePassword { //aufgabe 4

    public String generatePassword(int length) {

        // Lokale Klasse
        class PasswortErsteller {

            private final String buchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            private final String zahlen = "0123456789";
            private final String sonderzeichen = "!@#$%^&*()-_=+<>?";
            private final String alleZeichen = buchstaben + zahlen + sonderzeichen;

            public String erstellen() {
                Random rand = new Random();
                StringBuilder pw = new StringBuilder();

                for (int i = 0; i < length; i++) {
                    int index = rand.nextInt(alleZeichen.length());
                    pw.append(alleZeichen.charAt(index));
                }

                return pw.toString();
            }
        }

        PasswortErsteller ersteller = new PasswortErsteller();
        return ersteller.erstellen();
    }

    public static void main(String[] args) {
        generatePassword p = new generatePassword();
        String passwort = p.generatePassword(12); // Beispiel: Passwort mit 12 Zeichen
        System.out.println("Generiertes Passwort: " + passwort);
    }
}