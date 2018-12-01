package com.Question1;

public class PersonData implements Comparable<PersonData>  {
	int weight;
	double height;
	String name;
	
	public PersonData(int weight, double height, String name){
		this.weight=weight;
		this.height=height;
		this.name=name;
	}

	@Override
	public int compareTo(PersonData p) {
		if(weight>p.weight){
				return 1;
			}
			
			else if (weight<p.weight){
				return -1;
			}
			
			else if (weight==p.weight){
				if (height>p.height){
					return 1;
				}
				
				else if (height<p.height){
					return -1;
				}
				return 1;
			}
			return 1;
	}
	

	
	

}
