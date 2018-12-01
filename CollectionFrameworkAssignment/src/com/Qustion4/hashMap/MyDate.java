package com.Qustion4.hashMap;

public class MyDate {
	
	int dd;
	int mm;
	int yyyy;
	
	public MyDate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	public int getDd() {
		return dd;
	}
	
	public void setDd(int dd) {
		this.dd = dd;
	}
	
	public int getMm() {
		return mm;
	}
	
	public void setMm(int mm) {
		this.mm = mm;
	}
	
	public int getYyyy() {
		return yyyy;
	}
	
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	
	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + ", getDd()=" + getDd() + ", getMm()=" + getMm()
				+ ", getYyyy()=" + getYyyy() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yyyy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		*/
		MyDate other = (MyDate) obj;
		 //((dd == other.dd) && (mm == other.mm) && (yyyy!=other.yyyy))
			return !((dd == other.dd) && (mm == other.mm) && (yyyy!=other.yyyy));
					
	}
	
}
