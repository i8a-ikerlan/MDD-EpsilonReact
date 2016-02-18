package eus.ikerlan.i8a;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



public class EglDocFacade {
	
	public EglDocFacade() {
	}
	
	public void generate(File model, String outputDirPath) {			
		final String metaModelName = model.getName().contains(".") ?
		                             model.getName().substring(0, model.getName().lastIndexOf(".")) : 
		                             model.getName();
		final File outputDir = new File(outputDirPath);
//		
//		System.out.println("Generating documentation for "+metaModelName);
//		
//		// Set directory from which nested templates will be loaded
//		factory.setTemplateRoot(Egl.getBase().toString());
//
//		// Load model
//		loadModel("OO", model);
//		
//		// Generate HTML
//		factory.getContext().getFrameStack().put(Variable.createReadOnlyVariable("metaModelName", metaModelName));
//		factory.getContext().getFrameStack().put(Variable.createReadOnlyVariable("outputDir", outputDirUri));
//		
//		final EglFileGeneratingTemplate template = (EglFileGeneratingTemplate)factory.load(Egl.getToHtmlProgram());
//		template.process();
//		
//		for (StatusMessage message : factory.getContext().getStatusMessages())
//			System.out.println(message);
//		
//		if (generatePng) {
//			// Generate DOT file
//			final EglFileGeneratingTemplate dotTemplate = (EglFileGeneratingTemplate)factory.load((Egl.getToDotProgram()));
//			dotTemplate.process();
//			
//			for (StatusMessage message : factory.getContext().getStatusMessages())
//				System.out.println(message);
//			
//			// Get the subtemplate that generated the DOT file
//			final Template sub = (Template)factory.getContext().getBaseTemplate().getChildren().get(0);
//			// Get the output file
//			final OutputFile of = (OutputFile)sub.getChildren().get(0);
//			
//			final File dotFile = new File(of.getURI());
//			final File pngFile = new File(dotFile.getAbsolutePath().replaceFirst("\\.dot$", ".png"));
//			
//			// Generate PNG - determine the png's file name by replacing the extension
//			generatePng(dotFile.getAbsolutePath(), pngFile.getAbsolutePath());
//			
//			// Move the png file
//			FileUtil.moveFileToDir(pngFile, new File(outputDir + FILE_SEP + "img"));
//		}
//		
//		// Copy the common files
//		FileUtil.copyFile(Egl.getScreenCss(), new File(outputDir + FILE_SEP + "css"     + FILE_SEP + "screen.css"));
//		FileUtil.copyFile(Egl.getUpArrow(),   new File(outputDir + FILE_SEP + "img"     + FILE_SEP + "arrow_up.png"));
//		FileUtil.copyFile(Egl.getControls(),  new File(outputDir + FILE_SEP + "scripts" + FILE_SEP + "controls.js"));
	}

}
