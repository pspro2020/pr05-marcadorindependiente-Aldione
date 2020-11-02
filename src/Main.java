import Tools.Dice;
import Tools.DiceTask;

public class Main {

    public static void main(String[] args) {

        Thread t1, t2, t3;
        Dice dice;

        dice = new Dice();

        t1 = new Thread(new DiceTask(dice));
        t2 = new Thread(new DiceTask(dice));
        t3 = new Thread(new DiceTask(dice));

        startThreads(t1, t2, t3);
        startJoins(t1, t2, t3);

        dice.rolled();
    }



    private static void startThreads(Thread t1, Thread t2, Thread t3) {

        t1.start();
        t2.start();
        t3.start();

    }

    private static void startJoins(Thread t1, Thread t2, Thread t3) {

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            System.out.println("Error!!");
        }

    }

}
