package org.retropipes.mazerunner1;

import org.retropipes.mazerunner1.objects.MazeAKey;
import org.retropipes.mazerunner1.objects.MazeALock;
import org.retropipes.mazerunner1.objects.MazeAnnihilationWand;
import org.retropipes.mazerunner1.objects.MazeBomb;
import org.retropipes.mazerunner1.objects.MazeBoots;
import org.retropipes.mazerunner1.objects.MazeCKey;
import org.retropipes.mazerunner1.objects.MazeCLock;
import org.retropipes.mazerunner1.objects.MazeCrackedWall;
import org.retropipes.mazerunner1.objects.MazeDKey;
import org.retropipes.mazerunner1.objects.MazeDLock;
import org.retropipes.mazerunner1.objects.MazeEnergySphere;
import org.retropipes.mazerunner1.objects.MazeExplodingWall;
import org.retropipes.mazerunner1.objects.MazeFKey;
import org.retropipes.mazerunner1.objects.MazeFLock;
import org.retropipes.mazerunner1.objects.MazeFakeFinish;
import org.retropipes.mazerunner1.objects.MazeFakeWall;
import org.retropipes.mazerunner1.objects.MazeFinish;
import org.retropipes.mazerunner1.objects.MazeFinishMakingWand;
import org.retropipes.mazerunner1.objects.MazeFinishTo;
import org.retropipes.mazerunner1.objects.MazeForceField;
import org.retropipes.mazerunner1.objects.MazeGKey;
import org.retropipes.mazerunner1.objects.MazeGLock;
import org.retropipes.mazerunner1.objects.MazeGround;
import org.retropipes.mazerunner1.objects.MazeIce;
import org.retropipes.mazerunner1.objects.MazeInvisibleOneShotTeleporter;
import org.retropipes.mazerunner1.objects.MazeInvisibleTeleporter;
import org.retropipes.mazerunner1.objects.MazeInvisibleWall;
import org.retropipes.mazerunner1.objects.MazeKKey;
import org.retropipes.mazerunner1.objects.MazeKLock;
import org.retropipes.mazerunner1.objects.MazeKey;
import org.retropipes.mazerunner1.objects.MazeLKey;
import org.retropipes.mazerunner1.objects.MazeLLock;
import org.retropipes.mazerunner1.objects.MazeLock;
import org.retropipes.mazerunner1.objects.MazeMKey;
import org.retropipes.mazerunner1.objects.MazeMLock;
import org.retropipes.mazerunner1.objects.MazeNKey;
import org.retropipes.mazerunner1.objects.MazeNLock;
import org.retropipes.mazerunner1.objects.MazeOneShotTeleporter;
import org.retropipes.mazerunner1.objects.MazeOneWayEastWall;
import org.retropipes.mazerunner1.objects.MazeOneWayNorthWall;
import org.retropipes.mazerunner1.objects.MazeOneWaySouthWall;
import org.retropipes.mazerunner1.objects.MazeOneWayWestWall;
import org.retropipes.mazerunner1.objects.MazePKey;
import org.retropipes.mazerunner1.objects.MazePLock;
import org.retropipes.mazerunner1.objects.MazePit;
import org.retropipes.mazerunner1.objects.MazePlayer;
import org.retropipes.mazerunner1.objects.MazePullableBlock;
import org.retropipes.mazerunner1.objects.MazePushableBlock;
import org.retropipes.mazerunner1.objects.MazePushablePullableBlock;
import org.retropipes.mazerunner1.objects.MazeRKey;
import org.retropipes.mazerunner1.objects.MazeRLock;
import org.retropipes.mazerunner1.objects.MazeRandomInvisibleOneShotTeleporter;
import org.retropipes.mazerunner1.objects.MazeRandomInvisibleTeleporter;
import org.retropipes.mazerunner1.objects.MazeRandomOneShotTeleporter;
import org.retropipes.mazerunner1.objects.MazeRandomTeleporter;
import org.retropipes.mazerunner1.objects.MazeStairsDown;
import org.retropipes.mazerunner1.objects.MazeStairsUp;
import org.retropipes.mazerunner1.objects.MazeSunkenBlock;
import org.retropipes.mazerunner1.objects.MazeTablet;
import org.retropipes.mazerunner1.objects.MazeTabletSlot;
import org.retropipes.mazerunner1.objects.MazeTeleportWand;
import org.retropipes.mazerunner1.objects.MazeTeleporter;
import org.retropipes.mazerunner1.objects.MazeTile;
import org.retropipes.mazerunner1.objects.MazeTwoWayTeleporter;
import org.retropipes.mazerunner1.objects.MazeUKey;
import org.retropipes.mazerunner1.objects.MazeULock;
import org.retropipes.mazerunner1.objects.MazeVoid;
import org.retropipes.mazerunner1.objects.MazeWall;
import org.retropipes.mazerunner1.objects.MazeWallMakingWand;
import org.retropipes.mazerunner1.objects.MazeWater;
import org.retropipes.mazerunner1.objects.MazeZKey;
import org.retropipes.mazerunner1.objects.MazeZLock;

