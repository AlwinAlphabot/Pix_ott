package com.revature.pixott.handler;

public class SearchMovies {
	private int id;
	private String name;
	private String year;
	private String genre;
	
	
public SearchMovies() {
	
}


public SearchMovies(int id, String name, String year, String genre) {
	super();
	this.id = id;
	this.name = name;
	this.year = year;
	this.genre = genre;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getYear() {
	return year;
}


public void setYear(String year) {
	this.year = year;
}


public String getGenre() {
	return genre;
}


public void setGenre(String genre) {
	this.genre = genre;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((genre == null) ? 0 : genre.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((year == null) ? 0 : year.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SearchMovies other = (SearchMovies) obj;
	if (genre == null) {
		if (other.genre != null)
			return false;
	} else if (!genre.equals(other.genre))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (year == null) {
		if (other.year != null)
			return false;
	} else if (!year.equals(other.year))
		return false;
	return true;
}


@Override
public String toString() {
	return String.format("%d %s %s %s",id ,name, year, genre);
}


}
