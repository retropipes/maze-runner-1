package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class ZLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 626L;

    // Constructors
    public ZLock() {
	super("ZLock", "ZLock", new ZKey());
    }

    public ZLock(final ZKey mk) {
	super("ZLock", "ZLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a Z key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a Z key");
	}
    }

    @Override
    public String toString() {
	return "ZL";
    }

    @Override
    public String getName() {
	return "Z Lock";
    }
}