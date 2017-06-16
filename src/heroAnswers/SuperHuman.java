package heroAnswers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import heroQuestions.SuperPower;

public class SuperHuman extends SuperHero{
	
	private int totalPower = 0;
	private Set<SuperPower> powers = new HashSet<SuperPower>();

	public SuperHuman(String trueIdentity, String alterEgo, heroQuestions.SuperPower[] innatePowers) {
		super(trueIdentity, alterEgo);
		powers = new HashSet<SuperPower>(Arrays.asList(innatePowers));
		for (SuperPower power : powers) {
			totalPower += power.getValue();
		}
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return powers.contains(queriedPower);
	}
	
	@Override
	public int totalPower() {
		return totalPower;
	}

	public void acquirePowers(heroQuestions.SuperPower[] newPowers){
		for (SuperPower power : newPowers){
			if (powers.add(power)) {
				totalPower += power.getValue();
			}
		}
	}
	
	public void losePowers(heroQuestions.SuperPower[] oldPowers) {
		for (SuperPower power : oldPowers) {
			if (powers.remove(power)) {
				totalPower -= power.getValue();
			}
		}
	}
}
