package Quests.Helpers;

public enum CoinBundles {

    SMALL(10),
    MEDIUM(25),
    LARGE(50);

    private final int coins;

    CoinBundles(int coins) {
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }
}
