package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.MazeGenericField;

public class MazeForceField extends MazeGenericField {
    // Serialization
    private static final long serialVersionUID = 8004L;

    // Constructors
    public MazeForceField() {
	super("ForceField", "ForceField", new MazeEnergySphere());
    }

    public MazeForceField(final MazeEnergySphere e) {
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
