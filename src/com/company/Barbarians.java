package com.company;

public class Barbarians {

    int healthPointBa;
    Weapons axe;

    public Barbarians() {

        healthPointBa = 10;

        axe = new Weapons();


    }

    public void attack(Player player) {           // enemies attack player and cause damages
        player.looseHealthPoint(axe.damages);

    }
}
