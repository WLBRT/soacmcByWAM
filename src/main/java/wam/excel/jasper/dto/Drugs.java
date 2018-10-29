package wam.excel.jasper.dto;

import java.util.List;

public class Drugs {
	String valor;
	List <String> ratios;
	List <String> bloods;
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public List<String> getRatios() {
		return ratios;
	}
	public void setRatios(List<String> ratios) {
		this.ratios = ratios;
	}
	public List<String> getBloods() {
		return bloods;
	}
	public void setBloods(List<String> bloods) {
		this.bloods = bloods;
	}
}
