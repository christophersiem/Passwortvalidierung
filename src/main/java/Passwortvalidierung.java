public class Passwortvalidierung {

    public static String pwcheck(String password) {

        //Mindestens 8 Zeichen

        int lengthofpw = password.length();
        if (lengthofpw < 8) {
            return "Bitte verwende mindestens 8 Zeichen";
        }


//        Lösung #1
//        https://beginnersbook.com/2014/08/java-regex-tutorial/
//
//        boolean containsnumber = password.matches(".*\\d.*");

        //Lösung #2
        // Mindestens eine Zahl

        boolean containsnumber = password.contains("1") || password.contains("2") || password.contains("3")
                || password.contains("4") || password.contains("5") || password.contains("6") || password.contains(("7"))
                || password.contains("8") || password.contains("9") || password.contains(("0"));

        if (containsnumber == false) {
            return "Bitte verwende mindestens eine Zahl";
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
            return "Bitte verwende mind einen Klein und einen Großbuchstaben";

        } else return "Passwort erfolgreich gesetzt";
    }
}
