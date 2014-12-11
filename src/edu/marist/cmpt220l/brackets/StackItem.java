package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by john on 12/10/2014.
 */
public class StackItem {
    public StackItem down;
    public Team value;

    public StackItem(Team team){
        this.value = team;
    }
}
