package testscoresdemo;

public class TestScores {

    private double[] scores;

    public TestScores(double[] s) throws IllegalArgumentException {
        scores = new double[s.length];

        for (int i = 0; i < s.length; i++) {
            if (s[i] < 0 || s[i] > 100) {
                throw new IllegalArgumentException("Element: " + i + " Score: " + s[i]);
            } else {
                this.scores[i] = s[i];
            }
        }
    }

    public double getAverage() {
        double total = 0.0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return (total / scores.length);
    }
}
