package Radio;

public class Radio {
    public int currentChannel;
    int firstChannel = 0;
    int lastChannel = 9;


    public void setCurrentChannel1(int next) {
        if (next >= firstChannel) {
            next = next + 1;
        }

        if (next > lastChannel) {
            next = firstChannel;
        }
        currentChannel = next;
    }

    public void setCurrentChannel2(int prev) {
        if (prev <= lastChannel) {
            prev = prev - 1;
        }

        if (prev < firstChannel) {
            prev = lastChannel;
        }
        currentChannel = prev;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int currentVolume;
    int firstVolume = 1;
    int lastVolume = 10;

    public void setCurrentVolume1(int currentVolume1) {

        if (currentVolume1 >= firstVolume) {
            currentVolume1 = currentVolume1 + 1;
        }
        currentVolume = currentVolume1;
    }


    public void setCurrentVolume2(int currentVolume2) {
        if (currentVolume2 <= lastVolume) {
            currentVolume2 = currentVolume2 - 1;
        }
        currentVolume = currentVolume2;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
