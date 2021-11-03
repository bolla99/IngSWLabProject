package art;

import java.util.List;

public class TornataElettorale {
	
	private final int id;
	private final int type; //nazionale, regionale...
	private final int votingMethod; //categorico, ordinale....
	private final int openingDate;
	//...
	private List<Scrutinatore> scrutinatori;
	
	public TornataElettorale(int id, int type, int votingMethod, int openingDate) {
		this.type = type;
		this.votingMethod = votingMethod;
		this.id = id;
		this.openingDate = openingDate;
	}
	
	public void addScrutinatore(int id) {
		Scrutinatore s = new Scrutinatore(id, this);
		scrutinatori.add(s);
	}
}
