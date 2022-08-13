package DemonClan;

import DemonClan.Players.Player;
import DemonClan.Quests.Quest;
import DemonClan.Rooms.DemonRoom;
import DemonClan.Rooms.Room;
import DemonClan.Rooms.TreasureRoom;

import java.util.ArrayList;

public class Runner {

    public static void main(Quest quest) {
        ArrayList<Player> players = quest.getPlayers();
        ArrayList<Room> rooms = quest.getRooms();

        //  for each room in the quest
        for (Room room:
             rooms) {
            if (room instanceof TreasureRoom) {
                ((TreasureRoom) room).splitTreasures(players);
            }
            if (room instanceof DemonRoom) {
                ((DemonRoom) room).splitDemonFight(players);
            }
        }

    }
}
