import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PasswortvalidierungTest {
    @Test
    public void mindestens8zeichen() {

        //GIVEN
        String mypassword = "ksA8291";

        //WHEN
        String result = Passwortvalidierung.pwcheck8zeichen(mypassword);

        //THEN
        assertEquals("Bitte verwende mindestens 8 Zeichen", result);
    }

    @Test
    public void mindestens1Zahl() {

        //GIVEN
        String mypassword = "kwjikeee";

        //WHEN
        String result = Passwortvalidierung.pwCheckEineZahl(mypassword);

        //THEN
        assertEquals("Bitte verwende mindestens eine Zahl", result);


    }
    @Test
    public void mindestens1Großbuchstabe() {

        //GIVEN
        String mypassword = "sksekhr1";

        //WHEN
        String result = Passwortvalidierung.pwCheckEinGroßbuchstabe(mypassword);

        //THEN
        assertEquals("Bitte verwende mind einen Klein und einen Großbuchstaben", result);
    }

    @Test
    public void allesSuper (){

        //GIVEN
        String mypassword = "123abcDE";

        //WHEN
        String result = Passwortvalidierung.pwcheck8zeichen(mypassword);

        //THEN
        assertEquals("passt", result);
    }

}