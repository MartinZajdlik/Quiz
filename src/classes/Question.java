package classes;

import java.util.ArrayList;

public class Question {
    private String text;
    private ArrayList<String> options;
    private String correctAnswer;

    public Question(String text, ArrayList<String> options, String correctAnswer) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void printQuestion() {
        System.out.println(text);
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ". " + option);
            optionLabel++;
        }
    }

    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }


}


