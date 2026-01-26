package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractMovableObject;

public class PushableBlock extends AbstractMovableObject {
    // Serialization
    private static final long serialVersionUID = 3004L;

    // Constructors
    public PushableBlock() {
	super("PushableBlock", "PushableBlock", true, false, new Tile());
    }

    @Override
    public String toString() {
	return "PB\n" + this.getSavedObject().toString();
    }

    @Override
    public String getName() {
	return "Pushable Block";
    }
}