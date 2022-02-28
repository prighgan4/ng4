package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rad = new Radio(1,"rad300",0,9,0,100);

    @Test
    void setCurrentChannel1() {
        rad.setCurrentChannel1(9);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel2() {
        rad.setCurrentChannel2(0);

        int expected = 9;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        rad.setCurrentVolume1(1);

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        rad.setCurrentVolume2(10);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
