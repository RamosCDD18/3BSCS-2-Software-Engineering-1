package singletonPattern;

public class QueueApp {
    public static void main(String[] args){
        HelpDesk desk1 = new HelpDesk("Help Desk 1");
        HelpDesk desk2 = new HelpDesk("Help Desk 2");
        HelpDesk desk3 = new HelpDesk("Help Desk 3");
        OnlineMonitor monitor = new OnlineMonitor();

        desk1.issueNumber();
        desk2.issueNumber();
        desk3.issueNumber();
        desk1.issueNumber();

        monitor.display();
      
        desk2.resetQueue(100);

        desk3.issueNumber();
        monitor.display();

        QueueManager a = QueueManager.getInstance();
        QueueManager b = QueueManager.getInstance();
        System.out.println("Same instance? " + (a == b));
    }
}
