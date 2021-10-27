package com.company;

public class GamePlayOutPut {
    LocationSelection locationSelection = new LocationSelection();

    //method to print the board
    public void printGameBoard(char[][] boardLayout) {
        for (char[] rows : boardLayout) {
            for (char boardPlace : rows) {
                System.out.print(boardPlace);
            }
            System.out.println();
        }
    }
}
