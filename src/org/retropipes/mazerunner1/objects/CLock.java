package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class CLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 603L;

    // Constructors
    public CLock() {
	super("CLock", "CLock", new CKey());
    }

    public CLock(final CKey mk) {
	super("CLock", "CLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a C key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a C key");
	}
    }

    @Override
    public String toString() {
	return "CL";
    }

    @Override
    public String getName() {
	return "C Lock";
    }
}