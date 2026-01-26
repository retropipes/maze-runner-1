package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class UKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 521L;

    // Constructors
    public UKey() {
	super("UKey", "UKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "UK";
    }

    @Override
    public String getName() {
	return "U Key";
    }
}