package ru.netology;

public class RadioService {
    private int id;
    private String name = "Radio-box";
    private int currentStation = 0;
    private int firstStation = 0;
    private int amountStation = 10;
    private int currentSoundVolume = 0;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public RadioService() {
    }

    public RadioService(int id, String name, int currentStation, int amountStation, int currentSoundVolume, int maxSoundVolume) {
        this.id = id;
        this.name = name;
        this.currentStation = currentStation;
        this.amountStation = amountStation;
        this.currentSoundVolume = currentSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation() {
        this.firstStation = firstStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume() {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public void setCurrentStation  () {
        if (currentStation < firstStation) {
            currentStation = firstStation;
        }
        if (currentStation > amountStation - 1) {
            currentStation = amountStation -1;
        }
        this.currentStation = currentStation;
    }


    public void setCurrentStationWithNextButton() {
        if (currentStation >= amountStation -1){
            currentStation = 0;
        }
        else {
            currentStation = currentStation + 1;
        }
    }
    public void setCurrentStationWithPrevButton() {
        if (currentStation <= firstStation){
            currentStation = amountStation -1;
        }
        else {
            currentStation = currentStation -1;
        }
    }


    public void setCurrentSoundVolume() {
        if (currentSoundVolume < minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
            return;
        }
        if (currentSoundVolume > maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void setCurrentSoundVolumeWithNextButton() {
        if (currentSoundVolume == maxSoundVolume){
            return;
        }
        this.currentSoundVolume = currentSoundVolume + 1;
    }

    public void setCurrentSoundVolumeWithPrevButton() {
        if (currentSoundVolume == minSoundVolume){
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }
}
