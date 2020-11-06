package com.company;

public class Room {

    Barbarians bob;

    public Room() {                           // enemies in  room

        bob = new Barbarians();


    }


    public void open(Player player) {    // barbarians attack player

        bob.attack(player);


    }



}