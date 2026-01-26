package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class GKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 507L;

    // Constructors
    public GKey() {
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