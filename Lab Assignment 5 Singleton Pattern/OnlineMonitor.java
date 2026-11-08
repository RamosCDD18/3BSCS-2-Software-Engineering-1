package singletonPattern;

public class OnlineMonitor {

    public void display(){
        QueueManager queue = QueueManager.getInstance();
        System.out.println("[Online Monitor] Now serving queue number: " + queue.getCurrentNumber());
    }

}
