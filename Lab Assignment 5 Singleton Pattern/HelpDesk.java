package singletonPattern;

public class HelpDesk {
    private String name;

    public HelpDesk(String name){
        this.name = name;
    }

    public void issueNumber(){
        QueueManager queue = QueueManager.getInstance();
        System.out.println(name + " gave queue number " + queue.getNextNumber());
    }
    public void resetQueue(int newNumber){
        QueueManager queue = QueueManager.getInstance();
        queue.resetNumber(newNumber);
        System.out.println(name + " reset the queue to " + newNumber);
    }
}
