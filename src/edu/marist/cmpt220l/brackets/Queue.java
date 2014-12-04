package edu.marist.cmpt220l.brackets;

/**
 * Created by john on 12/3/2014.
 */
public class Queue {
    private QueueItem first;
    private QueueItem last;
    public void enqueue(int value){
        QueueItem newVal = new QueueItem(value);
        if (last!=null){
            last.next = newVal;
            last = newVal;
        }
    }
    public int dequeue(){
        if (first ==null){
            System.out.println("Error removing teams");
        }
        QueueItem currVal = first;
        first = first.next;
        return currVal.value;
    }
}
