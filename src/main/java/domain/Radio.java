package domain;

 public class Radio {


     private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {

            this.currentStation = minStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = maxStation;


            return;
        }

        this.currentStation = currentStation;

    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setNextCurrentStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void setPreviewCurrentStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }

        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;

        }

        this.currentVolume = currentVolume;
    }


    public void setIncreaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }


    public void setDecreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }
}
