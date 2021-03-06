package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GamePlayOutPut playGame = new GamePlayOutPut();
        LocationSelection locationSelection = new LocationSelection();

        /*
        This is the gameboard as an array -
        3x3 gameboard is a 5x5 array to allow for the lines b
        */
        char[][] boardLayout = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        System.out.println("Please select a position: ");
        while (true) {
            String winner;
            locationSelection.assignUserInput(boardLayout);
            playGame.printGameBoard(boardLayout);
            winner = locationSelection.identifyWinner();
            if (!winner.isEmpty()) {
                playGame.printGameBoard(boardLayout);
                System.out.println(winner);
                break;
            }
            locationSelection.assignOpposingInput(boardLayout);
            playGame.printGameBoard(boardLayout);
            winner = locationSelection.identifyWinner();
            if (!winner.isEmpty()) {
                playGame.printGameBoard(boardLayout);
                System.out.println(winner);
                break;
            }
        }
    }
}