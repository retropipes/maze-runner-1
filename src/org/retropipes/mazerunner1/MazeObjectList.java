package org.retropipes.mazerunner1;

import org.retropipes.mazerunner1.objects.AKey;
import org.retropipes.mazerunner1.objects.ALock;
import org.retropipes.mazerunner1.objects.AnnihilationWand;
import org.retropipes.mazerunner1.objects.Bomb;
import org.retropipes.mazerunner1.objects.Boots;
import org.retropipes.mazerunner1.objects.CKey;
import org.retropipes.mazerunner1.objects.CLock;
import org.retropipes.mazerunner1.objects.CrackedWall;
import org.retropipes.mazerunner1.objects.DKey;
import org.retropipes.mazerunner1.objects.DLock;
import org.retropipes.mazerunner1.objects.EnergySphere;
import org.retropipes.mazerunner1.objects.ExplodingWall;
import org.retropipes.mazerunner1.objects.FKey;
import org.retropipes.mazerunner1.objects.FLock;
import org.retropipes.mazerunner1.objects.FakeFinish;
import org.retropipes.mazerunner1.objects.FakeWall;
import org.retropipes.mazerunner1.objects.Finish;
import org.retropipes.mazerunner1.objects.FinishMakingWand;
import org.retropipes.mazerunner1.objects.FinishTo;
import org.retropipes.mazerunner1.objects.ForceField;
import org.retropipes.mazerunner1.objects.GKey;
import org.retropipes.mazerunner1.objects.GLock;
import org.retropipes.mazerunner1.objects.Ground;
import org.retropipes.mazerunner1.objects.Ice;
import org.retropipes.mazerunner1.objects.InvisibleOneShotTeleporter;
import org.retropipes.mazerunner1.objects.InvisibleTeleporter;
import org.retropipes.mazerunner1.objects.InvisibleWall;
import org.retropipes.mazerunner1.objects.KKey;
import org.retropipes.mazerunner1.objects.KLock;
import org.retropipes.mazerunner1.objects.Key;
import org.retropipes.mazerunner1.objects.LKey;
import org.retropipes.mazerunner1.objects.LLock;
import org.retropipes.mazerunner1.objects.Lock;
import org.retropipes.mazerunner1.objects.MKey;
import org.retropipes.mazerunner1.objects.MLock;
import org.retropipes.mazerunner1.objects.NKey;
import org.retropipes.mazerunner1.objects.NLock;
import org.retropipes.mazerunner1.objects.OneShotTeleporter;
import org.retropipes.mazerunner1.objects.OneWayEastWall;
import org.retropipes.mazerunner1.objects.OneWayNorthWall;
import org.retropipes.mazerunner1.objects.OneWaySouthWall;
import org.retropipes.mazerunner1.objects.OneWayWestWall;
import org.retropipes.mazerunner1.objects.PKey;
import org.retropipes.mazerunner1.objects.PLock;
import org.retropipes.mazerunner1.objects.Pit;
import org.retropipes.mazerunner1.objects.Player;
import org.retropipes.mazerunner1.objects.PullableBlock;
import org.retropipes.mazerunner1.objects.PushableBlock;
import org.retropipes.mazerunner1.objects.PushablePullableBlock;
import org.retropipes.mazerunner1.objects.RKey;
import org.retropipes.mazerunner1.objects.RLock;
import org.retropipes.mazerunner1.objects.RandomInvisibleOneShotTeleporter;
import org.retropipes.mazerunner1.objects.RandomInvisibleTeleporter;
import org.retropipes.mazerunner1.objects.RandomOneShotTeleporter;
import org.retropipes.mazerunner1.objects.RandomTeleporter;
import org.retropipes.mazerunner1.objects.StairsDown;
import org.retropipes.mazerunner1.objects.StairsUp;
import org.retropipes.mazerunner1.objects.SunkenBlock;
import org.retropipes.mazerunner1.objects.Tablet;
import org.retropipes.mazerunner1.objects.TabletSlot;
import org.retropipes.mazerunner1.objects.TeleportWand;
import org.retropipes.mazerunner1.objects.Teleporter;
import org.retropipes.mazerunner1.objects.Tile;
import org.retropipes.mazerunner1.objects.TwoWayTeleporter;
import org.retropipes.mazerunner1.objects.UKey;
import org.retropipes.mazerunner1.objects.ULock;
import org.retropipes.mazerunner1.objects.EmptyVoid;
import org.retropipes.mazerunner1.objects.Wall;
import org.retropipes.mazerunner1.objects.WallMakingWand;
import org.retropipes.mazerunner1.objects.Water;
import org.retropipes.mazerunner1.objects.ZKey;
import org.retropipes.mazerunner1.objects.ZLock;

public class MazeObjectList {
    // fields
    private final MazeObject[] allObjects = { new Ground(), new Wall(), new Player(), new Finish(),
	    new InvisibleWall(), new FakeWall(), new Key(), new Lock(), new Tablet(),
	    new TabletSlot(), new FakeFinish(), new CrackedWall(), new Bomb(), new Teleporter(),
	    new InvisibleTeleporter(), new AKey(), new ALock(), new CKey(), new CLock(),
	    new DKey(), new DLock(), new FKey(), new FLock(), new GKey(), new GLock(),
	    new KKey(), new KLock(), new LKey(), new LLock(), new MKey(), new MLock(),
	    new NKey(), new NLock(), new PKey(), new PLock(), new RKey(), new RLock(),
	    new UKey(), new ULock(), new ZKey(), new ZLock(), new RandomTeleporter(),
	    new RandomInvisibleTeleporter(), new RandomOneShotTeleporter(),
	    new RandomInvisibleOneShotTeleporter(), new OneShotTeleporter(),
	    new InvisibleOneShotTeleporter(), new OneWayEastWall(), new OneWayNorthWall(),
	    new OneWaySouthWall(), new OneWayWestWall(), new StairsUp(), new StairsDown(),
	    new TwoWayTeleporter(), new Pit(), new Tile(), new PushableBlock(), new PullableBlock(),
	    new PushablePullableBlock(), new Ice(), new FinishTo(), new Boots(), new Water(),
	    new SunkenBlock(), new EnergySphere(), new ForceField(), new AnnihilationWand(),
	    new FinishMakingWand(), new WallMakingWand(), new TeleportWand(), new EmptyVoid(),
	    new ExplodingWall() };

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
