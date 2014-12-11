package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.olympians.Olympian;
import edu.marist.cmpt220l.olympians.Sex;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by john on 12/10/2014.
 */
public class Stack {
    private StackItem top;

    public static void main(String[] args){
        Stack newStack = new Stack();
        newStack.push(new Team(new Olympian("chad", Sex.MALE, 17), new Olympian("George", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("jeff", Sex.MALE, 17), new Olympian("penolope", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("Gross", Sex.MALE, 17), new Olympian("Annoy", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("Gross", Sex.MALE, 17), new Olympian("Annoy", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("Gross", Sex.MALE, 17), new Olympian("Annoy", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("Gross", Sex.MALE, 17), new Olympian("Annoy", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("HELLOI", Sex.MALE, 17), new Olympian("HEY", Sex.MALE, 17)));
        newStack.push(new Team(new Olympian("Gross", Sex.MALE, 17), new Olympian("Annoy", Sex.MALE, 17)));
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
        newStack.pop();
        System.out.println(newStack.top.value);
    }
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
