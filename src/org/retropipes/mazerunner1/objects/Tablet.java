package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class Tablet extends AbstractInfiniteKey {
    // Fields related to serialization
    private static final long serialVersionUID = 102L;

    // Constructors
    public Tablet() {
	super("Tablet", "Tablet");
    }

    @Override
    public String toString() {
	return "IK";
    }

    @Override
    public String getName() {
	return "Tablet";
    }
}