package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.MazeGenericInfiniteKey;

public class MazeFKey extends MazeGenericInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 506L;

    // Constructors
    public MazeFKey() {
	super("FKey", "FKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "FK";
    }

    @Override
    public String getName() {
	return "F Key";
    }
}