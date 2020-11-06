package com.company;

public class Room {

    Enemies magician;

    Room() {                           // enemies in 1st room

        magician = new Enemies();


    }


    public void open(Player player) {    // magician attack player

        magician.attack(player);

    }
}