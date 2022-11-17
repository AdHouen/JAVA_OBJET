package bookstore.metier;

public enum EnumStatusLivre {
	
	 PRETE("prêté"),
	 DISPONIBLE("disponible"),
	 SUPPRIME("supprimé");
	
	private final String statut;

	EnumStatusLivre(String statut) {
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }
}
