package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.inject.Inject;

import org.acme.service.ConversionService;
import org.junit.jupiter.api.Test;


import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ConversionServiceTest {
    @Inject
    ConversionService service;

    @Test
    public void testingPoundsToKilogramsSendAValidValue() {
        Integer pounds = 20;
        Double expected = pounds / ConversionService.conversionValue;
        Double actual = service.poundsToKilograms(pounds.doubleValue());

        assertEquals(expected, actual);
    }

    @Test
    public void testingPoundsToKilogramSendAInvalidValue() {
        assertThrows(NullPointerException.class, () -> service.poundsToKilograms(null));
    }

    @Test
    public void testingKilogramsToPoundsSendAValidValue() {
        Integer kilograms = 20;
        Double expected = kilograms * ConversionService.conversionValue;
        Double actual = service.kilogramsToPounds(kilograms.doubleValue());

        assertEquals(expected, actual);
    }

    @Test
    public void testingKilogramsToPoundsSendAInvalidValue() {
        assertThrows(NullPointerException.class, () -> service.kilogramsToPounds(null));
    }
}
