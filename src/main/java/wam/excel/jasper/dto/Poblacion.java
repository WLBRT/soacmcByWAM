package wam.excel.jasper.dto;

import java.util.List;

public class Poblacion {
	String valor;
	String origin;
	List <String> races;
	PopulationCase populationCase;
	PopulationControl populationControl;
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public List<String> getRaces() {
		return races;
	}
	public void setRaces(List<String> races) {
		this.races = races;
	}
	public PopulationCase getPopulationCase() {
		return populationCase;
	}
	public void setPopulationCase(PopulationCase populationCase) {
		this.populationCase = populationCase;
	}
	public PopulationControl getPopulationControl() {
		return populationControl;
	}
	public void setPopulationControl(PopulationControl populationControl) {
		this.populationControl = populationControl;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	String sentence;

}
