package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {
    RadioService radio = new RadioService();
    RadioService radio1 = new RadioService(15);
    RadioService radio2 = new RadioService(4);

    @Test
    public void ifBetweenMinAndMaxStationSetCurrentStation() {
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void ifBellowFirstStationSetCurrentStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void ifUnderLastStationSetCurrentStation() {
        radio.setCurrentStation(radio.getAmountStation()); //amountStation всегда больше на 1, чем lastStation
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void ifUnderLastStationSetCurrentStation1() {
        radio1.setCurrentStation(radio1.getAmountStation()); //amountStation всегда больше на 1, чем lastStation
        assertEquals(14, radio1.getCurrentStation());
    }

    @Test
    public void ifUnderLastStationSetCurrentStation2() {
        radio2.setCurrentStation(radio.getAmountStation()); //amountStation всегда больше на 1, чем lastStation
        assertEquals(3, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUsingNextButtonIfBellowLastStation() {
        int index = radio.getLastStation() - 1;
        radio.setCurrentStation(index);
        radio.setCurrentStationWithNextButton();
        assertEquals(radio.getLastStation(), radio.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStationUsingNextButtonIfLastStation() {
        radio.setCurrentStation(radio.getLastStation());
        radio.setCurrentStationWithNextButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentRadioStationUsingPrevButtonIfFirstStation() {
        radio.setCurrentStation(radio.getFirstStation());
        radio.setCurrentStationWithPrevButton();
        assertEquals(radio.getLastStation(), radio.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStationUsingPrevButtonIfBetweenFirstAndLast() {
        radio.setCurrentStation(5);
        radio.setCurrentStationWithPrevButton();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUsingPrevButtonIfBetweenFirstAndLast2() {
        radio2.setCurrentStation(2);
        radio2.setCurrentStationWithPrevButton();
        assertEquals(1, radio2.getCurrentStation());
    }

    @Test
    public void ifBetweenMinAndMaxVolumeSetCurrentSoundVolume() {
        radio.setCurrentSoundVolume(50);
        assertEquals(50, radio.getCurrentSoundVolume());
    }

    @Test
    public void ifUnderMaxSetCurrentSoundVolume() {
        radio.setCurrentSoundVolume(101);
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    public void ifBellowMinSetCurrentSoundVolume() {
        radio.setCurrentSoundVolume(-1);
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfBellowMax() {
        radio.setCurrentSoundVolume(50);
        radio.setCurrentSoundVolumeWithNextButton();
        assertEquals(51, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfMax() {
        radio.setCurrentSoundVolume(100);
        radio.setCurrentSoundVolumeWithNextButton();
        assertEquals(100, radio.getCurrentSoundVolume());
    }


    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfMin() {
        radio.setMinSoundVolume();
        radio.setCurrentSoundVolumeWithPrevButton();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfBetweenMinAndMax() {
        radio.setCurrentSoundVolume(30);
        radio.setCurrentSoundVolumeWithPrevButton();
        assertEquals(29, radio.getCurrentSoundVolume());
    }
}