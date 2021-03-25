import java.util.Random;

public class Gameboard {
	private static final int GAME_BOARD_ROW_SIZE 	= 4;
	private static final int GAME_BOARD_COL_SIZE	= 8;
	private static final int GAME_BOARD_OFFSET 		= 1;
	
	private static final int TRAP_TILE_COUNT 		= 7;
	private static final int CHANCE_TILE_COUNT 		= 3;
	private static final int INVEST_TILE_COUNT 		= 3;
	private static final int PARTYHARD_TILE_COUNT 	= 3;
	private static final int STEAL_TILE_COUNT 		= 3;
	
	private static String[][] gameBoard = new String [4][8];
		
	public static void renderPlayers(int playerPosY, int playerPosX,String symbol) {
    	gameBoard[playerPosY][playerPosX] = symbol;
    }
		public static void generateTiles() {
			for(int row = 0; row <= GAME_BOARD_ROW_SIZE - GAME_BOARD_OFFSET; row++) {
				for(int col = 0; col <= GAME_BOARD_COL_SIZE - GAME_BOARD_OFFSET; col++) {
					if(row == 0 || row == GAME_BOARD_ROW_SIZE - GAME_BOARD_OFFSET  || 
							col == 0 || col == GAME_BOARD_COL_SIZE - GAME_BOARD_OFFSET) {
						gameBoard[row][col] = "|X|";
						}
						else {
							gameBoard[row][col] = "   ";
						}
				}
			}
		}
		public static void render() {
			for(int row = 0; row <= GAME_BOARD_ROW_SIZE - GAME_BOARD_OFFSET; row++) {
				for(int col = 0; col <= GAME_BOARD_COL_SIZE - GAME_BOARD_OFFSET; col++) {
					if(row == 0 || row == GAME_BOARD_ROW_SIZE - GAME_BOARD_OFFSET  || 
							col == 0 || col == GAME_BOARD_COL_SIZE - GAME_BOARD_OFFSET) {
						System.out.print(gameBoard[row][col]);
						}
						else {
							System.out.print(gameBoard[row][col]);
						}
				}
				System.out.println(" ");
			}
		}
		 public static void generateStart() {
		    	gameBoard[3][7] = "|S|";
		    } 
		 private static void generateTrap() {
	    	
		    	Random randomrow = new Random();
		    	int row = randomrow.nextInt(4);
		    	
		    	Random randomcol = new Random();
		    	int col = randomcol.nextInt(8);
		    	
		    	if(gameBoard[row][col].equals("|X|")) {
		    		gameBoard[row][col] = "|T|";
		    	}
		    	else {
		    		generateTrap();
		    	}
		    }
		    
		 private static void generateChance() {

		    	Random randomrow = new Random();
		    	int row = randomrow.nextInt(4);
		    	
		    	Random randomcol = new Random();
		    	int col = randomcol.nextInt(8);
		    	
		    	if(gameBoard[row][col].equals("|X|")) {
		    		gameBoard[row][col] = "|C|";
		    	}
		    	else {
		    		generateChance();
		    	}
		    }
		    
		 private static void generateParty() {

		    	Random randomrow = new Random();
		    	int row = randomrow.nextInt(4);
		    	
		    	Random randomcol = new Random();
		    	int col = randomcol.nextInt(8);
		    	
		    	if(gameBoard[row][col].equals("|X|")) {
		    		gameBoard[row][col] = "|P|";
		    	}
		    	else {
		    		generateParty();
		    	}
		    }
		 private static void generateInvest() {

		    	Random randomrow = new Random();
		    	int row = randomrow.nextInt(4);
		    	
		    	Random randomcol = new Random();
		    	int col = randomcol.nextInt(8);
		    	
		    	if(gameBoard[row][col].equals("|X|")) {
		    		gameBoard[row][col] = "|I|";
		    	}
		    	else {
		    		generateInvest();
		    	}
		    }
		 private static void generateSteal() {

		    	Random randomrow = new Random();
		    	int row = randomrow.nextInt(4);
		    	
		    	Random randomcol = new Random();
		    	int col = randomcol.nextInt(8);
		    	
		    	if(gameBoard[row][col].equals("|X|")) {
		    		gameBoard[row][col] = "|K|";
		    	}
		    	else {
		    		generateSteal();
		    	}
		    }
		 public static void TrapTilesPlacer() {
			 for(int counter = 0; counter < TRAP_TILE_COUNT ;counter++) {
				 generateTrap();
			 }
			}
		 public static void ChanceTilesPlacer() {
			 for(int counter = 0; counter < CHANCE_TILE_COUNT ;counter++) {
				 generateChance();
			 }
		 }
		 public static void InvestTilesPlacer() {
			 for(int counter = 0; counter < INVEST_TILE_COUNT ;counter++) {
				 generateInvest();
			 }
		 }
		 public static void PartyTilesPlacer() {
			 for(int counter = 0; counter < PARTYHARD_TILE_COUNT ;counter++) {
				 generateParty();
			 }
		 }
		 public static void StealTilesPlacer() {
			 for(int counter = 0; counter < STEAL_TILE_COUNT ;counter++) {
				 generateSteal();
			 }
		 }
}