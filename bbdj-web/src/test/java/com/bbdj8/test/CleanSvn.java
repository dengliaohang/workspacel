package com.bbdj8.test;

import java.io.File;

public class CleanSvn {
	private static String HOME = "D:\\备份\\项目\\wom_project";
	private static final String DIR = ".svn";

	public static void main(String[] args) {
		 File file = new File(HOME);
		 File[] dirs = file.listFiles();
		 removeDir(dirs);
	}

	private static void removeDir(File[] dirs) {
		for (File fl : dirs) {
			if (fl.isDirectory()) {
				if (DIR.equals(fl.getName())) {
					if (!fl.delete()) {
						removeFile(fl.listFiles());
					}
				} else {
					File[] subFile = fl.listFiles();
					removeDir(subFile);
				}
			}
		}
	}

	private static void removeFile(File[] dirs) {
		for (File file : dirs) {
			boolean bool = file.delete();
			if (!bool) {
				if (file.isDirectory()) {
					removeFile(file.listFiles());
				} else {
					file.deleteOnExit();
				}
			}
		}
	}
}
