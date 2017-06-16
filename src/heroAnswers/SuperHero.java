package heroAnswers;

import heroQuestions.SuperPower;

public abstract class SuperHero extends Object implements Hero {
	
	private String currentIdentity;
	private String otherIdentity;
	
	public SuperHero(String trueIdentity, String alterEgo) {
		currentIdentity = trueIdentity;
		otherIdentity = alterEgo;
	}

	@Override
	public String currentIdentity() {
		return currentIdentity;
	}

	@Override
	public void switchIdentity() {
		String tempSwap;
		tempSwap = currentIdentity;
		currentIdentity = otherIdentity;
		otherIdentity = tempSwap;
	}

	public abstract boolean hasPower(SuperPower queriedPower);
	
	public abstract int totalPower();
}
