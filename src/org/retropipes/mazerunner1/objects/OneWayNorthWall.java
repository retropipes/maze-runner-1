package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWall;

public class OneWayNorthWall extends AbstractWall {
    // Serialization
    private static final long serialVersionUID = 162L;

    public OneWayNorthWall() {
	super(true, false, true, true, true, false, true, true, "OneWayNorthWall", "OneWayNorthWall");
    }

    @Override
    public String toString() {
	return "OWNW";
    }

    @Override
    public String getName() {
	return "One-Way North Wall";
    }
}
