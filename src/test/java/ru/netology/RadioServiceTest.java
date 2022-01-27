package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {
    RadioService radio = new RadioService();
    RadioService radio1 = new RadioService(1, "Radio-wave", 7, 9, 50, 100);
    RadioService radio2 = new RadioService(2, "Radio-noise", -1, 10, 150, 120);
    RadioService radio3 = new RadioService(3, "Radio-lite", 15, 14, -1, 100);
    RadioService radio4 = new RadioService(4, "Radio-voice", 9, 10, 30, 50);

    @Test
    public void ifBetweenMinAndMaxStationSetCurrentStation() {
        radio1.setCurrentStation();
        assertEquals(7, radio1.getCurrentStation());
    }

    @Test
    public void ifBellowFirstStationSetCurrentStation() {
        radio2.setCurrentStation();
        assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    public void ifUnderLastStationSetCurrentStation() {
        radio3.setCurrentStation();
        assertEquals(13, radio3.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStationUsingNextButtonIfBellowLastStation() {
        radio1.setCurrentStation();
        radio1.setCurrentStationWithNextButton();
        assertEquals(8, radio1.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentStationUsingNextButtonIfLastStation() {
        radio4.setCurrentStation();
        radio4.setCurrentStationWithNextButton();
        assertEquals(0, radio4.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentRadioStationUsingPrevButtonIfUnderFirstStation() {
        radio2.setCurrentStation();
        radio2.setCurrentStationWithPrevButton();
        assertEquals(9, radio2.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUsingPrevButtonIfFirstStation() {
        radio1.setFirstStation();
        radio1.setCurrentStationWithPrevButton();
        assertEquals(6, radio1.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationUsingPrevButtonIfBetweenFirstAndLast() {
        radio4.setCurrentStation();
        radio4.setCurrentStationWithPrevButton();
        assertEquals(8, radio4.getCurrentStation());
    }


    @Test
    public void ifBetweenMinAndMaxVolumeSetCurrentSoundVolume() {
        radio1.setCurrentSoundVolume();
        assertEquals(50, radio1.getCurrentSoundVolume());
    }

    @Test
    public void ifUnderMaxSetCurrentSoundVolume() {
        radio2.setCurrentSoundVolume();
        assertEquals(120, radio2.getCurrentSoundVolume());
    }

    @Test
    public void ifBellowMinSetCurrentSoundVolume() {
        radio3.setCurrentSoundVolume();
        assertEquals(0, radio3.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfBellowMax() {
        radio1.setCurrentSoundVolume();
        radio1.setCurrentSoundVolumeWithNextButton();
        assertEquals(51, radio1.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingNextButtonIfMax() {
        radio2.setCurrentSoundVolume();
        radio2.setCurrentSoundVolumeWithNextButton();
        assertEquals(120, radio2.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfUnderMin() {
        radio3.setCurrentSoundVolume();
        radio3.setCurrentSoundVolumeWithPrevButton();
        assertEquals(0, radio3.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfMin() {
        radio.setMinSoundVolume();
        radio.setCurrentSoundVolumeWithPrevButton();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUsingPrevButtonIfBetweenMinAndMax() {
        radio4.setMinSoundVolume();
        radio4.setCurrentSoundVolumeWithPrevButton();
        assertEquals(29, radio4.getCurrentSoundVolume());
    }

}