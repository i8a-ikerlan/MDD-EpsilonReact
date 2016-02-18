package eus.ikerlan.i8a;

import java.io.File;

public class EglDoc {
	
	public static void main(String[] args)  {
		EglDocFacade eglDF = new EglDocFacade();
		File model = new File(args[0]);
		
		 eglDF.generate(model, args[1]);
		 
	}

}
