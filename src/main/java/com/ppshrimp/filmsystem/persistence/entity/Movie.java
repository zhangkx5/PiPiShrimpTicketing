package com.ppshrimp.filmsystem.persistence.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Movie implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7373578329130106831L;
	
	// 依次是id、电影名、宣传照地址、导演、主演、简介、电影长度、评分
	private long movieId;
	private String moviename;
	private String imgUrl;
	private String director;
    private String actor;
    private String brief;
    private String type;
    private int length;
    private float score;
    private Date releaseTime;
    private Date shelfTime;
    
    private Set<CinemaMoviePos> cmPos = new HashSet<>();
    
    /*
     * private String language;
     * */
    
    public Movie() {
    	super();
    }
	
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Date getShelfTime() {
		return shelfTime;
	}

	public void setShelfTime(Date shelfTime) {
		this.shelfTime = shelfTime;
	}

	public Set<CinemaMoviePos> getCmPos() {
		return cmPos;
	}
    
	@JsonBackReference
	public void setCmPos(Set<CinemaMoviePos> cmPos) {
		this.cmPos = cmPos;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
