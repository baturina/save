package domain;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


        @Test
        public void shouldSetCurrentStation() {
            Radio radio = new Radio();
            radio.setCurrentStation(8);
            int actual = radio.getCurrentStation();
            int expected = 8;

            assertEquals(expected, actual);
        }


        @Test
        public void RadioCurrentStation () {
            Radio radio = new Radio(15, 11, 30);
            int actual = radio.getCurrentStation();
            int expected = 11;
            assertEquals(expected, actual);
        }
        @Test
        public void RadioMaxStation () {
            Radio radio = new Radio(8, 8, 8);
            int actual = radio.getMaxStation();
            int expected = 8;
            assertEquals(expected, actual);
        }
        @Test
        public void RadioCurrentVolume () {
            Radio radio = new Radio(20, 1, 40);
            int actual = radio.getCurrentVolume();
            int expected = 40;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentStationHigherMax() {
            Radio radio = new Radio();
            radio.setCurrentStation(20);
            int actual = radio.getCurrentStation();
            int expected = 20;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetNextStationMax() {
            Radio radio = new Radio();
            radio.setCurrentStation(20);
            radio.setNexCurrentStation();
            int actual = radio.getCurrentStation();
            int expected = 0;
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetNextStationMax1() {
            Radio radio = new Radio(20, 20, 30);
            radio.setNexCurrentStation();
            int actual = radio.getCurrentStation();
            int expected = 0;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetNextStationMin() {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.setNexCurrentStation();
            int actual = radio.getCurrentStation();
            int expected = 1;

            assertEquals(expected, actual);
        }



        @Test
        public void shouldSetPrevCurrentStationMax() {
            Radio radio = new Radio();
            radio.setCurrentStation(19);
            radio.setPrevCurrentStation();
            int actual = radio.getCurrentStation();
            int expected = 19;
            assertEquals(expected, actual);

        }

        @Test
        public void shouldSetPrevStationMin() {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.setPrevCurrentStation();
            int actual = radio.getCurrentStation();
            int expected = 20;

            assertEquals(expected, actual);
        }


        @Test
        public void shouldSetCurrentVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(9);
            int actual = radio.getCurrentVolume();
            int expected = 9;

            assertEquals(expected, actual);
        }


        @Test
        public void shouldSetIncreaseCurrentVolumeMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(100);
            radio.setIncreaseCurrentVolume();
            int actual = radio.getCurrentVolume();
            int expected = 100;

            assertEquals(expected, actual);
        }
        @Test
        public void shouldSetIncreaseCurrentVolumeMax1() {
            Radio radio = new Radio(15, 10, 80);
            radio.setIncreaseCurrentVolume();
            int actual = radio.getCurrentVolume();
            int expected = 81;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetIncreaseCurrentVolumeMin() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);

            radio.setIncreaseCurrentVolume();
            int actual = radio.getCurrentVolume();
            int expected = 1;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetDecreaseCurrentVolumeMin() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);
            radio.setDecreaseCurrentVolume();
            int actual = radio.getCurrentVolume();
            int expected = 0;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetDecreaseCurrentVolumeMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(100);
            radio.setDecreaseCurrentVolume();
            int actual = radio.getCurrentVolume();
            int expected = 99;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetDecreaseCurrentVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(8);
            radio.setDecreaseCurrentVolume();
            int actual = radio.getCurrentVolume();
            int expected = 7;

            assertEquals(expected, actual);
        }


    }
