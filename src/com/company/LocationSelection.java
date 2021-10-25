package com.company;

import java.util.Random;
import java.util.Scanner;

public class LocationSelection {
    private Scanner scanner = new Scanner(System.in);
    /*
I need to add conditions to stop entries overwriting each other - I think involving some of this:

    public ArrayList<Integer> positionsUsed = new ArrayList<>();
        while (true)
            if (!positionsUsed.contains(userSelection)) {
                positionsUsed.add(userSelection);
                return;
        while (true) {
            if (!positionsUsed.contains(oppositionSelection)) {
                positionsUsed.add(oppositionSelection);
                return;
*/

    //method for user input
    public void assignUserInput(char[][] boardLayout) {
        int userSelection = scanner.nextInt();
        switch (userSelection) {
            case (1) -> boardLayout[0][0] = 'X';
            case (2) -> boardLayout[0][2] = 'X';
            case (3) -> boardLayout[0][4] = 'X';
            case (4) -> boardLayout[2][0] = 'X';
            case (5) -> boardLayout[2][2] = 'X';
            case (6) -> boardLayout[2][4] = 'X';
            case (7) -> boardLayout[4][0] = 'X';
            case (8) -> boardLayout[4][2] = 'X';
            case (9) -> boardLayout[4][4] = 'X';
        }
    }


    //method for opposition input
    public void assignOpposingInput(char[][] boardLayout) {
        Random random = new Random();
        int oppositionSelection = random.nextInt(9 + 1);
        switch (oppositionSelection) {
            case (1) -> boardLayout[0][0] = 'O';
            case (2) -> boardLayout[0][2] = 'O';
            case (3) -> boardLayout[0][4] = 'O';
            case (4) -> boardLayout[2][0] = 'O';
            case (5) -> boardLayout[2][2] = 'O';
            case (6) -> boardLayout[2][4] = 'O';
            case (7) -> boardLayout[4][0] = 'O';
            case (8) -> boardLayout[4][2] = 'O';
            case (9) -> boardLayout[4][4] = 'O';

        }
    }
}
