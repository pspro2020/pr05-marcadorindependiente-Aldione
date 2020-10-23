package Tools;

import java.util.Random;

public class Dice {

    private int[] numbers = new int[6];
    private Object[] roll = new Object[] {new Object(), new Object(), new Object(), new Object(), new Object(), new Object()};

    public void useDice(int number){

        synchronized (roll[number-1]){
            numbers[number-1]++;
        }

    }

    public void rolled() {
        int times = 0;

        for(int i = 0; i < numbers.length; i++){
            System.out.printf("Number %d: %d times\n", i+1, numbers[i]);
            times += numbers[i];
        }

        System.out.printf("Total: %d + %d + %d + %d + %d + %d = %d\n", numbers[0], numbers[1],
                numbers[2], numbers[3], numbers[4], numbers[5], times);
    }

}
