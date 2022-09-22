package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1and10Then10() {
        int first = 3;
        int second = 1;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1To2and5and11Then11() {
        int first = 1;
        int second = 2;
        int third = 5;
        int four = 11;
        int result = Max.max(first, second, third, four);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2To2and2and2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int four = 2;
        int result = Max.max(first, second, third, four);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}