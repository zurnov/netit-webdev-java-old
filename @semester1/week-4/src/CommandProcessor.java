import java.util.Random;

public class CommandProcessor {
    public static final int RANDOM_NUMBER_INDEX_MOVER = 1;
    public static int batteryCharge = 4;


    public static void objectsPass(int move, int randomNum){

        if(randomNum == 0){
            do {
                Console.log("There is nothing in front of you!");
                Console.log("Forward [1] / Jump [2] / Sideway [3] ");
                move = Console.promt("Where should robot go?");
            }
            while(move != randomNum + RANDOM_NUMBER_INDEX_MOVER);
        }
        else if(randomNum == 1){
            do {
                Console.log("There is chair in front of you!");
                Console.log("Forward [1] / Jump [2] / Sideway [3] ");
                move = Console.promt("Where should robot go?");
            }
            while(move != randomNum + RANDOM_NUMBER_INDEX_MOVER);
        }
        else{
            do {
                Console.log("There is wall in front of you!");
                Console.log("Forward [1] / Jump [2] / Sideway [3] ");
                move = Console.promt("Where should robot go?");
            }
            while(move != randomNum + RANDOM_NUMBER_INDEX_MOVER);
        }
    }
    public static void preparingForAttack(){
        if(isAttackValid() && isBatteryCharged(batteryCharge)){
            Console.log("Preparing for an attack!");
            isHitFatalForTheFurniture();
            batteryCharge--;
        }
        else {
            Console.log("Can't attack right now!");
        }
    }
    public static boolean isAttackValid(){
        Random random = new Random();
        int pixels = random.nextInt(10);
        if(pixels % 2 == 0){
            Console.log("Mouse Detected!");
            return true;
        }
        Console.log("No detected mouse!");
        return false;
    }
    public static boolean isBatteryCharged(int batteryCharge){
    if(batteryCharge == 0){
        return false;
    }
    else{
        return true;
    }

    }
    public static void chargingBattery(int batteryCharge){
        Random random = new Random();
        int num1 = random.nextInt(1000);
        int num2 = random.nextInt(1000);
        if(isBatteryCharged(batteryCharge)){
            Console.log("No need for charge!");
        }
        else {
            do {
                Console.log("Charging battery.");
                batteryCharge++;
            }
            while (num1 < num2 && batteryCharge != 3);

        }
    }
    public static boolean isHitFatalForTheFurniture(){
        Random random = new Random();
        int rand = random.nextInt(10);
        if(rand + RANDOM_NUMBER_INDEX_MOVER == 5 ){
            Console.log("The robot destroyed the furniture by mistake!");
            return true;
        }
        Console.log("The robot destroyed that mouse! And the furniture is safe!");
        return false;
    }
    public static boolean isRobotOFF(){
        Console.log("Do you want to turn off the robot?");
        int robotOFF = Console.promt("[0] NO / [1] YES");
        if(robotOFF == 1){
            for(int i = 10; i > 0;i--){
                if(i % 2 == 0){
                    Console.log(i +" I am a Robott");
                }
                else {
                    Console.log("" + i);
                }
            }
            return true;
        }
        return false;
    }
}
