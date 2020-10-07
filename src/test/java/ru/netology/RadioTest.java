package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio station = new Radio();

    @Test
    public void InitRadio() {
        station.setMinRadioStation(0);
        assertEquals(0, station.getMinRadioStation());
        station.setMaxRadioStation(10);
        assertEquals(10, station.getMaxRadioStation());
        station.setMinVolume(0);
        assertEquals(0, station.getMinVolume());
        station.setMaxVolume(10);
        assertEquals(10, station.getMaxVolume());

    }

    @Test
    public void shouldSetRadioStation() {
        station.setCurrentRadioStation(6);
        assertEquals(6, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMaxLimit() {
        station.setCurrentRadioStation(11);
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
        station.setCurrentRadioStation(9);
        station.nextCurrentRadioStation();
        assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStationOverLimit() {
        station.setCurrentRadioStation(0);
        station.prevCurrentRadioStation();
        assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        station.setCurrentVolume(9);
        assertEquals(9, station.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeOverMaxLimit() {
        station.setCurrentVolume(11);
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
        station.setCurrentVolume(10);
        station.nextCurrentVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeOverLimit() {
        station.setCurrentVolume(-1);
        station.prevCurrentVolume();
        assertEquals(0, station.getCurrentVolume());
    }

}
