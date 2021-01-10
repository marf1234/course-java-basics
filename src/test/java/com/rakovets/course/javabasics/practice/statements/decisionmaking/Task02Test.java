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
@DisplayName("Greeting")
class Task02Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(0, "Good night"),
                Arguments.of(1, "Good night"),
                Arguments.of(6, "Good morning"),
                Arguments.of(7, "Good morning"),
                Arguments.of(12, "Good day"),
                Arguments.of(13, "Good day"),
                Arguments.of(18, "Good evening"),
                Arguments.of(19, "Good evening"),
                Arguments.of(-1, null),
                Arguments.of(25, null)
        );
    }

    @ParameterizedTest(name = "Hour: {0}")
    @MethodSource("provideArguments")
    void test(int hour, String expected) {
        assertEquals(expected, Task02.getGreetingByHour(hour));
    }
}
