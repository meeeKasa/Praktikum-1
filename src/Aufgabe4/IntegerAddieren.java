package Aufgabe4;
/*

Schreiben Sie ein C-Programm, das zwei Integerzahlen (Typ int) einliest und addiert.

Programm Bereichsüberschreitungen

Geben Sie bitte zwei Integerzahlen ein: x, y
Die Summe von x und y ist: _______


Experimentieren Sie mit sehr großen Werten und erläutern Sie, welche Effekte auftreten und
woran das liegt. Welchen Größenbereich verkraftet int auf unserer Maschine? Zeigen Sie dies
unter Verwendung von sizeof.
Bitte fügen Sie Ihre Erkenntnisse als Kommentarblock in Ihr
Java-Programm ein.

*/


import java.util.Scanner;


public class IntegerAddieren {
    public static void main(String[] args) {


        // Nutzer wird aufgefordert beliebige Zahlen für x und y anzugeben
        System.out.println(" Geben Sie bitte zwei Integerzahlen ein : x und y ");


        Scanner scanner = new Scanner(System.in);
        // Zwei Integerzahlen x und y werden eingelesen
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        // Berechnung der Summe beider Zahlen
        int Summe = x + y;


        // Ausgabe der Summe
        System.out.println("Die Summe von x und y ist: " + Summe);
    }
}