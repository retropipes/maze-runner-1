package org.retropipes.mazerunner1.objects.abc;

import org.retropipes.mazerunner1.Inventory;
import org.retropipes.mazerunner1.MazeObject;
import org.retropipes.mazerunner1.MazeRunner;
import org.retropipes.mazerunner1.Messager;

public abstract class MazeGenericInvisibleTeleporter extends MazeGenericTeleporter {
    // Serialization
    private static final long serialVersionUID = 7556L;

    // Constructors
    protected MazeGenericInvisibleTeleporter(final String gameAppearance, final String editorAppearance,
	    final int destinationRow, final int destinationColumn, final int destinationFloor,
	    final int destinationLevel) {
	super(gameAppearance, editorAppearance, destinationRow, destinationColumn, destinationFloor, destinationLevel);
    }

    // Scriptability
    @Override
    public void postMoveAction(final Inventory inv) {
	final MazeRunner app = MazeRunner.getApplication();
	app.updatePositionAbsolute(this.getDestinationRow(), this.getDestinationColumn(), this.getDestinationFloor(),
		this.getDestinationLevel());
	// Display invisible teleporter message, if it's enabled
	if (app.getMessageEnabled(MazeRunner.MESSAGE_INVISIBLE_TELEPORTER)) {
	    Messager.showMessage("Invisible Teleporter!");
	}
    }

    @Override
    public void postMoveAction(final boolean ie, final int dirX, final int dirY, final Inventory inv) {
	final MazeRunner app = MazeRunner.getApplication();
	app.updatePositionAbsolute(this.getDestinationRow(), this.getDestinationColumn(), this.getDestinationFloor(),
		this.getDestinationLevel());
	// Display invisible teleporter message, if it's enabled
	if (app.getMessageEnabled(MazeRunner.MESSAGE_INVISIBLE_TELEPORTER)) {
	    Messager.showMessage("Invisible Teleporter!");
	}
    }

    @Override
    public abstract String toString();

    @Override
    public abstract String getName();

    @Override
    public abstract MazeObject editorHook();
}