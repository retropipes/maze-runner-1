package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteKey;

public class KKey extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 511L;

    // Constructors
    public KKey() {
	super("KKey", "KKey");
    }

    // Scriptability
    @Override
    public String toString() {
	return "KK";
    }

    @Override
    public String getName() {
	return "K Key";
    }
}