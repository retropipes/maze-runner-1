package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class ZKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 526L;

    // Constructors
    public ZKey() {
	super("ZKey", "ZKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "ZK";
    }

    @Override
    public String getName() {
	return "Z Key";
    }
}