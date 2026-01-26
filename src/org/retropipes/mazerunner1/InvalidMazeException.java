package org.retropipes.mazerunner1;

class InvalidMazeException extends Exception {
    // Serialization
    private static final long serialVersionUID = 999L;

    // Constructors
    InvalidMazeException() {
	super();
    }

    InvalidMazeException(final String msg) {
	super(msg);
    }
}