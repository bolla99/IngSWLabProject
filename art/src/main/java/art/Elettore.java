package art;

public class Elettore {
	
	private final int id;
	
	//constructor
	public Elettore(String idNumber) {
		this.id = idNumber.hashCode();
	}
	
	public Boolean hasVoted(TornataElettorale te) {
		return false;
	}
	
	public void vote(TornataElettorale te) {
	}

}
