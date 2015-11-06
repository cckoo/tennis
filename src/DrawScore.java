/**
 * Created by chengwei07 on 2015-11-06.
 */
public class DrawScore implements MatchScore {
    private TennisScore score;
    public DrawScore(TennisScore score) {
        this.score = score;
    }

    @Override
    public String scoreText() {
        return score + " All";
    }

    @Override
    public MatchScore p1GetScore() {
        return new PlayerScore(score.next(), score);
    }

    @Override
    public MatchScore p2GetScore() {
        return new PlayerScore(score, score.next());
    }
}
