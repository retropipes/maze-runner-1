package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractField;

public class ForceField extends AbstractField {
    // Serialization
    private static final long serialVersionUID = 8004L;

    // Constructors
    public ForceField() {
	super("ForceField", "ForceField", new EnergySphere());
    }

    public ForceField(final EnergySphere e) {
	super("ForceField", "ForceField", e);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	Messager.showMessage("You'll get zapped");
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	Messager.showMessage("You'll get zapped");
    }

    @Override
    public String getName() {
	return "Force Field";
    }

    @Override
    public String toString() {
	return "FORCE";
    }
}
