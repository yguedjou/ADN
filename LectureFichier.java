package dna.com;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LectureFichier {

	public void serializationRead(String fileName) {
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName));
			String builder = null;
			while ((builder = () stream.readObject()) != null) {
				try {
					add(builder);
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
			stream.close();
		} catch (EOFException e) {
			// No message predefined, we have to write here our own message.
			System.out.println("End of file reading");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
