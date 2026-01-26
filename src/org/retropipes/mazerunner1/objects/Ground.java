package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractGround;

public class Ground extends AbstractGround {
    // Serialization
    private static final long serialVersionUID = 2L;

    // Constructors
    public Ground() {
	super("Ground", "Ground");
    }

    @Override
    public String toString() {
	return "G";
    }

    @Override
    public String getName() {
	return "Ground";
    }
}