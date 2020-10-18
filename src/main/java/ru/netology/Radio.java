package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public Radio(int maxRadioStation, int maxVolume) {
        this.maxRadioStation = maxRadioStation;
        this.maxVolume = maxVolume;
    }



    // Блок радиостанций

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else currentRadioStation++;
    }

    public void prevCurrentRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else currentRadioStation--;
    }

    // Блок громкости

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextCurrentVolume() {
        this.currentVolume++;
    }

    public void prevCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }

}
