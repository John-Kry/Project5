package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.olympians.Olympian;
import edu.marist.cmpt220l.olympians.Sex;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by john on 12/3/2014.
 */
public class Queue {

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
