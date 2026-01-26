package org.retropipes.mazerunner1.objects.abc;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeObject;
import org.retropipes.mazerunner1.MazeRunner;

public abstract class AbstractLock extends MazeObject {
    // Field declarations
    AbstractKey key;
    // Serialization
    private static final long serialVersionUID = 7999L;

    // Constructors
    protected AbstractLock(final String gameAppearance, final String editorAppearance, final AbstractKey mgk) {
	super(true, gameAppearance, editorAppearance);
	this.key = mgk;
    }

    // Accessor methods
    public AbstractKey getKey() {
	return this.key;
    }

    // Scriptability
    @Override
    public abstract void preMoveAction(final Inventory inv);

    @Override
    public abstract void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv);

    @Override
    public void postMoveAction(final Inventory inv) {
	inv.removeItem(this.key);
	final MazeRunner app = MazeRunner.getApplication();
	app.decay();
    }

    @Override
    public void postMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	inv.removeItem(this.key);
	final MazeRunner app = MazeRunner.getApplication();
	app.decay();
    }

    @Override
    public boolean isConditionallySolid(final Inventory inv) {
	return !inv.isItemThere(this.key);
    }

    @Override
    public boolean isConditionallyDirectionallySolid(final boolean ie, final int dirX, final int dirY,
	    final Inventory inv) {
	return !inv.isItemThere(this.key);
    }

    @Override
    public abstract String toString();

    @Override
    public abstract String getName();

    @Override
    public boolean equals(final Object obj) {
	final AbstractLock mgl = (AbstractLock) obj;
	if (super.equals(mgl) && this.key.equals(mgl.key)) {
	    return true;
	} else {
	    return false;
	}
    }
}