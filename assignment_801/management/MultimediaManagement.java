package fa.training.management;

import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Multimedia;

public class MultimediaManagement {
	public List<Multimedia> listMultiMedia =new ArrayList<Multimedia>();

	public MultimediaManagement() {
	
	}

	public MultimediaManagement(List<Multimedia> listMultiMedia) {
		super();
		this.listMultiMedia = listMultiMedia;
	}
	
	public void addMultimedia(Multimedia multiMedia) {
		//////////
		listMultiMedia.add(multiMedia);
	}
	
	public void displayMultiMedia() {
		System.out.println("--------LIST OF MULTIMEDIA--------");
		for (Multimedia multiMedia : listMultiMedia) {
			System.out.println(multiMedia);
		}
	}

	public List<Multimedia> getListMultiMedia() {
		return listMultiMedia;
	}

	public void setListMultiMedia(List<Multimedia> listMultiMedia) {
		this.listMultiMedia = listMultiMedia;
	}
	
	
}
