package internTasks;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;


        while (!gameOver)
        {
            printBoard(board);
            System.out.println(player + "Enter your move:");
            int row = in.nextInt();

            int col = in.nextInt();



            if (board[row][col] == ' ')
            {
                board[row][col] = player;
                if (havewon(board, player))
                {
                    System.out.println("Hurray !!");
                    System.out.println(player + " won the game :)");
                    printBoard(board);
                    gameOver = true;
                }

                else {
                    if (player == 'X') {
                        player = 'O';

                    } else {
                        player = 'X';
                    }
                }
            }

            else {
                System.out.println("Invalid move, try again :) ");
            }

        }
    }



    public static void printBoard ( char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
    //heart point
    public static boolean havewon( char[][] board, char player)
    {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][1] == player) {
            return true;

        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean isFilled ( char[][] board){
        boolean isFull=true;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    isFull=false;
                    break;
                } if(!isFull){
                    break;
                }
            }

        }
        return isFull;
    }
}

