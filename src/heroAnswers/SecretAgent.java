package heroAnswers;

public class SecretAgent extends Object implements Hero {

	private String currentIdentity;
	private String otherIdentity;
	private String favGadget;
	
	public SecretAgent(String trueName, String codeName, String gadget){
		currentIdentity = trueName;
		otherIdentity = codeName;
		favGadget = gadget;
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
	
	public String getGadget() {
		return favGadget;
	}
	
}
