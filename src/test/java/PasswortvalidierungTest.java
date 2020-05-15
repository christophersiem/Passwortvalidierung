import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PasswortvalidierungTest {
    @Test
    public void mindestens8zeichen() {

        //GIVEN
        String mypassword = "ksp8291";

        //WHEN
        String result = Passwortvalidierung.pwcheck(mypassword);

        //THEN
        assertEquals("Bitte verwende mindestens 8 Zeichen", result);
    }

    @Test
    public void mindestens1Zahl() {

        //GIVEN
        String mypassword = "kwjikeee";

        //WHEN
        String result = Passwortvalidierung.pwcheck(mypassword);

        //THEN
        assertEquals("Bitte verwende mindestens eine Zahl", result);


    }
    @Test
    public void mindestens1Großbuchstabe() {

        //GIVEN
        String mypassword = "skAekhr1";

        //WHEN
        String result = Passwortvalidierung.pwcheck(mypassword);

        //THEN
        assertEquals("Passwort erfolgreich gesetzt", result);
    }

}