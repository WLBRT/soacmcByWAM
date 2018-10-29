package wam.excel.jasper.dto;

import java.util.List;

public class Json {
	List <Snps> snps;
	List <Gene> gene;
	List <Mirna> mirna;
	List <Protein> protein;
	List <String> keyword;
	List <Population> population;
	List <String> responders;
	List <String> noResponders;
	List <String> diagnosticCriteria;
	
	public List<Snps> getSnps() {
		return snps;
	}
	public void setSnps(List<Snps> snps) {
		this.snps = snps;
	}
	public List<Gene> getGene() {
		return gene;
	}
	public void setGene(List<Gene> gene) {
		this.gene = gene;
	}
	public List<Mirna> getMirna() {
		return mirna;
	}
	public void setMirna(List<Mirna> mirna) {
		this.mirna = mirna;
	}
	public List<Protein> getProtein() {
		return protein;
	}
	public void setProtein(List<Protein> protein) {
		this.protein = protein;
	}
	public List<String> getKeyword() {
		return keyword;
	}
	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}
	public List<Population> getPopulation() {
		return population;
	}
	public void setPopulation(List<Population> population) {
		this.population = population;
	}
	public List<String> getResponders() {
		return responders;
	}
	public void setResponders(List<String> responders) {
		this.responders = responders;
	}
	public List<String> getNoResponders() {
		return noResponders;
	}
	public void setNoResponders(List<String> noResponders) {
		this.noResponders = noResponders;
	}
	public List<String> getDiagnosticCriteria() {
		return diagnosticCriteria;
	}
	public void setDiagnosticCriteria(List<String> diagnosticCriteria) {
		this.diagnosticCriteria = diagnosticCriteria;
	}

}
