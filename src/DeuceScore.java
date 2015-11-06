/**
 * Created by chengwei07 on 2015-11-06.
 */
public class DeuceScore implements MatchScore {
    @Override
    public String scoreText() {
        return "Deuce";
    }

    @Override
    public MatchScore p1GetScore() {
        return null;
    }

    @Override
    public MatchScore p2GetScore() {
        return null;
    }
}
