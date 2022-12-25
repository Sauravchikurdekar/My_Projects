package com.demo;

import java.util.List;


class Actors{
	private int actId;
	private String actName;
	private double salary;
	
	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Actors [actId=" + actId + ", actName=" + actName + ", salary=" + salary + "]";
	}
}
public class Movie {
	private int movieId;
	private String movieName;
	private double budjet;
	private List<Actors> actList;
public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getBudjet() {
		return budjet;
	}
	public void setBudjet(double budjet) {
		this.budjet = budjet;
	}
	public List<Actors> getActList() {
		return actList;
	}
	public void setActList(List<Actors> actList) {
		this.actList = actList;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", budjet=" + budjet + ", actList=" + actList
				+ "]";
	}
}
