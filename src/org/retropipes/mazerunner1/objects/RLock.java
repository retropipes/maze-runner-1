package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class RLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 618L;

    // Constructors
    public RLock() {
	super("RLock", "RLock", new RKey());
    }

    public RLock(final RKey mk) {
	super("RLock", "RLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need an R key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need an R key");
	}
    }

    @Override
    public String toString() {
	return "RL";
    }

    @Override
    public String getName() {
	return "R Lock";
    }
}