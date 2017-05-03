package it.gov.aifa.invoice_processor.constant;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TestConstant {
	private static final Logger log = LoggerFactory.getLogger(TestConstant.class);
	private TestConstant() { }
	
	public static final String INVOICE_SHORT_VERSION = "v1.1";
	public static final String INVOICE_ROOT = "{http://www.fatturapa.gov.it/sdi/fatturapa/" + INVOICE_SHORT_VERSION + "}FatturaElettronica";
	public static final String INVOICE_CAUSE =
			"Il ritardato pagamento della presente fattura puo' comportare  l'addebito degli interessi di mora secondo quanto stabilito dal  D.Lgs.n. 231 9.10.02 e/o secondo gli accordi specifici con voi  interc"
            + "orsi Contributo ambientale CONAI assolto ove dovuto.    DIS (ove indicato in \"Tipo OP.\"): Merce Sconto-valore esposto ai soli fini IVA Art.15 D.P.R 633/72. Al pagamento indicare il nostro riferimento"
            + "cliente 1234567890 e fattura nr. 1234567890";
	public static final String TEST_DIRECTORY_NAME = "input";
	public static final Path TEST_DIRECTORY_PATH = getPath(TEST_DIRECTORY_NAME);
	public static final long TEST_ITEM_COUNT = 1;
	public static final String TEST_FILE_NAME_INVOICE1_1 = "invoice1_1.json";
	public static final Path TEST_FILE_PATH_INVOICE1_1 = getPath(TEST_DIRECTORY_NAME + File.separator + TEST_FILE_NAME_INVOICE1_1);
	
	public static final String INVOICE1_1_JSON = getInvoiceJson(TEST_FILE_PATH_INVOICE1_1);

	private static Path getPath(String path){
		try {
			return Paths.get(TestConstant.class.getClassLoader().getResource(path).toURI());
		} catch (URISyntaxException e) {
			log.error("Error while getting {} path", path, e);
			throw new RuntimeException("Cannot get path " + path);
		}
	}
	
	private static String getInvoiceJson(Path path) {
		try {
			return Files.lines(path).collect(Collectors.joining());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}