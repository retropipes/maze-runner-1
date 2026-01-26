package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.objects.abc.AbstractMovableObject;
import org.retropipes.mazerunner1.objects.base.Inventory;
import org.retropipes.mazerunner1.objects.base.MazeObject;

public class PullableBlock extends AbstractMovableObject {
    // Serialization
    private static final long serialVersionUID = 3005L;

    // Constructors
    public PullableBlock() {
	super("PullableBlock", "PullableBlock", false, true, new Tile());
    }

    @Override
    public void pullAction(final Inventory inv, final MazeObject mo, final int x, final int y, final int pushX,
	    final int pushY) {
	final MazeObject obj = this.getSavedObject();
	final MazeRunner app = MazeRunner.getApplication();
	app.updatePulledPosition(x, y, pushX, pushY, obj, this);
	this.setSavedObject(mo);
    }

    @Override
    public String toString() {
	return "UB\n" + this.getSavedObject().toString();
    }

    @Override
    public String getName() {
	return "Pullable Block";
    }
}