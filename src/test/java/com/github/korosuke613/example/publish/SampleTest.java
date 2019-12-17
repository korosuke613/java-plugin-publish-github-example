package com.github.korosuke613.example.publish;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTest {
    private Sample sample;

    @BeforeEach
    void setup() {
        sample = new Sample();
    }

    @Test
    void sumがintの足し算をできる() {
        assertEquals(3, sample.sum(1, 2));
    }

    @Test
    void sumがStringの結合をできる() {
        assertEquals("abcd", sample.sum("ab", "cd"));
    }

    @Test
    void calcLogが計算結果を保存している() {
        sample.sum(4, 5);
        sample.sum("ef", "gh");

        var expected = new String[]{"9", "efgh"};
        var actual = sample.getCalcLog().toArray();

        assertArrayEquals(expected, actual);
    }
}
