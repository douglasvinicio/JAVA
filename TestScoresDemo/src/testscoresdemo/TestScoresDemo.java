package testscoresdemo;

public class TestScoresDemo {

    public static void main(String[] args) {

        double[] badScores = {87.5, 66.7, 88.0, 101.0, 99.0};
        double[] goodScores = {87.5, 66.7, 88.0, 100.0, 99.0};

        try {
            TestScores tBad = new TestScores(badScores);
            System.out.println("The average of BadScores is: " + tBad.getAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid score found. \n" + e.getMessage());
        }

        try {
            TestScores tGood = new TestScores(goodScores);
            System.out.println("The average of GoodScores is: " + tGood.getAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid score found. \n" + e.getMessage());
        }
    }
}
