package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class CKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 503L;

    // Constructors
    public CKey() {
	super("CKey", "CKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "CK";
    }

    @Override
    public String getName() {
	return "C Key";
    }
}