package com.company;

public class Player {

    int healthPoint;

    Player() {                      // player healthpoint

        healthPoint = 200;


    }

    public void enter(Dungeon fear) {    // player enter into the Dungeon
        fear.parcours(this);


    }


    public void looseHealthPoint(int damages) { //  player damages. player loose 10 healthpoint
        healthPoint -= damages;


    }

}
