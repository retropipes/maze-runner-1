package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class AKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 501L;

    // Constructors
    public AKey() {
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