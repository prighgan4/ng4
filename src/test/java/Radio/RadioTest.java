package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentChannel1() {
        Radio rad = new Radio();
        rad.setCurrentChannel1(8);

        int expected = 9;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel2() {
        Radio rad = new Radio();
        rad.setCurrentChannel2(7);

        int expected = 6;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume1(1);

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume2(10);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
