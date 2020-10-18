package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio station = new Radio(1000, 100);

    @Test
    public void InitRadio() {
        station.setMinRadioStation(0);
        assertEquals(0, station.getMinRadioStation());
        station.setMaxRadioStation(station.getMaxRadioStation());
        assertEquals(1000, station.getMaxRadioStation());
        station.setMinVolume(0);
        assertEquals(0, station.getMinVolume());
        station.setMaxVolume(station.getMaxVolume());
        assertEquals(100, station.getMaxVolume());

    }

    @Test
    public void shouldSetRadioStation() {
        station.setCurrentRadioStation(6);
        assertEquals(6, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMaxLimit() {
        station.setCurrentRadioStation(station.getMaxRadioStation()+1);
        assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMinLimit() {
        station.setCurrentRadioStation(-1);
        assertEquals(0, station.getCurrentRadioStation());
    }


    @Test
    public void shouldSetNextRadioStation() {
        station.setCurrentRadioStation(6);
        station.nextCurrentRadioStation();
        assertEquals(7, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        station.setCurrentRadioStation(6);
        station.prevCurrentRadioStation();
        assertEquals(5, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStationOverLimit() {
        station.setCurrentRadioStation(station.getMaxRadioStation());
        station.nextCurrentRadioStation();
        assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStationOverLimit() {
        station.setCurrentRadioStation(0);
        station.prevCurrentRadioStation();
        assertEquals(station.getMaxRadioStation(), station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        station.setCurrentVolume(9);
        assertEquals(9, station.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeOverMaxLimit() {
        station.setCurrentVolume(station.getMaxVolume()+1);
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeOverMinLimit() {
        station.setCurrentRadioStation(-1);
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        station.setCurrentVolume(6);
        station.nextCurrentVolume();
        assertEquals(7, station.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        station.setCurrentVolume(6);
        station.prevCurrentVolume();
        assertEquals(5, station.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolumeOverLimit() {
        station.setCurrentVolume(station.getMaxVolume());
        station.nextCurrentVolume();
        assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeOverLimit() {
        station.setCurrentVolume(-1);
        station.prevCurrentVolume();
        assertEquals(0, station.getCurrentVolume());
    }

}
