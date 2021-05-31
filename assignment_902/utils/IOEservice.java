package fa.training.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import fa.training.entities.Airport;

public class IOEservice {

	public static void write(ArrayList<Airport> airports) throws IOException {
		ObjectOutputStream oos =null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("902.txt"));
			oos .writeObject(airports);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos!=null)
				oos.close();
		}
	}
	
	public static ArrayList<Airport> read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ArrayList<Airport> airports = new ArrayList<>();
		try {
			ois = new ObjectInputStream(new FileInputStream("902.txt"));
			airports = (ArrayList<Airport>)ois.readObject();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if (ois != null) 
			ois.close();
		}
		return airports;
	}

}