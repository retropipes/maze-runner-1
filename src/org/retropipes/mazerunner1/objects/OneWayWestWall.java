package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWall;

public class OneWayWestWall extends AbstractWall {
    // Serialization
    private static final long serialVersionUID = 161L;

    public OneWayWestWall() {
	super(true, true, false, true, true, true, false, true, "OneWayWestWall", "OneWayWestWall");
    }

    @Override
    public String toString() {
	return "OWWW";
    }

    @Override
    public String getName() {
	return "One-Way West Wall";
    }
}
