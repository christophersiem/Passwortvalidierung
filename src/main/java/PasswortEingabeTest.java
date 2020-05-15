import java.util.Scanner;

public class PasswortEingabeTest {


    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String password;
        System.out.println("Wähle ein Passwort");
        password = myObj.nextLine();

        int lengthofpw = password.length();
        if (lengthofpw < 8) {
            System.out.println("Bitte verwende mindestens 8 Zeichen");
        }

        boolean containsnumber = password.contains("1") || password.contains("2") || password.contains("3")
                || password.contains("4") || password.contains("5") || password.contains("6") || password.contains(("7"))
                || password.contains("8") || password.contains("9") || password.contains(("0"));

        if (containsnumber == false) {
            System.out.println("Bitte verwende mindestens eine Zahl");
        }
//        // Mindestens ein Großbuchstabe

        int anzahlGroßbuchstaben = 0;
        char ch;
        boolean capital = false;
        boolean lower = false;

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                capital = true;
            } else if (Character.isLowerCase(ch)) {
                lower = true;
            }
        }
        if (capital == false || lower == false) {
            System.out.println("Bitte verwende mind einen Klein und einen Großbuchstaben");

        } else System.out.println("Passwort erfolgreich gesetzt");


    }

    }
