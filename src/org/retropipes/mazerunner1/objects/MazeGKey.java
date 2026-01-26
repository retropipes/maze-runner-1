package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.MazeGenericInfiniteKey;

public class MazeGKey extends MazeGenericInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 507L;

    // Constructors
    public MazeGKey() {
	super("GKey", "GKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "GK";
    }

    @Override
    public String getName() {
	return "G Key";
    }
}