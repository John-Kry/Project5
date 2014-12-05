package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.olympians.Olympian;
import edu.marist.cmpt220l.olympians.Sex;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by john on 12/3/2014.
 */
public class Queue {
    public static void main(String[] args){
        Queue newQueue = new Queue();
        newQueue.enqueue(new Team(new Olympian("John", Sex.MALE,17),new Olympian("Jacob", Sex.MALE,17)));
        newQueue.enqueue(new Team(new Olympian("Geoff", Sex.MALE,17),new Olympian("George", Sex.MALE,17)));
        System.out.println(newQueue.first.value);
        System.out.println(newQueue.last.value);
        newQueue.dequeue();
        System.out.println(newQueue.first.value);
        System.out.println(newQueue.last.value);
        newQueue.dequeue();
        newQueue.dequeue();
    }
    private QueueItem first;
    private QueueItem last;
    public void enqueue(Team team){
        QueueItem newTeam = new QueueItem(team);
        if (last!=null){
            last.next = newTeam;
            last = newTeam;
        }else{
            first = newTeam;
            last = newTeam;
        }
    }
    public Team dequeue(){
        if (first == null){
            System.out.println("Error removing teams");
            return null;
        }
        QueueItem currTeam = first;
        first = first.next;
        return currTeam.value;
    }
}
