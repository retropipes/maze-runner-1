package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;

public class FLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 606L;

    // Constructors
    public FLock() {
	super("FLock", "FLock", new FKey());
    }

    public FLock(final FKey mk) {
	super("FLock", "FLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a F key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a F key");
	}
    }

    @Override
    public String toString() {
	return "FL";
    }

    @Override
    public String getName() {
	return "F Lock";
    }
}