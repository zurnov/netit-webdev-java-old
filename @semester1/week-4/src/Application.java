import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rand = new Random();

        int move = 0;
        do {
            int randomNum = rand.nextInt(3);
            CommandProcessor.objectsPass(move,randomNum);
            CommandProcessor.chargingBattery(CommandProcessor.batteryCharge);
            CommandProcessor.preparingForAttack();
        }
        while(CommandProcessor.isRobotOFF() == false);
    }
}
