package heroAnswers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import heroQuestions.SuperPower;

public class EnhancedHuman extends SuperHero {

	private Set<SuperPower> powers = new HashSet<SuperPower>();
	private int totalPower = 0;
	private boolean enhanced;

	public EnhancedHuman(String trueIdentity, String alterEgo, SuperPower[] acquiredPowers) {
		super(trueIdentity, alterEgo);
		powers = new HashSet<SuperPower>(Arrays.asList(acquiredPowers));
		for (SuperPower power : powers) {
			totalPower += power.getValue();
		}
		enhanced = false;
	}
	
	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return enhanced && powers.contains(queriedPower);
	}

	@Override
	public void switchIdentity() {
		super.switchIdentity();
		enhanced = !enhanced;
	}
	
	@Override
	public int totalPower() {
		return (enhanced ? totalPower : 0);
	}

}
