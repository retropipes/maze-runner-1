package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractGround;

public class Ice extends AbstractGround {
    // Serialization
    private static final long serialVersionUID = 3007L;

    public Ice() {
	super("Ice", "Ice", true, true, false, false, false);
    }

    @Override
    public String getName() {
	return "Ice";
    }

    @Override
    public String toString() {
	return "ICE";
    }
}
