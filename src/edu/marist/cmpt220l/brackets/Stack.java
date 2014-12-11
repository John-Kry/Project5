package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.olympians.Olympian;
import edu.marist.cmpt220l.olympians.Sex;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by john on 12/10/2014.
 */
public class Stack {
    private StackItem top;

    public Team pop(){
        if (top == null){
            System.out.println("Cannot pop another team");
            return null;
        }
        StackItem poppedTeam = top;
        top = top.down;
        return poppedTeam.value;
    }
    public void push(Team team){
        StackItem newTeam = new StackItem(team);
        if (top != null){
            newTeam.down = top;
            top = newTeam;
        }else{
            top = newTeam;
            top.down = null;
        }
    }
}
