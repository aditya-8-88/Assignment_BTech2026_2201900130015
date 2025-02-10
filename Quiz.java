import java.util.*;

class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public boolean checkAnswer(String userAnswer) {
        return this.answer.equalsIgnoreCase(userAnswer);
    }
}

class Quiz {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question q) { questions.add(q); }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            // System.out.println(q.text);
            String userAnswer = scanner.nextLine();
            if (q.checkAnswer(userAnswer)) {
                score++;
            }
        }

        System.out.println("Quiz finished! Your score: " + score);
    }
}
