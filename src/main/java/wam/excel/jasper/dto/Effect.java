package wam.excel.jasper.dto;

import java.util.List;

public class Effect {
	String valor;
	String sentence;
	List <String> references;
	List <String> brainLocations;
	List <String> metabolites;
	List <String> ratios;
	List <String> drugMetabolites;
	List <Pathways> pathways;
	List <Cells> cells;
	List <ClinicalConditions> clinicalConditions;
	List <Drugs> drugs;
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public List<String> getReferences() {
		return references;
	}
	public void setReferences(List<String> references) {
		this.references = references;
	}
	public List<String> getBrainLocations() {
		return brainLocations;
	}
	public void setBrainLocations(List<String> brainLocations) {
		this.brainLocations = brainLocations;
	}
	public List<String> getMetabolites() {
		return metabolites;
	}
	public void setMetabolites(List<String> metabolites) {
		this.metabolites = metabolites;
	}
	public List<String> getRatios() {
		return ratios;
	}
	public void setRatios(List<String> ratios) {
		this.ratios = ratios;
	}
	public List<String> getDrugMetabolites() {
		return drugMetabolites;
	}
	public void setDrugMetabolites(List<String> drugMetabolites) {
		this.drugMetabolites = drugMetabolites;
	}
	public List<Pathways> getPathways() {
		return pathways;
	}
	public void setPathways(List<Pathways> pathways) {
		this.pathways = pathways;
	}
	public List<Cells> getCells() {
		return cells;
	}
	public void setCells(List<Cells> cells) {
		this.cells = cells;
	}
	public List<ClinicalConditions> getClinicalConditions() {
		return clinicalConditions;
	}
	public void setClinicalConditions(List<ClinicalConditions> clinicalConditions) {
		this.clinicalConditions = clinicalConditions;
	}
	public List<Drugs> getDrugs() {
		return drugs;
	}
	public void setDrugs(List<Drugs> drugs) {
		this.drugs = drugs;
	}
	
	

}
