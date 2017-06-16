package heroAnswers;

import heroQuestions.SuperPower;

public class Human extends SuperHero{

	public Human(String trueIdentity, String alterEgo) {
		super(trueIdentity, alterEgo);
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return false;
	}

	@Override
	public int totalPower() {
		return 0;
	}

}
