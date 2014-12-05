package edu.marist.cmpt220l.events;

import edu.marist.cmpt220l.teams.TeamManager;

/**
 * The event manager manages the events in the application
 */
public class EventManager {
    private Event[] events;

    /**
     * Construct a new EventManager
     */
    public EventManager(TeamManager team) {
        events = new Event[] {
                new WashoosEvent(team.getTeams()),
                new HorseshoesEvent(team.getTeams()),
                new CornHoleEvent(team.getTeams()),
                new CanJamEvent(team.getTeams()),
                new LadderBallEvent(team.getTeams()),
                new StickGameEvent(team.getTeams())
        };
    }

    /**
     * Retrieve the events
     *
     * @return the events
     */
    public Event[] getEvents() {
        return events;
    }
}
