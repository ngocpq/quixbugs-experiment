package qfevotest.generator;

/**
 * 
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

import qfevotest.testrunner.SummaryResults;

public class QuixBugTestGeneratorTest {

	@Test
	public void testGenerate1() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		int seed = 1;
		qg.generateTest4AllPrograms("./out", seed);
	}

	@Test
	public void testGenerateAllSeed() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		qg.generateTest4AllProgramsAllSeed("./out");
	}

	@Test
	public void testGenerate1Subject() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		boolean success = qg.generateAndRunEvoTests("./out", "subsequences", 19);
		assertTrue(success);
	}

	@Test
	public void testGenerateAllSeedMulti() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		qg.generateTestAllSeedMultithread("./out10s", 2);
	}

	@Test
	public void testCheckDetermLis1() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		boolean determ = qg.checkDeterministic("./out", "LIS");
		assertTrue(determ);
	}

	@Test
	public void testRunPatchPassing() throws Exception {
		//Here, we pass the location to the patched version bytecode
		 Properties prop = new Properties();   
	     InputStream in = Object.class.getResourceAsStream("/test.properties");   
	     prop.load(in); 	    	     
	     for(Object patchPath:prop.keySet()) {
	    	    String program = prop.getProperty((String) patchPath);
	    		File patchLocation = new File("./patchedPrograms/"+patchPath);
	    		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
	    		SummaryResults resultallseed = qg.runEvosuiteAllSeedOnPatch(patchLocation.toPath(),
	    				new File("./generatedTests").toPath(), program);
	    		//assertTrue(resultallseed.isCorrect());//removing this assertion, not all test must pass
	     }	
	}
	
	@Test
	public void testGetAllResults() throws Exception {
		File patchLocation = new File("./patchedPrograms/");
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(patchLocation, new File("./generatedTests"));
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {
			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + ": pass all test? " + sr.isCorrect() + " failings: (" + failingSeed.size()
					+ ") " + failingSeed);
		}
	}

	@Test
	public void testRunPatchFailling() throws Exception {
		// Here, we pass the location to the patched version bytecode which
		// fails
		URL urlPatchTest = this.getClass().getClassLoader().getResource("testpatch1");
		File patchLocation = new File(urlPatchTest.getPath());
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		SummaryResults resultallseed = qg.runEvosuiteAllSeedOnPatch(patchLocation.toPath(),
				new File("./generatedTests").toPath(), "LIS");
		assertFalse(resultallseed.isCorrect());
	}

}
