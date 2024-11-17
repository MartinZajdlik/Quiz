import classes.ListQuestions;
import classes.Question;
import classes.Quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ListQuestions listQuestions = new ListQuestions();

        Quiz mathQuiz = new Quiz("Math Quiz");

        for (Question question: listQuestions.getQuestions()){
            mathQuiz.addQuestion(question);
        }


        mathQuiz.startQuiz();

        }
}