public class MazeObjectList {
    // fields
    private final MazeObject[] allObjects = { new MazeGround(), new MazeWall(), new MazePlayer(), new MazeFinish(),
	    new MazeInvisibleWall(), new MazeFakeWall(), new MazeKey(), new MazeLock(), new MazeTablet(),
	    new MazeTabletSlot(), new MazeFakeFinish(), new MazeCrackedWall(), new MazeBomb(), new MazeTeleporter(),
	    new MazeInvisibleTeleporter(), new MazeAKey(), new MazeALock(), new MazeCKey(), new MazeCLock(),
	    new MazeDKey(), new MazeDLock(), new MazeFKey(), new MazeFLock(), new MazeGKey(), new MazeGLock(),
	    new MazeKKey(), new MazeKLock(), new MazeLKey(), new MazeLLock(), new MazeMKey(), new MazeMLock(),
	    new MazeNKey(), new MazeNLock(), new MazePKey(), new MazePLock(), new MazeRKey(), new MazeRLock(),
	    new MazeUKey(), new MazeULock(), new MazeZKey(), new MazeZLock(), new MazeRandomTeleporter(),
	    new MazeRandomInvisibleTeleporter(), new MazeRandomOneShotTeleporter(),
	    new MazeRandomInvisibleOneShotTeleporter(), new MazeOneShotTeleporter(),
	    new MazeInvisibleOneShotTeleporter(), new MazeOneWayEastWall(), new MazeOneWayNorthWall(),
	    new MazeOneWaySouthWall(), new MazeOneWayWestWall(), new MazeStairsUp(), new MazeStairsDown(),
	    new MazeTwoWayTeleporter(), new MazePit(), new MazeTile(), new MazePushableBlock(), new MazePullableBlock(),
	    new MazePushablePullableBlock(), new MazeIce(), new MazeFinishTo(), new MazeBoots(), new MazeWater(),
	    new MazeSunkenBlock(), new MazeEnergySphere(), new MazeForceField(), new MazeAnnihilationWand(),
	    new MazeFinishMakingWand(), new MazeWallMakingWand(), new MazeTeleportWand(), new MazeVoid(),
	    new MazeExplodingWall() };

    public MazeObject[] getAllObjects() {
	return this.allObjects;
    }

    public String[] getAllNames() {
	final String[] allNames = new String[this.allObjects.length];
	for (int x = 0; x < this.allObjects.length; x++) {
	    allNames[x] = this.allObjects[x].getName();
	}
	return allNames;
    }

    public MazeObject[] getAllInventoryableObjects() {
	final MazeObject[] tempAllInventoryableObjects = new MazeObject[this.allObjects.length];
	int objectCount = 0;
	for (int x = 0; x < this.allObjects.length; x++) {
	    if (this.allObjects[x].isInventoryable()) {
		tempAllInventoryableObjects[x] = this.allObjects[x];
	    }
	}
	for (final MazeObject tempAllInventoryableObject : tempAllInventoryableObjects) {
	    if (tempAllInventoryableObject != null) {
		objectCount++;
	    }
	}
	final MazeObject[] allInventoryableObjects = new MazeObject[objectCount];
	objectCount = 0;
	for (final MazeObject tempAllInventoryableObject : tempAllInventoryableObjects) {
	    if (tempAllInventoryableObject != null) {
		allInventoryableObjects[objectCount] = tempAllInventoryableObject;
		objectCount++;
	    }
	}
	return allInventoryableObjects;
    }

    public String[] getAllInventoryableNames() {
	final String[] tempAllInventoryableNames = new String[this.allObjects.length];
	int objectCount = 0;
	for (int x = 0; x < this.allObjects.length; x++) {
	    if (this.allObjects[x].isInventoryable()) {
		tempAllInventoryableNames[x] = this.allObjects[x].getName();
	    }
	}
	for (final String tempAllInventoryableName : tempAllInventoryableNames) {
	    if (tempAllInventoryableName != null) {
		objectCount++;
	    }
	}
	final String[] allInventoryableNames = new String[objectCount];
	objectCount = 0;
	for (final String tempAllInventoryableName : tempAllInventoryableNames) {
	    if (tempAllInventoryableName != null) {
		allInventoryableNames[objectCount] = tempAllInventoryableName;
		objectCount++;
	    }
	}
	return allInventoryableNames;
    }
}
