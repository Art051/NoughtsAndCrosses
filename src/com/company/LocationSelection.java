package com.company;

import java.util.*;

public class LocationSelection {
    private Scanner scanner = new Scanner(System.in);

    //ArrayLists to store the positions of each player to compare against winning position combinations
    public ArrayList<Integer> userPositionsUsed = new ArrayList<>();
    public ArrayList<Integer> opponentPositionsUsed = new ArrayList<>();
    int userSelection;
    int oppositionSelection;

    //method for getting and assigning user input to the array
    public void assignUserInput(char[][] boardLayout) {
        userSelection = scanner.nextInt();
        while(userPositionsUsed.contains(userSelection) || opponentPositionsUsed.contains(userSelection)){
            System.out.println("Please choose another position");
            userSelection = scanner.nextInt();
        }
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
        userPositionsUsed.add(userSelection);
    }

    //method for getting and assigning opposition (computer) input to the array
    public void assignOpposingInput(char[][] boardLayout) {
        Random random = new Random();
        oppositionSelection = random.nextInt(9 + 1);
        while(userPositionsUsed.contains(oppositionSelection) || opponentPositionsUsed.contains(oppositionSelection)){
            oppositionSelection = random.nextInt(9 + 1);
        }
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
        opponentPositionsUsed.add(oppositionSelection);
    }

    //method to identify a winner - horizontal, vertical or diagonal 3 identical pieces - each winning combination is a list
    public String identifyWinner() {
        String winner = "";
        List<List> winningCombinations = new ArrayList<>();
        winningCombinations.add(Arrays.asList(1, 2, 3));
        winningCombinations.add(Arrays.asList(4, 5, 6));
        winningCombinations.add(Arrays.asList(7, 8, 9));
        winningCombinations.add(Arrays.asList(1, 4, 7));
        winningCombinations.add(Arrays.asList(2, 5, 8));
        winningCombinations.add(Arrays.asList(3, 6, 9));
        winningCombinations.add(Arrays.asList(1, 5, 9));
        winningCombinations.add(Arrays.asList(7, 5, 3));

        if (userPositionsUsed.contains(winningCombinations))
            winner = "User";
        else if (opponentPositionsUsed.contains(winningCombinations))
            winner = "Opposition";
        else if (userPositionsUsed.size() + opponentPositionsUsed.size() == 9)
            winner = "Tie!";
        return winner;
    }
}