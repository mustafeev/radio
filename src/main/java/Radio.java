public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 9;
    }

    public void Radio() {
        maxVolume = 10;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public void Radio(int volumeCount) {
        maxStation = volumeCount - 1;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {

            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume1() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void prevVolume1() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }
}