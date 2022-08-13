package DemonClan.Quests;

import DemonClan.Players.Player;
import DemonClan.Rooms.Room;

import java.util.ArrayList;

public class Quest {
    ArrayList<Player> players;
    ArrayList<Room> rooms;

    public Quest() {
        this.players = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}
