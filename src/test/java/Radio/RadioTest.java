package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentChannel1() {
        Radio rad = new Radio();
        rad.setCurrentChannel1(9);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel2() {
        Radio rad = new Radio();
        rad.setCurrentChannel2(0);

        int expected = 9;
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
