package ExtraPractice;

public class Quiz {

    String topic;
    int totalNumOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumOfQuestions = totalNumOfQuestions;
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "Quiz: " +
                "topic: '" + topic + '\'' +
                ", totalNumOfQuestions: " + totalNumOfQuestions +
                ", totalPoints: " + totalPoints +
                '}';
    }
    public String takeQuiz(){
        return "Taking the " + topic + " quiz";
    }
}
