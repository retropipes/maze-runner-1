package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class NLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 614L;

    // Constructors
    public NLock() {
	super("NLock", "NLock", new NKey());
    }

    public NLock(final NKey mk) {
	super("NLock", "NLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need an N key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need an N key");
	}
    }

    @Override
    public String toString() {
	return "NL";
    }

    @Override
    public String getName() {
	return "N Lock";
    }
}