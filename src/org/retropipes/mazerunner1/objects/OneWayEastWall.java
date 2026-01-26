package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWall;

public class OneWayEastWall extends AbstractWall {
    // Serialization
    private static final long serialVersionUID = 160L;

    public OneWayEastWall() {
	super(true, true, true, false, true, true, true, false, "OneWayEastWall", "OneWayEastWall");
    }

    @Override
    public String toString() {
	return "OWEW";
    }

    @Override
    public String getName() {
	return "One-Way East Wall";
    }
}
