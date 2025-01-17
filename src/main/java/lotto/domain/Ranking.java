package lotto.domain;

import java.util.Arrays;
import java.util.function.Predicate;

public enum Ranking implements Comparable<Ranking> {
    NONE(0, false, 0),
    FIFTH(3, false, 5_000),
    FOURTH(4, false, 50_000),
    THIRD(5, false, 15_000_000),
    SECOND(5, true, 30_000_000),
    FIRST(6, false, 2_000_000_000);

    private int matchingCount;
    private boolean matchBonus;
    private int reward;

    Ranking(int matchingCount, boolean matchBonus, int reward) {
        this.matchingCount = matchingCount;
        this.matchBonus = matchBonus;
        this.reward = reward;
    }

    public static Ranking findRank(int count, boolean matchBonus) {
        Ranking ranking = Arrays.stream(values())
                .filter(compareCountAndBonus(count, matchBonus))
                .findFirst()
                .orElse(NONE);

        if (isNotExistRanking(ranking, matchBonus)) {
            return findRank(count, false);
        }
        return ranking;
    }

    private static boolean isNotExistRanking(Ranking ranking, boolean matchBonus) {
        return ranking == Ranking.NONE && matchBonus;
    }

    public static Predicate<Ranking> compareCountAndBonus(int count, boolean matchBonus) {
        return rank -> rank.matchingCount == count
                && rank.matchBonus == matchBonus;
    }

    public int getReward() {
        return reward;
    }

    public int getMatchingCount() {
        return matchingCount;
    }

    public boolean isMatchBonus() {
        return matchBonus;
    }


}
