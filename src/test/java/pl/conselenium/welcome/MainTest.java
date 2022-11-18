package pl.conselenium.welcome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isEvenShouldReturnTrueWhenEvenNumberIsUsed() {
        //given
        int number = 4;
        //when
        boolean result = Main.isEven(number);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void isEvenShouldReturnFalseWhenNotEvenNumberIsUsed(){
        //given
        int number = 1024;
        //when
        boolean result = Main.isEven(number);
        //then
        Assertions.assertFalse(result);
    }
}