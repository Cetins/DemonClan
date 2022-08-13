package DemonClan.Helpers;

import java.time.chrono.HijrahEra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    public int getTotalPoints(ArrayList<Herbs> herbs) {
        int totalPoints = herbs.stream()
                .mapToInt(Herbs::getPoints)
                .sum();
        return totalPoints;
    }
}
