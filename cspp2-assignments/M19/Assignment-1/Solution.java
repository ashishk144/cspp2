import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    static Quiz[] questions = new Quiz[20];
    static int quizsize;
    static Quiz[] answers = new Quiz[20];
    static int answersize;
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore();
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        for (int i = 0; i < questionCount; i++) {
            String line = s.nextLine();
            String [] input = line.split(":");
            quiz = new Quiz(input[0], input[1].split(","), Integer.parseInt(
                input[2]), Integer.parseInt(input[3]), Integer.parseInt(
                input[4]));
            questions[quizsize++] = quiz;
        }
        System.out.println(questionCount+" are added to the quiz");
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        for (int i = 0; i < answerCount; i++) {
            questions[i].printQuestion();
            System.out.println();
            String line = s.nextLine();
            String[] ans = line.split(" ");
            answers[answersize++] = new Quiz(Integer.parseInt(ans[1]));
        }
    }

    /**
     * Displays the score report
     *final Quiz quiz
     * @param      quiz     The quiz object
     */
    public static void displayScore() {
        // write your code here to display the score report
        int score = 0;
        for (int i = 0; i < answersize; i++) {
            System.out.println(questions[i].getQuestion());
            if(questions[i].getCorrectchoice() == answers[i].getAnswer()) {
                System.out.println(" Correct Answer! - Marks Awarded: " + questions[i].getScore());
                score += questions[i].getScore();
            } else {
                System.out.println(" Wrong Answer! - Penalty: " + questions[i].getPenalty());
                score += questions[i].getPenalty();
            }
        }
        System.out.println("Total Score: " + score);
    }
}
