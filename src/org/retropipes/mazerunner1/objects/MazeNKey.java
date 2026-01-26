package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.MazeGenericInfiniteKey;

public class MazeNKey extends MazeGenericInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 514L;

    // Constructors
    public MazeNKey() {
	super("NKey", "NKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "NK";
    }

    @Override
    public String getName() {
	return "N Key";
    }
}