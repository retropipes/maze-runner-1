package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractGround;

public class Tile extends AbstractGround {
    // Serialization
    private static final long serialVersionUID = 3004L;

    // Constructors
    public Tile() {
	super("Tile", "Tile", true, true, true, true);
    }

    @Override
    public String toString() {
	return "TILE";
    }

    @Override
    public String getName() {
	return "Tile";
    }
}