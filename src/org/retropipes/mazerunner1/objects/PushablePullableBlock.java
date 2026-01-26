package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeObject;
import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.objects.abc.AbstractMovableObject;

public class PushablePullableBlock extends AbstractMovableObject {
    // Serialization
    private static final long serialVersionUID = 3006L;

    // Constructors
    public PushablePullableBlock() {
	super("PushablePullableBlock", "PushablePullableBlock", true, true, new Tile());
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
	return "PUB\n" + this.getSavedObject().toString();
    }

    @Override
    public String getName() {
	return "Pushable/Pullable Block";
    }
}
