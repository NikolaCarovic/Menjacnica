package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import noviPaket.Interfejs;
import menjacnica.Valuta;
import menjacnica.Kurs;

public class Implementacija implements Interfejs {
	
	private LinkedList<Valuta> valuta = new LinkedList<>();

	private LinkedList<Valuta> valute = new LinkedList<>();	
	
	@Override
	public void dodajKursValuteNaDan(String naziv, Kurs kurs, GregorianCalendar datum) {

		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).equals(naziv)){
				for(int j = 0; j < valute.get(i).getKurs().size(); j++){
					if(valute.get(i).getKurs().get(j).getDatum().get(GregorianCalendar.DATE) == datum.get(GregorianCalendar.DATE)){
						throw new RuntimeException("Postoji kurs za taj datum");
					}
				}
				valute.get(i).getKurs().add(kurs);
				return;
			}
		}


	}

	@Override
	public void obrisiKursValuteZaDan(String naziv, GregorianCalendar datum) {

		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).equals(naziv)){
				for(int j = 0; j < valute.get(i).getKurs().size(); j++){
					if(valute.get(i).getKurs().get(j).getDatum().get(GregorianCalendar.DATE) == datum.get(GregorianCalendar.DATE)){
						valute.get(i).getKurs().remove(j);

						return;
					}
				}
			}
		}
	}

	@Override
	public Kurs pronadjiKursZaDan(String naziv, GregorianCalendar datum) {

		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).equals(naziv)){
				for(int j = 0; j < valute.get(i).getKurs().size(); j++){
					if(valute.get(i).getKurs().get(j).getDatum().get(GregorianCalendar.DATE) == datum.get(GregorianCalendar.DATE)){
						return valute.get(i).getKurs().get(j);
					}
				}
				
			}
		}
		throw new RuntimeException("Nema kursa za taj datum");

	}

}
