package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kurs;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNazic(String naziv) {
		if( naziv.isEmpty() || naziv == null){
			throw new RuntimeException("Naziv ne sme biti prazan string ili null");
		}
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if( skraceniNaziv.isEmpty() || skraceniNaziv == null){
			throw new RuntimeException("Skraceni naziv ne sme biti prazan string ili null");
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKurs() {
		return kurs;
	}
	public void setKurs(LinkedList<Kurs> kurs) {
		if(kurs.isEmpty()){
			throw new RuntimeException("Kurs (lista) ne sme biti prazna");
		}
		this.kurs = kurs;
	}
	@Override
	public String toString() {
		return "Valuta [nazic=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kurs=" + kurs + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Valuta){
			Valuta v = (Valuta) obj;
			if(v.getNaziv().equals(naziv) && v.getSkraceniNaziv().equals(skraceniNaziv)){
				return true;
			}
			return false;
		}
		throw new RuntimeException("Objekat nije tipa Valuta");
	}
}
