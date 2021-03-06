package art;

import java.util.List;

public class Gestore {
	private final int id;
	private List<TornataElettorale> tornate;
	
	public Gestore(String id) {
		this.id = id.hashCode();
	}
	
	public void addTornata(int id, int type, int votingMethod, int openingDate) {
		TornataElettorale ta = new TornataElettorale(id, type, votingMethod, openingDate);
		tornate.add(ta);
	}
	
	public void addScrutinatore(int id, TornataElettorale ta) {
		ta.addScrutinatore(id);
	}
}
