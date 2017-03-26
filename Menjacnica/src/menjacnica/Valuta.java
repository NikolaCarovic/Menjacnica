package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String nazic;
	private String skraceniNaziv;
	private LinkedList<Kurs> kurs;
	
	public String getNazic() {
		return nazic;
	}
	public void setNazic(String nazic) {
		this.nazic = nazic;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKurs() {
		return kurs;
	}
	public void setKurs(LinkedList<Kurs> kurs) {
		this.kurs = kurs;
	}
}
