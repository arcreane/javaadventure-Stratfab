package com.company;

public class Player {

    int healthPointPl;
    Weapons sword;

    Player() {                      // player healthpoint

        healthPointPl = 100;
        sword = new Weapons();


    }

    public void enter(Dungeon fear) {    // player enter into the Dungeon
        fear.parcours(this);


    }


    public void looseHealthPoint(int damages) { //  player damages. player loose 10 healthpoint
        healthPointPl -= damages;



    }

}
