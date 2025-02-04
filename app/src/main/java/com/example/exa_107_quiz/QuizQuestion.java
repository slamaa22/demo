package com.example.exa_107_quiz;



import java.util.List;



public class QuizQuestion {

    private final String question;

    private final List<String> answers;

    private final int correctAnswers;

    public QuizQuestion(String question, List<String> answers, int correctAnswers) {
        this.question = question;
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(String.format("%s %n", question));
        for (String answer: answers)
            sb.append(String.format(" %s%n", answers));
        sb.append(String.format("Correct Awnser: %d", correctAnswers));
        return sb.toString();
    }
}
