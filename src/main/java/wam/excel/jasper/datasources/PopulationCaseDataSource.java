package wam.excel.jasper.datasources;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import wam.excel.jasper.dto.PopulationCase;

public class PopulationCaseDataSource implements JRDataSource{
	
	private Integer counter = -1;
	private PopulationCase populationCases;
	private static final String VALOR_FIELD = "valor";
	private static final String DRUGS_DS_FIELD = "drugs";
	private static final String TOTAL_FIELD = "total";

	public Object getFieldValue(JRField field) throws JRException {
		if(VALOR_FIELD.equals(field.getName())) {
			return populationCases.getValor();
		}else if(DRUGS_DS_FIELD.equals(field.getName())) {
			return new JRBeanCollectionDataSource (populationCases.getDrugs());
		}
		else if(TOTAL_FIELD.equals(field.getName())) {
			return populationCases.getTotal();
		}
		return null;
	}

	public boolean next() throws JRException {
		if(counter < 0) {
			counter++;
			return true;
		}
		return false;
	}

	public PopulationCase getPopulationCases() {
		return populationCases;
	}

	public void setPopulationCases(PopulationCase populationCases) {
		this.populationCases = populationCases;
	}

}
