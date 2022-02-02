package ru.netology;

public class RadioService {
    private int id;
    private String name = "Radio-box";
    private int currentStation = 0;
    private int firstStation = 0;
    private int amountStation = 10;
    private int lastStation = amountStation - 1;
    private int currentSoundVolume = 0;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public RadioService() {
    }

    public RadioService(int amountStation) {
        this.amountStation = amountStation;
    }


    public int getCurrentStation() {
        return currentStation;
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

    public void setAmountStation() {
        this.amountStation = amountStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
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

    public void setCurrentStation(int currentStation) {
        if (currentStation < firstStation) {
            currentStation = firstStation;
        }
        if (currentStation > amountStation - 1) {
            currentStation = amountStation - 1;
        }
        this.currentStation = currentStation;
    }


    public void setCurrentStationWithNextButton() {
        if (currentStation >= amountStation - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void setCurrentStationWithPrevButton() {
        if (currentStation <= firstStation) {
            currentStation = amountStation - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
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
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume + 1;
    }

    public void setCurrentSoundVolumeWithPrevButton() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }
}
