package facto;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculFactorielleAvecExceptions {

	private static final Logger LOGGER = LogManager.getLogger(CalculFactorielleAvecExceptions.class);

	static String saisie;

	public static void main(String[] args) {

		MathBean bean = new MathBean();

		do {
			saisie = JOptionPane.showInputDialog(null,
					"Veuillez entrer un entier naturel pour calculer sa factorielle :  ");
			if (saisie != null) {
				try {

					long val;
					try {
						val = Long.parseLong(saisie);
					} catch (NumberFormatException e) {
						// Marquer l'exception dans un LOG
						LOGGER.error( "Houston, we have a problem pas de AZERTY");
						throw new MathException("Format incorrect veuillez recommencer " , e);

					}

					JOptionPane.showMessageDialog(null,
							"La facotorielle de " + saisie + " est " + bean.factorielleAvecException(val));
				} catch (MathException e) {

					JOptionPane.showMessageDialog(null, e.getMessage() + e.getCause());

					// Marquer l'exception dans un LOG
					LOGGER.error("Houston, we have a problem");

				}

			}

		} while (saisie != null);

	}
}