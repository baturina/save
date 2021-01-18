package domain;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setNextCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }



    @Test
    public void shouldSetBeforeStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPreviewCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPreviewCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int actual = radio.getCurrentVolume();
        int expected = 3;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setIncreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }


@Test
    public void shouldSetIncreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setIncreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }


}