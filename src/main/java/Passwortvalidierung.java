public class Passwortvalidierung {


    //Mindestens 8 Zeichen

    public static String pwcheck8zeichen(String password) {
        int a = 0;
        int lengthofpw = password.length();

        if (lengthofpw < 8) {
            return "Bitte verwende mindestens 8 Zeichen";

        } return "Das Passwort hat 8 Zeichen";

    }

    // Mindestens eine Zahl

    public static String pwCheckEineZahl(String password) {

        boolean containsnumber = password.contains("1") || password.contains("2") || password.contains("3")
                || password.contains("4") || password.contains("5") || password.contains("6") || password.contains(("7"))
                || password.contains("8") || password.contains("9") || password.contains(("0"));

        if (!containsnumber) {
            return "Bitte verwende mindestens eine Zahl";

        } return "Das Passwort hat mind. eine Zahl";
    }

    // Mindestens ein Großbuchstabe

    public static String pwCheckEinGroßbuchstabe(String password) {


        char ch;
        boolean capital = false;
        boolean lower = false;

        for (
                int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                capital = true;
            } else if (Character.isLowerCase(ch)) {
                lower = true;
            }
        }
        if (!capital || !lower) {
            return "Bitte verwende mind einen Klein und einen Großbuchstaben";

        }
        return "Das Passwort hat mind. ein Groß und Kleinbuchstaben";

    }

}
