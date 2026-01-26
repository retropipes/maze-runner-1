package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class NKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 514L;

    // Constructors
    public NKey() {
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