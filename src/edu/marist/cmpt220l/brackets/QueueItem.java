package edu.marist.cmpt220l.brackets;

/**
 * Created by john on 12/3/2014.
 */
public class QueueItem {
    public QueueItem next;
    public int value;

    public QueueItem(int value) {
        this.value = value;
    }
}
