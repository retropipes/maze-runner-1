package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class FKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 506L;

    // Constructors
    public FKey() {
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