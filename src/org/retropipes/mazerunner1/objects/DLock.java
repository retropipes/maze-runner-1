package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class DLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 604L;

    // Constructors
    public DLock() {
	super("DLock", "DLock", new DKey());
    }

    public DLock(final DKey mk) {
	super("DLock", "DLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a D key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a D key");
	}
    }

    @Override
    public String toString() {
	return "DL";
    }

    @Override
    public String getName() {
	return "D Lock";
    }
}