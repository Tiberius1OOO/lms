package de.bundeswehr.auf.oop.test;

public class Ort {
	
	private String postleitzahl;
	private String ortsname;
	
	public Ort(String postleitzahl, String ortsname) {
		this.postleitzahl = postleitzahl;
		this.ortsname = ortsname;
	}
	
	public String getPostleitzahl() {
		return postleitzahl;
	}
	
	public String getOrtsname() {
		return ortsname;
	}

	@Override
	public String toString() {
		return postleitzahl + " " + ortsname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ortsname == null) ? 0 : ortsname.hashCode());
		result = prime * result + ((postleitzahl == null) ? 0 : postleitzahl.hashCode());
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
		Ort other = (Ort) obj;
		if (ortsname == null) {
			if (other.ortsname != null)
				return false;
		} else if (!ortsname.equals(other.ortsname))
			return false;
		if (postleitzahl == null) {
			if (other.postleitzahl != null)
				return false;
		} else if (!postleitzahl.equals(other.postleitzahl))
			return false;
		return true;
	}

}
