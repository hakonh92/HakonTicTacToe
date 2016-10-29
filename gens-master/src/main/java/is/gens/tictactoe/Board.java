package is.gens.tictactoe;
import java.util.Scanner;

public class Board {

	public static void initialize_table(char[][] table, int rows_size, int column_size) {
	    int counter = 48;
	    for(int row = 0; row < rows_size; row++)
	    {
	        for(int col = 0; col < column_size; col++)
	         {
	         	counter = counter + 1;
	         	char i = (char)counter;
	           	table[row][col] = i;
	         }
	     }
	}



	public static void displayBoard(char[][] table) {
    		int rows_size = 3;
    		int column_size = 3;

    		if(table[0][0] != ' ')
    		{
			System.out.println(table[0][0] + " | " + table[0][1] + " | " + table[0][2] );
    			System.out.println("_________");
			System.out.println(table[1][0] + " | " + table[1][1] + " | " + table[1][2] );
			System.out.println("_________");
			System.out.println(table[2][0] + " | " + table[2][1] + " | " + table[2][2] );
			System.out.println("");
			System.out.println("Player one make your move!");
    		}
		else {
	    		System.out.println("Empty board");
		}

	}	

	public static boolean can_move(char table[][], char player_o, char player_x) {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (table[i][j] != player_x && table[i][j] != player_o)
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}

	public static void newEmptyTable(char[][]) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				tableEmpty[i][j];
			}
		}
		System.out.println(table[0][0] + " | " + table[0][1] + " | " + table[0][2] );
		System.out.println("---------");
		System.out.println(table[1][0] + " | " + table[1][1] + " | " + table[1][2] );
		System.out.println("---------");
		System.out.println(table[2][0] + " | " + table[2][1] + " | " + table[2][2] );
	}

	public static void make_move(char table[][], char player) {

		boolean free = can_move;

		for(int i = 1; i < 9; i++) {

			if(i % 2 == 0) {
				System.out.println("Player one make your move!");
			}
			else {
				System.out.println("player two make your move!");
			}
		}
	}
}















