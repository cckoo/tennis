/**
 * Created by chengwei07 on 2015-11-06.
 */
public class Tennis {

    String scoreText = "Love All";

    public String scoreText() {
        return scoreText;
    }

    public void p1GetScore() {
        if (scoreText.equals("Love All")) {
            scoreText = "Fifteen Love";
        } else {
            scoreText = "Thirty Love";
        }
    }
}
