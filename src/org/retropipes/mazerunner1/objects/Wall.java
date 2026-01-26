package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWall;

public class Wall extends AbstractWall {
    // Serialization
    private static final long serialVersionUID = 3L;

    // Constructors
    public Wall() {
	super("Wall", "Wall");
    }

    @Override
    public String toString() {
	return "W";
    }

    @Override
    public String getName() {
	return "Wall";
    }
}