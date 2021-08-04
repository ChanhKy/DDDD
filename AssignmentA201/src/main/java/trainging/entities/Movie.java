package trainging.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
	@Id
	@Column(name = "Movie_Id")
	private String movieId;

	@Column(name = "Actor")
	private String actor;

	@Column(name = "Content")
	private String content;

	@Column(name = "Director")
	private String director;

	@Column(name = "Duration")
	private Integer duration;

	@Column(name = "From_Date")
	private Date fromDate;

	@Column(name = "To_Date")
	private Date toDate;

	@Column(name = "Movie_Production_Company")
	private String movieProductionCompany;

	@Column(name = "Version")
	private String version;

	@Column(name = "Movie_Name_ENG")
	private String movieNameEng;

	@Column(name = "Movie_Name_VN")
	private String movieNameVn;

	@Column(name = "Large_Image")
	private String largeImage;

	@Column(name = "Small_Image")
	private String smallImage;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "movie")
	private Set<MovieType> movieType;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieId, String actor, String content, String director, int duration, Date fromDate,
			Date toDate, String movieProductionCompany, String version, String movieNameEng, String movieNameVn,
			String largeImage, String smallImage, Set<MovieType> movieType) {
		super();
		this.movieId = movieId;
		this.actor = actor;
		this.content = content;
		this.director = director;
		this.duration = duration;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.movieProductionCompany = movieProductionCompany;
		this.version = version;
		this.movieNameEng = movieNameEng;
		this.movieNameVn = movieNameVn;
		this.largeImage = largeImage;
		this.smallImage = smallImage;
		this.movieType = movieType;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getMovieProductionCompany() {
		return movieProductionCompany;
	}

	public void setMovieProductionCompany(String movieProductionCompany) {
		this.movieProductionCompany = movieProductionCompany;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMovieNameEng() {
		return movieNameEng;
	}

	public void setMovieNameEng(String movieNameEng) {
		this.movieNameEng = movieNameEng;
	}

	public String getMovieNameVn() {
		return movieNameVn;
	}

	public void setMovieNameVn(String movieNameVn) {
		this.movieNameVn = movieNameVn;
	}

	public String getLargeImage() {
		return largeImage;
	}

	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}

	public String getSmallImage() {
		return smallImage;
	}

	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}

	public Set<MovieType> getMovieType() {
		return movieType;
	}

	public void setMovieType(Set<MovieType> movieType) {
		this.movieType = movieType;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", actor=" + actor + ", content=" + content + ", director=" + director
				+ ", duration=" + duration + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", movieProductionCompany=" + movieProductionCompany + ", version=" + version + ", movieNameEng="
				+ movieNameEng + ", movieNameVn=" + movieNameVn + ", largeImage=" + largeImage + ", smallImage="
				+ smallImage + ", movieType=" + movieType + "]";
	}

}
