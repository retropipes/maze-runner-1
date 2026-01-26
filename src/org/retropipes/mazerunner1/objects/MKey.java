package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class MKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 513L;

    // Constructors
    public MKey() {
	super("MKey", "MKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "MK";
    }

    @Override
    public String getName() {
	return "M Key";
    }
}