public class Passwortvalidierung {

    public static String pwcheck(String password) {

        //Mindestens 8 Zeichen
        int lengthofpw = password.length();
        if (lengthofpw < 8) {
            return "Bitte verwende mindestens 8 Zeichen";
        }

        //Mindestens eine Zahl

        boolean containsnumber = Character.isUpperCase()

        if (containsnumber == false) {
            return "Bitte verwende mindestens eine Zahl";
        }
        // Mindestens ein Großbuchstabe

        boolean containscapital == password.contains(char.Upper);


        else {
            return "Passwortwahl erfolgreich :)";
        }


    }
}