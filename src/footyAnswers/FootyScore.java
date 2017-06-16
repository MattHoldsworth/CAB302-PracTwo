package footyAnswers;

public class FootyScore {

	private static final int goal = 6;
	private static final int behind = 1;
	private int score[] = new int[3];
	private String message;
	
	public int getPoints(){
		return score[0];
		//return points;
	}
	
	public void kickGoal(){
		score[0] += goal;
		score[1] += 1;
	}
	
	public void kickBehind(){
		score[0] += behind;
		score[2] += 1;
	}
	
	public String sayScore(){
		return message = (score[1] + ", " + score[2] + ", " + score[0]);
	}
	
	public boolean inFrontOf(FootyScore x) {
		if (this.score[0] > x.getPoints()) {
			return true;
		} else {
			return false;
		}
	}
}
