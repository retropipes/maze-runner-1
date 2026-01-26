package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class RKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 518L;

    // Constructors
    public RKey() {
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