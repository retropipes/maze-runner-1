package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractPass;

public class EnergySphere extends AbstractPass {
    // Serialization
    private static final long serialVersionUID = 8003L;

    // Constructors
    public EnergySphere() {
	super("EnergySphere", "EnergySphere");
    }

    @Override
    public String getName() {
	return "Energy Sphere";
    }

    @Override
    public String toString() {
	return "ES";
    }
}
