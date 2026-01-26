package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.MazeGenericGround;

public class MazeIce extends MazeGenericGround {
    // Serialization
    private static final long serialVersionUID = 3007L;

    public MazeIce() {
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
