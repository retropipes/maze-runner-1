package org.retropipes.mazerunner1.objects.abc;

import org.retropipes.mazerunner1.objects.base.MazeObject;

public abstract class AbstractCharacter extends MazeObject {
    // Serialization
    private static final long serialVersionUID = 7763L;

    // Constructors
    protected AbstractCharacter(final String gameAppearance, final String editorAppearance) {
	super(true, gameAppearance, editorAppearance);
    }

    @Override
    public abstract String getName();

    @Override
    public abstract String toString();
}
