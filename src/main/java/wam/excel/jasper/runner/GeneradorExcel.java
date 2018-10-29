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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import wam.excel.jasper.datasources.PopulationCaseDataSource;
import wam.excel.jasper.datasources.PoblacionDataSource;
import wam.excel.jasper.dto.Json;
import wam.excel.jasper.dto.Poblacion;
import wam.excel.jasper.dto.Snps;

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
		Snps snps = null;
		ObjectMapper objectMapper = new ObjectMapper();
		snps = objectMapper.readValue(GeneradorExcel.class.getResourceAsStream("/valorJson.json"), Snps.class);
		
		/*List <PopulationCase> listPC = new ArrayList<PopulationCase>();
		listPC.add(poblacion.getPopulationCase());
		return new JRBeanCollectionDataSource(listPC);*/
		//return new JRBeanCollectionDataSource(poblacion.getPopulationCase());
		
//		PopulationCaseDataSource listPC = new PopulationCaseDataSource(); //Hasta aqui me apoyo Williams.
//		listPC.setPopulationCases(poblacion.getPopulationCase());
//		return listPC;
		
		PoblacionDataSource listPCD = new PoblacionDataSource();
		listPCD.setPoblacion(snps.getPoblacion());
		return listPCD;
		//return new JRBeanCollectionDataSource(snps.getPoblacion());
		
	}
	/**
	 * Se encarga de generar el XLSX y recibe el dataSource de los elementos que incrustar en el Jasper
	 * @param dataSourSet
	 * @throws JRException
	 */
	@SuppressWarnings("unchecked")
	public static void generarXlsx(JRDataSource dataSourSet) throws JRException {
		JasperPrint jasperPrint = JasperFillManager.fillReport(GeneradorExcel.class.getResourceAsStream("/Poblacion.jasper"), new HashMap<String, Object>() , dataSourSet);
		@SuppressWarnings("rawtypes")
		Exporter exporter = new JRXlsxExporter();
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		File exportReportFile = new File("C:\\Temps\\ReporteJsonSOACMC.xlsx");
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));
		exporter.exportReport();
	}

}
