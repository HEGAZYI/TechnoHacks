package technoHacks;

import java.util.*;

class task5 {
    static int trueOption= 0 ;
    static int  falseOption= 0 ;
    private static final String[] questions = {
            "What is the capital of France?",
            "Who wrote 'To Kill a Mockingbird'?",
            "What is the chemical symbol for water?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal in the world?",
            "Who painted the Mona Lisa?",
            "What is the capital of Japan?",
            "Which of these is not a primary color?",
            "Who developed the theory of relativity?",
            "What is the tallest mountain in the world?",
            "Who wrote 'Hamlet'?",
            "What is the chemical symbol for gold?",
            "What is the currency of India?",
            "Which of these animals is a marsupial?",
            "Which planet is known as the 'Blue Planet'?"
    };

    private static final String[] options = {
            "A. London\tB. Paris\tC. Berlin\tD. Rome",
            "A. Ernest Hemingway\tB. Harper Lee\tC. Mark Twain\tD. Charles Dickens",
            "A. HO\tB. O2\tC. H2O\tD. CO2",
            "A. Earth\tB. Mars\tC. Jupiter\tD. Venus",
            "A. Elephant\tB. Blue whale\tC. Giraffe\tD. Hippopotamus",
            "A. Pablo Picasso\tB. Leonardo da Vinci\tC. Vincent van Gogh\tD. Michelangelo",
            "A. Shanghai\tB. Tokyo\tC. Seoul\tD. Bangkok",
            "A. Red\tB. Green\tC. Yellow\tD. Blue",
            "A. Isaac Newton\tB. Albert Einstein\tC. Galileo Galilei\tD. Stephen Hawking",
            "A. Mount Kilimanjaro\tB. Mount Everest\tC. K2\tD. Mount Fuji",
            "A. William Shakespeare\tB. Charles Dickens\tC. Jane Austen\tD. F. Scott Fitzgerald",
            "A. Au\tB. Ag\tC. Cu\tD. Fe",
            "A. Euro\tB. Dollar\tC. Yen\tD. Rupee",
            "A. Kangaroo\tB. Tiger\tC. Elephant\tD. Giraffe",
            "A. Earth\tB. Mars\tC. Neptune\tD. Uranus"
    };

    private static final String [] solutions = {"B","B","C","B", "B", "B", "B", "D", "B", "B", "A", "A", "D", "A","A"};

    public static void main(String [] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("A Simple Test:");
            for(int i = 0 ; i<questions.length ; i++){
                System.out.println((i+1)+"-"+ questions[i]);
                System.out.println(options[i]);
                System.out.println("Enter the Correct Answer of question ["+(i+1)+"]:{A - B - C - D}");
                String userAnswer = scanner.nextLine().toUpperCase();
                if(userAnswer.equals(solutions[i])){
                    System.out.println("Correct!");
                    trueOption++;
                }else{
                    System.out.println("false!");
                    falseOption++;
                }
                System.out.println("\n------------------------------------\n");
            }
            System.out.println("you have answered [ "+trueOption+" ]questions true");
            System.out.println("you have answered [ "+falseOption+" ]questions false");
            if(trueOption >= falseOption){
                System.out.println("\nGongratulations!");
            }else{
                System.out.println("Hope you do your best next time!");
            }
        }
    }
}