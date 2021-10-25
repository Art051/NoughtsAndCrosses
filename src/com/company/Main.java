package com.company;

public class Main {

    public static void main(String[] args) {
        GamePlayOutPut playGame = new GamePlayOutPut();
        int userSelection = 0;
        int oppositionSelection = 0;

        /*
        This is the gameboard as an array -
        3x3 gameboard is a 5x5 array to allow for the lines b
        */
        char[][] boardLayout = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        playGame.printGameBoard(boardLayout);
        playGame.gamePlay(boardLayout);
    }
}
