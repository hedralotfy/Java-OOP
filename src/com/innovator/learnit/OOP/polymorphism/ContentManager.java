package com.innovator.learnit.OOP.polymorphism;

public class ContentManager extends User {

	@Override
	public void validateAccessRights() {
		System.out.println("I'm a content manager. I have no enough rights to withdraw money.");
	}

	@Override
	public ProfileInformationData getProfileInformtaion(final Profile profile) {
		return new AccountInformation();
	}
	
	public int tryout(final int amogus) {
		int me = amogus + 1;
		return me;
	}

}
