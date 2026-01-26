package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractGround;

public class SunkenBlock extends AbstractGround {
    // Serialization
    private static final long serialVersionUID = 33L;

    // Constructors
    public SunkenBlock() {
	super("SunkenBlock", "SunkenBlock", true, true, true, true);
    }

    @Override
    public String toString() {
	return "SB";
    }

    @Override
    public String getName() {
	return "Sunken Block";
    }
}