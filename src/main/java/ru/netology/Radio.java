package ru.netology;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    // Блок радиостанций
    public int getMinRadioStation (){
        return minRadioStation;
    }
    public void setMinRadioStation (int minRadioStation){
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation (){
        return maxRadioStation;
    }
    public void setMaxRadioStation (int maxRadioStation){
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation(){
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation){
        if (currentRadioStation > maxRadioStation){
            return;
        }
        if (currentRadioStation < minRadioStation){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation(){
        if (currentRadioStation == maxRadioStation){
            currentRadioStation = minRadioStation;
        }
        else currentRadioStation++;
    }

    public void prevCurrentRadioStation(){
        if (currentRadioStation == minRadioStation){
            currentRadioStation = maxRadioStation;
        }
        else currentRadioStation--;
    }

    // Блок громкости

    public int getMinVolume(){
        return minVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            return;
        }
        if (currentVolume < minVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextCurrentVolume(){
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }
    public void prevCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }

}
