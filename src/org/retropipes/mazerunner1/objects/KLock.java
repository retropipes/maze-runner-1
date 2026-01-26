package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;

public class KLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 611L;

    // Constructors
    public KLock() {
	super("KLock", "KLock", new KKey());
    }

    public KLock(final KKey mk) {
	super("KLock", "KLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a K key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a K key");
	}
    }

    @Override
    public String toString() {
	return "KL";
    }

    @Override
    public String getName() {
	return "K Lock";
    }
}