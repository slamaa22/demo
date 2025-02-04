package com.example.exa_107_quiz;

import org.junit.Test;

import java.util.List;

public class TestQuizQuestion {

    @Test
    public void testQuizQuestion() {

        QuizQuestion q = new QuizQuestion("Was ist der häufigste Vorname in der 3AHIF",
                                            List.of("Killian", "Noah", "Johannes", "Maria"
                                            ), 1);
    }
}
