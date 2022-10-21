package Persist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Persist {
	
	public static void PersistSave(Object object, String path){

		try {
			FileOutputStream saveFile = new FileOutputStream(path);
			ObjectOutputStream stream = new ObjectOutputStream(saveFile);
			
			stream.writeObject(object);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
