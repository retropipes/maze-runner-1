package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractKey;

public class Bomb extends AbstractKey {
    // Serialization
    private static final long serialVersionUID = 301L;

    // Constructors
    public Bomb() {
	super("Bomb", "Bomb");
    }

    @Override
    public String toString() {
	return "K1";
    }

    @Override
    public String getName() {
	return "Bomb";
    }
}