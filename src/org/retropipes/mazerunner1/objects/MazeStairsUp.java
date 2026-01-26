package org.retropipes.mazerunner1.objects;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeMaker;
import org.retropipes.mazerunner1.MazeObject;
import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.objects.abc.MazeGenericTeleporter;

public class MazeStairsUp extends MazeGenericTeleporter {
    // Serialization
    private static final long serialVersionUID = 3001L;

    // Constructors
    public MazeStairsUp() {
	super("StairsUp", "StairsUp", 0, 0, 0, 0);
    }

    @Override
    public String toString() {
	return "UP";
    }

    @Override
    public String getName() {
	return "Stairs Up";
    }

    @Override
    public int getDestinationRow() {
	final MazeRunner app = MazeRunner.getApplication();
	return app.getPlayerLocation(false, false);
    }

    @Override
    public int getDestinationColumn() {
	final MazeRunner app = MazeRunner.getApplication();
	return app.getPlayerLocation(false, true);
    }

    @Override
    public int getDestinationFloor() {
	final MazeRunner app = MazeRunner.getApplication();
	return app.getPlayerLocation(true, false) + 1;
    }

    @Override
    public int getDestinationLevel() {
	final MazeRunner app = MazeRunner.getApplication();
	return app.getPlayerLocation(true, true);
    }

    @Override
    public void postMoveAction(final Inventory inv) {
	final MazeRunner app = MazeRunner.getApplication();
	app.updatePositionAbsoluteNoEvents(this.getDestinationRow(), this.getDestinationColumn(),
		this.getDestinationFloor(), this.getDestinationLevel());
    }

    @Override
    public void postMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	final MazeRunner app = MazeRunner.getApplication();
	app.updatePositionAbsoluteNoEvents(this.getDestinationRow(), this.getDestinationColumn(),
		this.getDestinationFloor(), this.getDestinationLevel());
    }

    @Override
    public MazeObject editorHook() {
	MazeMaker.pairStairs(MazeMaker.STAIRS_UP);
	return this;
    }
}
