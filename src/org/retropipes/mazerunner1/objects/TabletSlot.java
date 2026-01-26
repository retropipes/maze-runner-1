package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractInfiniteLock;

public class TabletSlot extends AbstractInfiniteLock {
    // Serialization
    private static final long serialVersionUID = 202L;

    // Constructors
    public TabletSlot() {
	super("TabletSlot", "TabletSlot", new Tablet());
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	if (this.isConditionallySolid(inv)) {
	    Messager.showMessage("You need a tablet");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	if (this.isConditionallyDirectionallySolid(ie, dirX, dirY, inv)) {
	    Messager.showMessage("You need a tablet");
	}
    }

    @Override
    public String toString() {
	return "IL";
    }

    @Override
    public String getName() {
	return "Tablet Slot";
    }
}