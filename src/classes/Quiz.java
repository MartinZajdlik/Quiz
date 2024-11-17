package classes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private String title;
    private ArrayList<Question> questions;
    private int score;

    public Quiz(String title){
        this.title = title;
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void startQuiz(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to: "+ title);
        System.out.println();

        for (Question question : questions){
            question.printQuestion();
            System.out.println("What is your answer: ");
            String yourAnswer = scanner.nextLine();
            System.out.println();

            if (question.checkAnswer(yourAnswer)) {
                //System.out.println("Your answer is correct!");
                score++;

            }
            else {
                    //System.out.println("Your answer is false!");
                }
            }
        System.out.println("Correct answers is: " +score);
        }


    }
