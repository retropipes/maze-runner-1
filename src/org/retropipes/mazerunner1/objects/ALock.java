package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;

public class ALock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 601L;

    // Constructors
    public ALock() {
	super("ALock", "ALock", new AKey());
    }

    public ALock(final AKey mk) {
	super("ALock", "ALock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need an A key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need an A key");
	}
    }

    @Override
    public String toString() {
	return "AL";
    }

    @Override
    public String getName() {
	return "A Lock";
    }
}