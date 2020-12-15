package com.brandboat.drone;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestTestDrone
{
    @Test
    public void testHaha()
    {
        assertEquals(TestDrone.testHaha(), "haha");
    }
}
