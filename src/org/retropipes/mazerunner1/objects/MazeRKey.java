package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.MazeGenericInfiniteKey;

public class MazeRKey extends MazeGenericInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 518L;

    // Constructors
    public MazeRKey() {
	super("RKey", "RKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "RK";
    }

    @Override
    public String getName() {
	return "R Key";
    }
}