package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractKey;

public class Key extends AbstractKey {
    // Serialization
    private static final long serialVersionUID = 101L;

    // Constructors
    public Key() {
	super("Key", "Key");
    }

    // Scriptability
    @Override
    public String toString() {
	return "K";
    }

    @Override
    public String getName() {
	return "Key";
    }
}