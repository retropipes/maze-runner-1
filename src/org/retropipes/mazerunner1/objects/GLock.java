package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;
import org.retropipes.mazerunner1.objects.base.Inventory;

public class GLock extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 607L;

    // Constructors
    public GLock() {
	super("GLock", "GLock", new GKey());
    }

    public GLock(final GKey mk) {
	super("GLock", "GLock", mk);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a G key");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a G key");
	}
    }

    @Override
    public String toString() {
	return "GL";
    }

    @Override
    public String getName() {
	return "G Lock";
    }
}