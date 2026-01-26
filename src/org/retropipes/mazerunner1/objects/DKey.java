package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class DKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 504L;

    // Constructors
    public DKey() {
	super("DKey", "DKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "DK";
    }

    @Override
    public String getName() {
	return "D Key";
    }
}