import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * magic number.
     */
    static int Twenty = 20;
    /**.
     * { var_description }
     */
    private static Quiz[] questions = new Quiz[Twenty];
    /**.
     * { var_description }
     */
    private static int quizsize;
    /**.
     * { var_description }
     */
    private static Quiz[] answers = new Quiz[Twenty];
    /**.
     * { var_description }
     */
    private static int answersize;
     /**
     * Constructs the object.
     **/
    private Solution() {
        // leave this blank
    }
    /**.
     * { function_description }
     *
     * @param      args       The arguments
     *
     * @throws     Exception  { exception_description }
     */
    public static void main(final String[] args) throws Exception {
         // instantiate this Quiz
        // Quiz q = new Quiz();
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
                try {
                    loadQuestions(s, Integer.parseInt(tokens[1]));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, Integer.parseInt(tokens[1]));
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
     * @param      s              { parameter_description }
     * @param      questionCount  The question count
     *
     * @throws     Exception      { exception_description }
     */
    public static void loadQuestions(final Scanner s, final int questionCount)
    throws Exception {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        if (questionCount > 0) {
            for (int i = 0; i < questionCount; i++) {
                String line = s.nextLine();
                String[] input = line.split(":");
                if (input.length == 5 && input[0].length() > 1) {
                    String[] choic = input[1].split(",");
                    if (choic.length > 1) {
                        if (Integer.parseInt(input[2]) <= choic.length) {
                            if (Integer.parseInt(input[3]) > 0) {
                                if (Integer.parseInt(input[4]) <= 0) {
                                    Quiz quiz = new Quiz(input[0], choic,
                                        Integer.parseInt(input[2]),
                                        Integer.parseInt(input[3]),
                                        Integer.parseInt(input[4]));
                                    questions[quizsize++] = quiz;
                                } else {
                                    throw new Exception("Invalid penalty for " + input[0]);
                                }
                            } else {
                                throw new Exception("Invalid max marks for " + input[0]);
                            }
                        } else {
                            throw new Exception(
                                "Error! Correct answer choice numbers is out of range for " + input[0]);
                        }
                    } else {
                        throw new Exception(input[0]
                            + " does not have enough answer choices");
                    }
                } else {
                    throw new Exception("Error! Malformed question");
                }
            }
            System.out.println(questionCount+" are added to the quiz");
        } else {
            throw new Exception("Quiz does not have questions");
        }
    }

    /**
     * Starts a quiz.
     *
     * @param      s            { parameter_description }
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        if (quizsize >= answerCount) {
            for (int i = 0; i < answerCount; i++) {
                questions[i].printQuestion();
                System.out.println();
                String line = s.nextLine();
                answers[answersize++] = new Quiz(line);
            }
        }
    }

    /**
     * { function_description }
     */
    public static void displayScore() {
        // write your code here to display the score report
        if (quizsize >= answersize) {
            int score = 0, c = 0;
            for (int i = 0; i < answersize; i++) {
                System.out.println(questions[i].getQuestion());
                if (questions[i].getCorrectchoice().equals(answers[i].getAnswer())) {
                    System.out.println(" Correct Answer! - Marks Awarded: "
                        + questions[i].getScore());
                    score += questions[i].getScore();
                    c++;
                } else {
                    System.out.println(" Wrong Answer! - Penalty: "
                        + questions[i].getPenalty());
                    score += questions[i].getPenalty();
                    c++;
                }
            }
            if (c > 0) {
                System.out.println("Total Score: " + score);
            }
        }
    }
}
