package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.Messager;
import org.retropipes.mazerunner1.objects.abc.MazeGenericWall;

public class MazeInvisibleWall extends MazeGenericWall {
    // Serialization
    private static final long serialVersionUID = 5L;

    // Constructors
    public MazeInvisibleWall() {
	super("Ground", "InvisibleWall");
    }

    // Scriptability
    @Override
    public void preMoveAction(final Inventory inv) {
	// Display invisible wall message, if it's enabled
	final MazeRunner app = MazeRunner.getApplication();
	if (app.getMessageEnabled(MazeRunner.MESSAGE_INVISIBLE_WALL)) {
	    Messager.showMessage("Invisible Wall!");
	}
    }

    @Override
    public void preMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	// Display invisible wall message, if it's enabled
	final MazeRunner app = MazeRunner.getApplication();
	if (app.getMessageEnabled(MazeRunner.MESSAGE_INVISIBLE_WALL)) {
	    Messager.showMessage("Invisible Wall!");
	}
    }

    @Override
    public String toString() {
	return "IW";
    }

    @Override
    public String getName() {
	return "Invisible Wall";
    }
}