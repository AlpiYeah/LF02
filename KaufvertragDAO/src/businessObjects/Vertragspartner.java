package businessObjects;

public class Vertragspartner {

	private String vorname;
	private String nachname;
	private String ausweisNr;
	private Adresse adresse;
	
	/**
	 * Konstruktor.
	 * @param vorname	Der Vorname des Vertragspartners.
	 * @param nachname	Der Nachname des Vertragspartners.
	 */
	public Vertragspartner(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	/**
	 * Gibt den Vornamen des Vertragspartners aus.
	 * @return	Der Vorname des Vertragspartners.
	 */
	public String getVorname() {
		return vorname;
	}
	
	/**
	 * Aktualisiert den Vornamen des Vertragspartners.
	 * @param vorname Der neue Vorname des Vertragspartners.
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	/**
	 * Gibt den Nachnamen des Vertragspartners aus.
	 * @return	Der Nachname des Vertragspartners.
	 */
	public String getNachname() {
		return nachname;
	}
	
	/**
	 * Aktualisiert den Nachnamen des Vertragspartners.
	 * @param nachname	Der neue Nachname des Vertragspartners.
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	/**
	 * Gibt die Ausweisnummer des Vertragspartners aus.
	 * @return	Die Ausweisnummer des Vertragspartners.
	 */
	public String getAusweisNr() {
		return ausweisNr;
	}
	
	/**
	 * Aktualisiert die Ausweisnummer des Vertragspartners.
	 * @param ausweisNr	Die neue Ausweisnummer des Vertragspartners.
	 */
	public void setAusweisNr(String ausweisNr) {
		this.ausweisNr = ausweisNr;
	}
	
	/**
	 * Gibt die Adresse des Vertragspartners aus.
	 * @return	Die Adresse des Vertragspartners.
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	
	/**
	 * Aktualisiert die Adresse des Vertragspartners.
	 * @param adresse	Die neue Adresse des Vertragspartners.
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * (non-Javadoc)
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		String text = vorname + " " + nachname;
		text += "\n\t\tAusweisNr: " + ausweisNr;
		text += "\n\t\tAdresse: " + adresse;
		return text;
	}
	
}
