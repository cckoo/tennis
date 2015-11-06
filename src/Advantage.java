/**
 * Created by chengwei07 on 2015-11-06.
 */
public class Advantage implements MatchScore {
    private String advantager;
    public Advantage(String advantager) {
        this.advantager = advantager;
    }

    @Override
    public String scoreText() {
        return advantager + " Advantage";
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
