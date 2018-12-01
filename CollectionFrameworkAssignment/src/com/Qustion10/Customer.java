package com.Qustion10;

public class Customer {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		MovieDetailsList movieDetailsList=new MovieDetailsList();
		movieDetailsList.addMovie(new MovieDetails("GrownUp","Adam Sandler","Salma Hayek","Comedy"));
		movieDetailsList.addMovie(new MovieDetails("Holiday","Jack Black","Kate Winset","Romantic"));
		movieDetailsList.addMovie(new MovieDetails("The Da Vinci Code","Tom Hanks","Audrey Tatue","Mysterious"));
		
			
			
		System.out.println(movieDetailsList.findMovieByMovieName("Hoiday"));
		System.out.println(movieDetailsList.findMovieByGenre("Comedy"));
		System.out.println(movieDetailsList.removeMovie(new MovieDetails("Holiday","Salman Khan","Sonakshi Sinha","Action")));
		movieDetailsList.display();
		movieDetailsList.sort("leadActories");
		movieDetailsList.display();
		}
}

