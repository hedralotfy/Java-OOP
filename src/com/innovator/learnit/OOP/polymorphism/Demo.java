package com.innovator.learnit.OOP.polymorphism;

import java.io.File;

public class Demo {
	
	public static void main(String[] args) {
		User contentManager = new ContentManager();
		User admin = new AdminUser();
		
		contentManager.validateAccessRights();
		admin.validateAccessRights();
		
		System.out.println();
		System.out.println("==============");
		System.out.println();
		
		Archiver zipArchiver = new ZipArchiver();
		Archiver rarArchiver = new RarArchiver();
		
		zipArchiver.archiveFiles(new File(""));
		rarArchiver.archiveFiles(new File(""));
		
		System.out.println();
		System.out.println("==============");
		System.out.println();
		
		contentManager.getProfileInformtaion(new UserProfile());
		
		ContentManager cm = new ContentManager();
		
		//This is for trying out the concept of final parameters.
		System.out.println(cm.tryout(12));
		System.out.println(cm.tryout(22));
		
		
	}

}
