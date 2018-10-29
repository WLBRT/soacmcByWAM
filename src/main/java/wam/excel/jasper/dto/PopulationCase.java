package wam.excel.jasper.dto;

import java.util.List;

public class PopulationCase {
	String valor;
	List <Drugs> drugs;
	String total;
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public List<Drugs> getDrugs() {
		return drugs;
	}
	public void setDrugs(List<Drugs> drugs) {
		this.drugs = drugs;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

	
}
