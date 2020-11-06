package com.company;

import java.util.Random;
import java.util.Scanner;

public class Enemies {

    int healthPoint;
    Weapons sword;

    Enemies() {

        healthPoint = 10;

        sword = new Weapons();


    }

    public void attack(Player player) {           // enemies attack player and cause damages
        player.looseHealthPoint(sword.damages);

    }
}
