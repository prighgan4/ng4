package Radio;

import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rad = new Radio(1,"rad300",0,9,0,100);

    @Test
    void setCurrentChannel1() {
        rad.setCurrentChannel1(8);

        int expected = 9;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel2() {
        rad.setCurrentChannel2(7);

        int expected = 6;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        rad.setCurrentVolume1(79);

        int expected = 80;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        rad.setCurrentVolume2(80);

        int expected = 79;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}