package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class LKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 512L;

    // Constructors
    public LKey() {
	super("LKey", "LKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "LK";
    }

    @Override
    public String getName() {
	return "L Key";
    }
}