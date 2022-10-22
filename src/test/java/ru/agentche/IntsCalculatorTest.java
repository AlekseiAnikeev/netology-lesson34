package ru.agentche;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 22.10.2022
 */
public class IntsCalculatorTest {
    Ints adapter = new IntsCalculator();

    @Test
    @DisplayName("тест суммы")
    void shouldSummarize(){
        assertEquals(256, adapter.sum(128,128));
    }

    @Test
    @DisplayName("тест умножения")
    void shouldMultiply() {
        assertEquals(25, adapter.mult(5,5));
    }
    @Test
    @DisplayName("тест возведения в степень")
    void shouldExponentiate(){
        assertEquals(25, adapter.pow(5,2));
    }
}
