package com.innovator.learnit.OOP.polymorphism;

import java.io.File;

public class ZipArchiver implements Archiver {

	@Override
	public void archiveFiles(File... files) {
		System.out.println("Method of Zip Archiver is called");
	}
	
	/*
	 * Existence of this method indicates method overloading,
	 * which means that there is a method  with a single name in a class, but it has 
	 * different signatures.
	 */
	public void archiveFiles(int maxArchiveSize, File... files) {
		// stub method for the demo purposes
	}

}
