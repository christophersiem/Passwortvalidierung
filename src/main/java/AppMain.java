import java.util.Scanner;

public class AppMain {


    public static void main(String[] args) {

        String password = "123";

        System.out.println(Passwortvalidierung.pwcheck8zeichen(password));
        System.out.println(Passwortvalidierung.pwCheckEineZahl(password));
        System.out.println(Passwortvalidierung.pwCheckEinGroßbuchstabe(password));
    }
}

