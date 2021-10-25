package com.company;

public class GamePlayOutPut extends LocationSelection {

    //method to print the board
    public void printGameBoard(char[][] boardLayout) {
        for (char[] rows : boardLayout) {
            for (char boardPlace : rows) {
                System.out.print(boardPlace);
            }
            System.out.println();
        }
    }

    //Playing the game:
    public void gamePlay(char[][] boardLayout) {
        System.out.println("Begin Noughts and Crosses: ");
        while (true) {
            assignUserInput(boardLayout);
            assignOpposingInput(boardLayout);
            printGameBoard(boardLayout);
        }
    }
}
