package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Menu.menu();

        Player totor = new Player();
        Dungeon fear = new Dungeon();

        totor.enter(fear);


    }
}