package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWand;

public class FinishMakingWand extends AbstractWand {
    // Serialization
    private static final long serialVersionUID = 8201L;

    public FinishMakingWand() {
	super("FinishMakingWand", "FinishMakingWand");
    }

    @Override
    public String getName() {
	return "Finish-Making Wand";
    }

    @Override
    public String toString() {
	return "FMW";
    }

    @Override
    public void useHelper(final int x, final int y, final int z, final int w) {
	this.useAction(new Finish(), x, y, z, w);
    }
}
