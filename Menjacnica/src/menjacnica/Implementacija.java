package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import noviPaket.Interfejs;
import menjacnica.Valuta;
import menjacnica.Kurs;

public class Implementacija implements Interfejs {
	
	private LinkedList<Valuta> valuta = new LinkedList<>();

	@Override
	public void dodajKursValuteNaDan(String naziv, Kurs kurs, GregorianCalendar datum) {
		for (int i = 0; i < valuta.size(); i++) {
			if( valuta.get(i).equals(naziv)){
				LinkedList<Kurs> kursevi = valuta.get(i).getKurs();
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE) == datum.get(GregorianCalendar.DATE)){
						throw new RuntimeException("Vec postoji kurs za taj datum");
					}
				}
				valuta.get(i).getKurs().add(kurs);
				return;
			}
		}
	}

	@Override
	public void obrisiKursValuteZaDan(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valuta.size(); i++) {
			if( valuta.get(i).equals(naziv)){
				LinkedList<Kurs> kursevi = valuta.get(i).getKurs();
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE) == datum.get(GregorianCalendar.DATE)){
						valuta.get(i).getKurs().remove(j);
						return;
					}
				}
			}
		}
	}

	@Override
	public Kurs pronadjiKursZaDan(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valuta.size(); i++) {
			if( valuta.get(i).equals(naziv)){
				LinkedList<Kurs> kursevi = valuta.get(i).getKurs();
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatum().get(GregorianCalendar.DATE) == datum.get(GregorianCalendar.DATE)){
						return valuta.get(i).getKurs().get(j);
					}
				}
			}
		}
		throw new RuntimeException("Ne postoji kurs za taj datum ");

	}

}
