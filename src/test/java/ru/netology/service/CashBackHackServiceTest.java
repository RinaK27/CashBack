package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {
    @Test
    public void testShouldReturn100() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testShouldReturn900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testShouldReturn0() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }


}