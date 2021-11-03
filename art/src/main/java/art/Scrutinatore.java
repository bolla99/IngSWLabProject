package art;

import java.util.List;

public class Scrutinatore {
	private final int id;
	private TornataElettorale te;
	private List<Elettore> eVoting;
	
	public Scrutinatore(int id, TornataElettorale te) {
		this.te = te;
		this.id = id;
	}
	
	public Elettore identify(String data1, String data2) throws AlreadyVotedException {
		//check if data1 and data2 identify a person eligible for voting
		Elettore e = new Elettore(data1+data2);
		if(!e.hasVoted(te)) {
			eVoting.add(e);
			return e;
		}
		else throw new AlreadyVotedException("L'elettore ha già votato");
	}
	
	private void setElettoreHasVoted(Elettore e) {
		//set Elettore e identified by data1 and data2 has voted, than
		eVoting.remove(e);
	}
	
	public void addVote(Elettore e) {
		e.vote(te);
		setElettoreHasVoted(e);
	}
}