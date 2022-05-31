package ru.ufa;

import static org.junit.Assert.assertTrue;
import static ru.ufa.Main.*;

import org.junit.jupiter.api.*;

public class AppTest {
    private static long suiteStartTime;
    public static final double PI = 3.14;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running All Tests");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("All Tests completed in time: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete in time: " + (System.nanoTime() - testStartTime));
    }

    @org.junit.jupiter.api.Test
    public void shouldAnswerWithTrue() {
        assertTrue(theCapitalOfGreatBritian().equals("London"));
    }

    @org.junit.jupiter.api.Test
    public void testCalculateCircleArea() {
        // given:
        int a = 4, expectedResult = 50;

        // when:
        int result = calculateCircleArea(a);

        // then:
        Assertions.assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testcalculateCircleLength() {
        // given:
        int a = 4, expectedResult = 25;

        // when:
        int result = calculateCircleLength(a);

        // then:
        Assertions.assertEquals(expectedResult, result);
    }
}