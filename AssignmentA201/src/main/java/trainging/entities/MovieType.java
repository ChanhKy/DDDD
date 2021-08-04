package trainging.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Movie_Type")
public class MovieType implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "Type_Id", referencedColumnName = "Type_Id")
	private Type type;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "Movie_Id", referencedColumnName = "Movie_Id")
	private Movie movie;
	
	@Column(name = "MT_Description")
	private String mtDescription;

	public MovieType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieType(Type type, Movie movie, String mtDescription) {
		super();
		this.type = type;
		this.movie = movie;
		this.mtDescription = mtDescription;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getMtDescription() {
		return mtDescription;
	}

	public void setMtDescription(String mtDescription) {
		this.mtDescription = mtDescription;
	}

	@Override
	public String toString() {
		return "MovieType [type=" + type + ", movie=" + movie + ", mtDescription=" + mtDescription + "]";
	}
	
	
	
}
