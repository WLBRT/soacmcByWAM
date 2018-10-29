package wam.excel.jasper.datasources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import wam.excel.jasper.dto.Poblacion;
import wam.excel.jasper.dto.PopulationCase;
import wam.excel.jasper.dto.PopulationControl;

public class PoblacionDataSource implements JRDataSource {
	
	private Integer counter = -1;
	private Poblacion poblacion;
	private static final String VALOR_FIELD = "valor";
	private static final String ORIGIN_FIELD = "origin";
	private static final String POPULATIONCASES_DS_FIELD = "populationCases";
	private static final String POPULATIONCONTROL_DS_FIELD = "populationControl";
	private static final String SENTENCE_FIELD = "sentence";
	
	public Object getFieldValue(JRField jrField) throws JRException {
		
		if(VALOR_FIELD.equals(jrField.getName())) {
			return poblacion.getValor();
		}else if(ORIGIN_FIELD.equals(jrField.getName())){
			return poblacion.getOrigin();
		}else if(POPULATIONCASES_DS_FIELD.equals(jrField.getName())) {
			List <PopulationCase> listP = new ArrayList<PopulationCase>();
			listP.add(poblacion.getPopulationCase());
			return new JRBeanCollectionDataSource(listP);
			
			//return new JRBeanCollectionDataSource(poblacion.getPopulationCase());
		}else if(POPULATIONCONTROL_DS_FIELD.equals(jrField.getName())) {
			List <PopulationControl> listPu =new ArrayList<PopulationControl>();
			listPu.add(poblacion.getPopulationControl());
			return new JRBeanCollectionDataSource(listPu);
		}else if (SENTENCE_FIELD.equals(jrField.getName())) {
			return poblacion.getSentence();
		}
		return null;
	}
	
	public boolean next() throws JRException {
		if (counter<0) {
			counter++;
		}
		return false;
	}
	
	public Poblacion getPoblacion() {
		return poblacion;
	}
	
	public void setPoblacion(List<Poblacion> list){
		this.poblacion =  (Poblacion) list;
	}

	
	

}
