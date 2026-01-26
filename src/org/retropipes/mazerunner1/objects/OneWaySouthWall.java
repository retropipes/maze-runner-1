package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWall;

public class OneWaySouthWall extends AbstractWall {
    // Serialization
    private static final long serialVersionUID = 163L;

    public OneWaySouthWall() {
	super(false, true, true, true, false, true, true, true, "OneWaySouthWall", "OneWaySouthWall");
    }

    @Override
    public String toString() {
	return "OWSW";
    }

    @Override
    public String getName() {
	return "One-Way South Wall";
    }
}
