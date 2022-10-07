package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConversionService {
    public static final Double conversionValue = 2.2046;

    public Double poundsToKilograms(Double pounds) {
        return pounds / conversionValue;
    }

    public Double kilogramsToPounds(Double kilograms) {
        return kilograms * conversionValue;
    }
}
