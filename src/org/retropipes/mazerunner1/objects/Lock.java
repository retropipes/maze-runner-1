package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class Lock extends AbstractLock {
    // Serialization
    private static final long serialVersionUID = 201L;

    // Constructors
    public Lock() {
	super("Lock", "Lock", new Key());
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a key");
	}
    }

    @Override
    public String toString() {
	return "L";
    }

    @Override
    public String getName() {
	return "Lock";
    }
}