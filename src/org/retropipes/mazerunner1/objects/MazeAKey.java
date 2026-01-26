package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.MazeGenericInfiniteKey;

public class MazeAKey extends MazeGenericInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 501L;

    // Constructors
    public MazeAKey() {
	super("AKey", "AKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "AK";
    }

    @Override
    public String getName() {
	return "A Key";
    }
}