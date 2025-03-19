package dev.annotation.custom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomAnnotationMainTest {

    @Test
    public void testValidYearRange() {
        // given
        CarRequest dto = new CarRequest("BMW", 2021);
        // when
        Car car = new Car(dto.getModel(), dto.getYear());
        // then
        System.out.println(car);
    }

    @Test
    public void testInvalidYearRange() {
        // given
        CarRequest dto = new CarRequest("BMW", 2026);
        // when
        Car car = new Car(dto.getModel(), dto.getYear());
        // then
        System.out.println(car);
    }
}