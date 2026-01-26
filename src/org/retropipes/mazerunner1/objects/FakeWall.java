package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractGround;

public class FakeWall extends AbstractGround {
    // Serialization
    private static final long serialVersionUID = 4L;

    // Constructors
    public FakeWall() {
	super("Wall", "FakeWall");
    }

    @Override
    public String toString() {
	return "FW";
    }

    @Override
    public String getName() {
	return "Fake Wall";
    }
}