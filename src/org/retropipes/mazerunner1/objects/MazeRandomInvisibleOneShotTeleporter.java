package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeMaker;
import org.retropipes.mazerunner1.MazeObject;
import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.Messager;

public class MazeRandomInvisibleOneShotTeleporter extends MazeRandomInvisibleTeleporter {
    // Serialization
    private static final long serialVersionUID = 108L;

    // Constructors
    public MazeRandomInvisibleOneShotTeleporter() {
	super();
    }

    public MazeRandomInvisibleOneShotTeleporter(final int newRandomRangeY, final int newRandomRangeX) {
	super("Ground", "RandomInvisibleOneShotTeleporter", newRandomRangeY, newRandomRangeX);
    }

    // Scriptability
    @Override
    public void postMoveAction(final Inventory inv) {
	final MazeRunner app = MazeRunner.getApplication();
	app.decay();
	app.updatePosition(this.getDestinationRow(), this.getDestinationColumn());
	if (app.getMessageEnabled(MazeRunner.MESSAGE_INVISIBLE_TELEPORTER)) {
	    Messager.showMessage("Invisible Teleporter!");
	}
    }

    @Override
    public void postMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	final MazeRunner app = MazeRunner.getApplication();
	app.decay();
	app.updatePosition(this.getDestinationRow(), this.getDestinationColumn());
	if (app.getMessageEnabled(MazeRunner.MESSAGE_INVISIBLE_TELEPORTER)) {
	    Messager.showMessage("Invisible Teleporter!");
	}
    }

    @Override
    public String toString() {
	return "RIOT\n" + Integer.toString(this.getRandomRowRange()) + "\n"
		+ Integer.toString(this.getRandomColumnRange());
    }

    @Override
    public String getName() {
	return "Random Invisible One-Shot Teleporter";
    }

    @Override
    public MazeObject editorHook() {
	final MazeObject mo = MazeMaker.editTeleporterDestination(MazeMaker.TELEPORTER_TYPE_RANDOM_INVISIBLE_ONESHOT);
	return mo;
    }
}