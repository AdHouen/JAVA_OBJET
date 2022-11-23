package facto;

public class MathBean {
	
	

	public long factorielle(long i)  {

		if (i == 0)
			return 1;
		else if (i < 0) {
			return -1;

		} else if (i > 20) {
			return -2;

		} else
			return (i * factorielle(i - 1));

	}

	public long factorielleAvecException(long i) throws MathException {
		
		

		if (i == 0) {
			return 1;
		} else if (i < 0) {
			throw new MathException("Pas de valeur negative");

		} else if (i > 20) {
			throw new MathException("Pas de valeur superieur a 20");
			
		}

		return (i * factorielleAvecException(i - 1));

	}
	
	

}
