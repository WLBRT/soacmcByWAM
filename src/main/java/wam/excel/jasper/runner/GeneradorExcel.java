package wam.excel.jasper.runner;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import wam.excel.jasper.datasources.PopulationCaseDataSource;
import wam.excel.jasper.dto.Poblacion;

public class GeneradorExcel {

	
	public static void main(String[] args) throws JRException, JsonParseException, JsonMappingException, IOException {
		
		JRDataSource dataSource = parseJson();
		generarXlsx(dataSource);
		
		System.out.println("Archivo creado con exito!!!");
	}
	
	/**
	 * Parsea del Json con Jackson
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static JRDataSource parseJson() throws JsonParseException, JsonMappingException, IOException {
		Poblacion poblacion = null;
		
		ObjectMapper objectMapper = new ObjectMapper();

		poblacion = objectMapper.readValue(GeneradorExcel.class.getResourceAsStream("/valorJson.json"), Poblacion.class);
		
		/*List <PopulationCase> listPC = new ArrayList<PopulationCase>();
		listPC.add(poblacion.getPopulationCase());
		return new JRBeanCollectionDataSource(listPC);*/

		//return new JRBeanCollectionDataSource(poblacion.getPopulationCase());
		
		PopulationCaseDataSource listPC = new PopulationCaseDataSource();
		listPC.setPopulationCases(poblacion.getPopulationCase());
		return listPC;
	}
	
	/**
	 * Se encarga de generar el XLSX y recibe el dataSource de los elementos que incrustar en el Jasper
	 * @param dataSourSet
	 * @throws JRException
	 */
	@SuppressWarnings("unchecked")
	public static void generarXlsx(JRDataSource dataSourSet) throws JRException {
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(GeneradorExcel.class.getResourceAsStream("/PopulationCase.jasper"), new HashMap<String, Object>() , dataSourSet);

		@SuppressWarnings("rawtypes")
		Exporter exporter = new JRXlsxExporter();
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));

		File exportReportFile = new File("C:\\Temps\\report.xlsx");

		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));

		exporter.exportReport();
	}

}
