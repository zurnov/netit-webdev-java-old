
public class Player {
	
	private String symbol;
	private int money;
	private int currentPositionY;
	private int currentPositionX;
	private int rolledPositionY;
	private int rolledPositionX;
	
	
	public void setSymbol(String symbol) {
		 this.symbol = symbol;
	}
	public String getSymbol() {
		return this.symbol;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}
	public void setCurrentPositionY(int currentPositionY) {
		this.currentPositionY = currentPositionY;
	}
	public int getCurrentPositionY() {
		return this.currentPositionY;
	}
	public void setCurrentPositionX(int currentPositionX) {
		this.currentPositionX = currentPositionX;
	}
	public int getCurrentPositionX() {
		return this.currentPositionX;
	}
	public void setRolledPositionY(int rolledPositionY) {
		this.rolledPositionY = rolledPositionY;
	}
	public int getRolledPositionY() {
		return this.rolledPositionY;
	}
	public void setRolledPositionX(int rolledPositionX) {
		this.rolledPositionX = rolledPositionX;
	}
	public int getRolledPositionX() {
		return this.rolledPositionX;
	}
}
