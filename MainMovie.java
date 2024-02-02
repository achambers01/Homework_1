package HW12;
//Author: Ana Chambers
public class MainMovie {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Mamma Mia", "Greta Gerwig", "Musical");
		
		System.out.println(movie1.title + " directed by " + movie1.director + " is a " + movie1.genre);

	}

}
