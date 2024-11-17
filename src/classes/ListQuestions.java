package classes;

import java.util.ArrayList;
import java.util.List;

public class ListQuestions {
    private List<Question> questions;

    public ListQuestions (){
        this.questions = new ArrayList<>();

        ArrayList<String> options1 = new ArrayList<>();
        options1.add("4");
        options1.add("3");
        options1.add("-1");
        Question q1 = new Question("What is 2 + 2?", options1, "a");

        ArrayList<String> options2 = new ArrayList<>();
        options2.add("13");
        options2.add("-5");
        options2.add("7");
        Question q2 = new Question("What is 10 - 3?", options2, "c");

        ArrayList<String> options3 = new ArrayList<>();
        options3.add("18");
        options3.add("9");
        options3.add("4");
        Question q3 = new Question("What is 3 * 3?", options3, "b");
    }

    public List<Question> getQuestions(){
        return questions;
    }


}
