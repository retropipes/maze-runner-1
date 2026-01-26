package org.retropipes.mazerunner1;

import java.util.regex.Pattern;

import javax.swing.ImageIcon;

public class ImageSetManager {
    public static Pattern find = Pattern.compile("([A-Za-z])([A-Z])");

    public static ImageIcon getImage(final String set, final int size, final String filename) {
	return new ImageIcon(ImageSetManager.class.getResource("/image/set/" + set.toLowerCase() + "/"
		+ find.matcher(filename).replaceAll("$1-$2") + "/" + String.valueOf(size) + ".png"));
    }

    public static ImageIcon getLogo() {
	return new ImageIcon(ImageSetManager.class.getResource("/image/ui/logo.png"));
    }

    public static String getDefaultSet() {
	return "Modern";
    }

    public static int getDefaultSize() {
	return 32;
    }
}