package Quests.Helpers;

public enum Treasures {

    GOLD(200),
    RUBY(150),
    SILVER(100),
    BRONZE(50);

    private final int points;

    Treasures(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
