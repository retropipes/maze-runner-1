package org.retropipes.mazerunner1.objects.abc;

public abstract class AbstractPass extends AbstractInfiniteKey {
    // Serialization
    private static final long serialVersionUID = 8002L;

    // Constructors
    protected AbstractPass(final String gameAppearance, final String editorAppearance) {
	super(gameAppearance, editorAppearance);
    }

    @Override
    public abstract String toString();

    @Override
    public abstract String getName();
}
