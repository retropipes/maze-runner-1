package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeObject;
import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.AbstractField;

public class Water extends AbstractField {
    // Serialization
    private static final long serialVersionUID = 8004L;

    // Constructors
    public Water() {
	super("Water", "Water", new Boots(), true);
    }

    public Water(final Boots b) {
	super("Water", "Water", b, true);
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	Messager.showMessage("You'll drown");
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	Messager.showMessage("You'll drown");
    }

    @Override
    public void pushIntoAction(final Inventory inv, final MazeObject pushed, final int x, final int y, final int z,
	    final int w) {
	final MazeRunner app = MazeRunner.getApplication();
	if (pushed.isPushable()) {
	    app.morph(new SunkenBlock(), x, y, z, w);
	}
    }

    @Override
    public String getName() {
	return "Water";
    }

    @Override
    public String toString() {
	return "WATER";
    }
}
