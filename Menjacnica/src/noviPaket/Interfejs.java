package noviPaket;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface Interfejs {
	 
	public void dodajKursValuteNaDan(String naziv, Kurs kurs, GregorianCalendar datum);
	
	public void obrisiKursValuteZaDan(String naziv, GregorianCalendar datum);
	
	public void pronadjiKursZaDan(String naziv, GregorianCalendar datum);
}
