package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractPass;

public class Boots extends AbstractPass {
    // Serialization
    private static final long serialVersionUID = 8003L;

    // Constructors
    public Boots() {
	super("Boots", "Boots");
    }

    @Override
    public String getName() {
	return "Water-Walking Boots";
    }

    @Override
    public String toString() {
	return "BOOTS";
    }
}
