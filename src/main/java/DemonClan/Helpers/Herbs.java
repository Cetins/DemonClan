package DemonClan.Helpers;

public enum Herbs{
    OLD_SPICE(20),
    PURPLE_LOTUS(50);

    private final int points;

    Herbs(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
