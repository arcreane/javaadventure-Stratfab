package com.company;

public class Dungeon {

    Room[] rooms;

    public Dungeon() {

        rooms = new Room[5];                      // tab for 5 Rooms in Dungeon
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();

        }
    }

    public void parcours(Player player) {          // player enter the 1st room
        for (int i = 0; i < rooms.length; i++) {
            rooms[i].open(player);

        }
    }
}
