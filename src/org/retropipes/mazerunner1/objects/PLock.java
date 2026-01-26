package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;

public class PLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 616L;

    // Constructors
    public PLock() {
	super("PLock", "PLock", new PKey());
    }

    public PLock(final PKey mk) {
	super("PLock", "PLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a P key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a P key");
	}
    }

    @Override
    public String toString() {
	return "PL";
    }

    @Override
    public String getName() {
	return "P Lock";
    }
}