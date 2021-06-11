package businessObjects;

public class Adresse {

	private String strasse;
	private String hausNr;
	private String plz;
	private String ort;
	/**
	 * Konstruktor.
	 * @param strasse	Die Straße.
	 * @param hausNr	Die Hausnummer.
	 * @param plz		Die Postleitzahl.
	 * @param ort		Der Ort.
	 */
	public Adresse(String strasse, String hausNr, String plz, String ort) {
		this.strasse = strasse;
		this.hausNr = hausNr;
		this.plz = plz;
		this.ort = ort;
	}
	
	/**
	 * Gibt die Straße aus.
	 * @return	Die Straße.
	 */
	public String getStrasse() {
		return strasse;
	}
	
	/**
	 * Aktualisiert die Straße.
	 * @param strasse	Die neue Straße.
	 */
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	/**
	 * Gibt die Hausnummer aus.
	 * @return Die Hausnummer.
	 */
	public String getHausNr() {
		return hausNr;
	}
	
	/**
	 * Aktualisiert die Hausnummer.
	 * @param hausNr	Die neue Hausnummer.
	 */
	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}
	
	/**
	 * Gibt die Postleitzahl aus.
	 * @return	Die Postleitzahl.
	 */
	public String getPlz() {
		return plz;
	}
	
	/**
	 * Aktualisiert die Postleitzahl.
	 * @param plz	Die neue Postleitzahl.
	 */
	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	/**
	 * Gibt den Ort aus.
	 * @return	Der Ort.
	 */
	public String getOrt() {
		return ort;
	}
	
	/**
	 * Aktualisiert den Ort.
	 * @param ort	Der neue Ort.
	 */
	public void setOrt(String ort) {
		this.ort = ort;
	}

	/**
	 * (non-Javadoc)
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		String text = strasse + " " + hausNr + ", " + plz + " " + ort;
		return text;
	}
	
}
