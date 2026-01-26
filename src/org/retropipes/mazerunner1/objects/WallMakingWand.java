package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.objects.abc.AbstractWand;

public class WallMakingWand extends AbstractWand {
    // Serialization
    private static final long serialVersionUID = 8202L;

    public WallMakingWand() {
	super("WallMakingWand", "WallMakingWand");
    }

    @Override
    public String getName() {
	return "Wall-Making Wand";
    }

    @Override
    public String toString() {
	return "WMW";
    }

    @Override
    public void useHelper(final int x, final int y, final int z, final int w) {
	this.useAction(new Wall(), x, y, z, w);
    }
}
