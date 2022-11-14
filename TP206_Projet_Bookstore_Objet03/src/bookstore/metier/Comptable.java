package bookstore.metier;

public class Comptable {

	private double totalPrix = 0.0;

	private static Comptable singleton;

	public double getTotalPrix() {
		return this.totalPrix;
	}

	public void setTotalPrix(double totalPrix) {
		this.totalPrix = totalPrix;
	}

	void comptabilise(Livre unLivre) {
		this.totalPrix = totalPrix + unLivre.getPrix() > 0 ? unLivre.getPrix():0;
//		this.totalPrix += unLivre.getPrix() > 0 ? unLivre.getPrix() : 0;

	}

	public static Comptable getInstance() {
		if (singleton == null) {
			singleton = new Comptable();
		}
		return singleton; 

	}

}
