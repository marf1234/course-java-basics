package com.rakovets.course.javabasics.practice.statements.decisionmaking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
@DisplayName("Apartment house")
class Task13Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(2, 10, 45, 1),
                Arguments.of(9, 4, 169, 7),
                Arguments.of(18, 10, 180, 18),
                Arguments.of(1, 1, 1, 1),
                Arguments.of(10, 5, 11, 3),
                Arguments.of(10, 4, 10, 3)
        );
    }

    @ParameterizedTest(name = "Floors, apartment of floors and number apartment: {0}")
    @MethodSource("provideArguments")
    void test(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber, int expected) {
        int actual = Task13.getFloorNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);

        assertEquals(expected, actual);
    }
}
