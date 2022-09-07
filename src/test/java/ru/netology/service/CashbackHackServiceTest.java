package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 1900;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemainIfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}