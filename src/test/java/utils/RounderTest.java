package utils;

import app.utils.Rounder;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RounderTest {

    @Test
    void rounding_a_number_to_two_digits_after_the_dot() {
        assertEquals("1,11", Rounder.roundValue(1.11111));
    }

}
