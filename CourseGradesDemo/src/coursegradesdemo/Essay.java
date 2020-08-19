package coursegradesdemo;

public class Essay extends GradedActivity {

    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public void setScore(double gr, double sp, double len, double cnt) {

        setGrammar(gr);
        setSpelling(sp);
        setCorrectLength(len);
        setContent(cnt);

        super.setScore(this.grammar + this.spelling + this.correctLength + this.content);

    }

    private void setGrammar(double g) {
        if (g <= 30.0) {
            grammar = g;
        } else {
            grammar = 0.0;
        }
    }

    private void setSpelling(double s) {
        if (s <= 20.0) {
            spelling = s;
        } else {
            spelling = 0.0;
        }
    }

    private void setCorrectLength(double c) {
        if (c <= 20.0) {
            correctLength = c;
        } else {
            correctLength = 0.0;
        }
    }

    private void setContent(double c) {
        if (c <= 30.0) {
            content = c;
        } else {
            content = 0.0;
        }
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getContent() {
        return content;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getScore() {
        return grammar + spelling + correctLength + content;
    }
}
