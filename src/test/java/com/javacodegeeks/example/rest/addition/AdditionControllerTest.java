package com.javacodegeeks.example.rest.addition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionControllerTest {

    @DisplayName("Test AdditionController.doAdd()")
    @Test
    void testdoAdd() {
        //GIVEN
        String addend1 = "1";
        String addend2 = "1";

        //WHEN
        AdditionController controler = new AdditionController();

        String result = controler.doAdd("1","1");
        String sum = "2";

        //THEN
        String expected = "{\"addend1\":\"" + addend1 + "\", \"addend2\":\"" + addend2 + "\", \"sum\": \"" + sum + "\"}";
        assertEquals(expected, result);

    }

}