package businessObjects;

import java.util.ArrayList;

public class Ware {

	private String warenNr;
	private String bezeichnung;
	private String beschreibung;
	private double preis;
	private ArrayList<String> besonderheitenListe;
	private ArrayList<String> maengelListe;

	/**
	 * Konstruktor.
	 * @param bezeichnung    Die Bezeichnung der Ware.
	 * @param preis            Der Preis der Ware.
	 */
	public Ware(String warenNr,String bezeichnung, double preis) {
		this.warenNr = warenNr;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.besonderheitenListe = new ArrayList<String>();
		this.maengelListe = new ArrayList<String>();
	}

	public String getWarenNr() {
		return warenNr;
	}

	public void setWarenNr(String warenNr) {
		this.warenNr = warenNr;
	}

	/**
	 * Gibt die Bezeichnung der Ware aus.
	 * @return	Die Bezeichnung der Ware.
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * Aktualisiert die Bezeichnung der Ware.
	 * @param bezeichnung	Die neue Bezeichnung der Ware.
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	/**
	 * Gibt die Beschreibung der Ware aus.
	 * @return	Die Beschreibung der Ware.
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * Aktualisiert die Beschreibung der Ware.
	 * @param beschreibung	Die neue Beschreibung der Ware.
	 */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	/**
	 * Gibt den Preis der Ware aus.
	 * @return	Der Preis der Ware.
	 */
	public double getPreis() {
		return preis;
	}

	/**
	 * Aktualisiert den Preis der Ware.
	 * @param preis	Der neue Preis der Ware.
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}

	/**
	 * Gibt die Liste der Besonderheiten der Ware aus.
	 * @return	Die Liste der Besonderheiten der Ware.
	 */
	public ArrayList<String> getBesonderheitenListe() {
		return besonderheitenListe;
	}

	/**
	 * Gibt die Liste der Mängel der Ware aus.
	 * @return	Die Liste der Mängel der Ware.
	 */
	public ArrayList<String> getMaengelListe() {
		return maengelListe;
	}

	public void setBesonderheitenListe(ArrayList<String> besonderheitenListe) {
		this.besonderheitenListe = besonderheitenListe;
	}

	public void setMaengelListe(ArrayList<String> maengelListe) {
		this.maengelListe = maengelListe;
	}

	/**
	 * (non-Javadoc)
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		String text = bezeichnung;
		text += "\n\t\tWarenNr: " + warenNr;
		text += "\n\t\tBezeichnung: " + bezeichnung;

		text += "\n\t\tBeschreibung: " + beschreibung;
		text += "\n\t\tPreis: " + preis;
		text += "\n\t\tBesonderheiten: " + besonderheitenListe;
		text += "\n\t\tMängel: " + maengelListe;
		return text;
	}
	
}
