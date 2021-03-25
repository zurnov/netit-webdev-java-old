import java.util.Random;
public class Dice {
	int rolledNumber;
	int sidesOfDice;
	public int roll() {
		Random random = new Random();
		return	rolledNumber = random.nextInt(sidesOfDice) + 1;
		
	}
}
