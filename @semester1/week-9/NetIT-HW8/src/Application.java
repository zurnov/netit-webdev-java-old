
public class Application {
	
	private static final int GAME_BOARD_ROW_SIZE = 4;
	private static final int GAME_BOARD_COL_SIZE = 8;
	private static final int TRAP_TILE_COUNT = 7;
	
	public static void main(String ars[]) {
		Dice TwoSidedDice = new Dice();
		TwoSidedDice.sidesOfDice = 5;
		TwoSidedDice.roll();
		System.out.println(TwoSidedDice.rolledNumber);
		
		
		
		Player playerOne = new Player();
		playerOne.setSymbol("|@|");
		playerOne.setCurrentPositionY(3);
		playerOne.setCurrentPositionX(7);
		
		
		Gameboard.generateTiles();
		Gameboard.generateStart();
		Gameboard.TrapTilesPlacer();
		Gameboard.ChanceTilesPlacer();
		Gameboard.InvestTilesPlacer();
		Gameboard.PartyTilesPlacer();
		Gameboard.StealTilesPlacer();
		Gameboard.renderPlayers(playerOne.getCurrentPositionY(),playerOne.getCurrentPositionX(),playerOne.getSymbol());
		Gameboard.render();
		
		if(playerOne.getCurrentPositionY() <= 3 && playerOne.getCurrentPositionX() == 0 ) {
			int destination = playerOne.getCurrentPositionY() - TwoSidedDice.rolledNumber;
			playerOne.setCurrentPositionY(destination);
		}
		if(playerOne.getCurrentPositionY() == 3 && playerOne.getCurrentPositionX() <= 7 ) {
			int destination = playerOne.getCurrentPositionX() - TwoSidedDice.rolledNumber;
			playerOne.setCurrentPositionX(destination);
		}
		if(playerOne.getCurrentPositionY() == 0 && playerOne.getCurrentPositionX() <= 7 ) {
			int destination = playerOne.getCurrentPositionX() + TwoSidedDice.rolledNumber;
			playerOne.setCurrentPositionX(destination);
		}
		if(playerOne.getCurrentPositionY() <= 3 && playerOne.getCurrentPositionX() == 7 ) {
			int destination = playerOne.getCurrentPositionY() + TwoSidedDice.rolledNumber;
			playerOne.setCurrentPositionY(destination);
		}
		
		
		
		
		
		Gameboard.renderPlayers(playerOne.getCurrentPositionY(),playerOne.getCurrentPositionX(),playerOne.getSymbol());
		Gameboard.render();
	}
    
}
