package ru.stepuk.changeme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAdd() {
        assertEquals(5, new Main().add(3, 2));
    }
}
