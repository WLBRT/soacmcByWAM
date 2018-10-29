package wam.excel.jasper.dto;

import java.util.List;

public class Population {
	String valor;
	String oring;
	List <String> races;
	PopulationCase populationCase;
	PopulationControl populationControl;
	String sentence;
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getOring() {
		return oring;
	}
	public void setOring(String oring) {
		this.oring = oring;
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

}
