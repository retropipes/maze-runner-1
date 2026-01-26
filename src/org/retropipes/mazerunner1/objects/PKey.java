package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class PKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 516L;

    // Constructors
    public PKey() {
	super("PKey", "PKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "PK";
    }

    @Override
    public String getName() {
	return "P Key";
    }
}