package Radio;

public class Radio {
    private int id;
    private String name = "rad300";
    public int currentChannel;
    public int currentVolume;
    public int firstChannel = 0;
    private int lastChannel = 9;
    private int min = 0;
    private int max = 100;

    public Radio(int id, String name, int firstChannel, int lastChannel, int min, int max) {
        this.id = id;
        this.name = name;
        this.firstChannel = firstChannel;
        this.lastChannel = lastChannel;
        this.min = min;
        this.max = max;
    }

    public int getId() {
        return this.id;
    }

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

    public void setCurrentVolume1(int currentVolume1) {

        if (currentVolume1 >= min) {
            currentVolume1 = currentVolume1 + 1;
        }
        currentVolume = currentVolume1;
    }


    public void setCurrentVolume2(int currentVolume2) {
        if (currentVolume2 <= max) {
            currentVolume2 = currentVolume2 - 1;
        }
        currentVolume = currentVolume2;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}




