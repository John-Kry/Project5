package edu.marist.cmpt220l.brackets;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by john on 12/3/2014.
 */
public class QueueItem {
    public QueueItem next;
    public Team value;

    public QueueItem(Team team) {
        this.value = team;
    }
}
