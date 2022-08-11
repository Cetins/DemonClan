package Quests;

import Quests.Helpers.CoinBundles;
import Quests.Helpers.Herbs;
import Quests.Rooms.Room;

import java.util.ArrayList;

public interface ICollect {

    void collectHerb(Room room);
    void collectCoins(Room room);
}
