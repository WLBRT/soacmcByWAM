package wam.excel.jasper.dto;

import java.util.List;

public class Snps {
	String valor;
	Gene gene;
	List <Mirna> mirna;
	String oddsRatio;
	List <Functions> functions;
	String keyword;
	List <Poblacion> poblacion;
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Gene getGene() {
		return gene;
	}
	public void setGene(Gene gene) {
		this.gene = gene;
	}
	public List<Mirna> getMirna() {
		return mirna;
	}
	public void setMirna(List<Mirna> mirna) {
		this.mirna = mirna;
	}
	public String getOddsRatio() {
		return oddsRatio;
	}
	public void setOddsRatio(String oddsRatio) {
		this.oddsRatio = oddsRatio;
	}
	public List<Functions> getFunctions() {
		return functions;
	}
	public void setFunctions(List<Functions> functions) {
		this.functions = functions;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public List<Poblacion> getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(List<Poblacion> poblacion) {
		this.poblacion = poblacion;
	}

}
