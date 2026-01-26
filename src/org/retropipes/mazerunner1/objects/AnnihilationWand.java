package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWand;

public class AnnihilationWand extends AbstractWand {
    // Serialization
    private static final long serialVersionUID = 8203L;

    public AnnihilationWand() {
	super("AnnihilationWand", "AnnihilationWand");
    }

    @Override
    public String getName() {
	return "Annihilation Wand";
    }

    @Override
    public String toString() {
	return "AW";
    }

    @Override
    public void useHelper(final int x, final int y, final int z, final int w) {
	this.useAction(new Ground(), x, y, z, w);
    }
}
