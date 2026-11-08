package singletonPattern;

public class QueueManager {
    private static QueueManager instance;
    private int currentNumber;

    private QueueManager(){
        currentNumber = 0;
    }

    public static synchronized QueueManager getInstance() {
        if (instance == null)
            instance = new QueueManager();
        return instance;
    }

    public synchronized int getNextNumber(){
        currentNumber++;
        return currentNumber;
    }

    public synchronized int getCurrentNumber(){
        return currentNumber;
    }

    public synchronized void resetNumber(int newNumber){
        if (newNumber < 0)
            System.out.println("Invalid number! Queue number cannot be negative.");
        else
            currentNumber = newNumber;
    }
}
