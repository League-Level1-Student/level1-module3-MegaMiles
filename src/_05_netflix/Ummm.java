package _05_netflix;

public class Ummm {
public static void main(String[] args) {
	Movie movie1 = new Movie("movie1", 5);
	Movie movie2 = new Movie("movie2", 5);
	Movie movie3 = new Movie("movie3", 5);
	Movie movie4 = new Movie("movie4", 5);
	Movie movie5 = new Movie("movie5", 5);
	System.out.println(movie1.getTicketPrice());
	System.out.println(movie2.getTicketPrice());
	System.out.println(movie3.getTicketPrice());
	System.out.println(movie4.getTicketPrice());
	System.out.println(movie5.getTicketPrice());
	NetflixQueue DA_QUEUE = new NetflixQueue();
	DA_QUEUE.addMovie(movie1);
	DA_QUEUE.addMovie(movie2);
	DA_QUEUE.addMovie(movie3);
	DA_QUEUE.addMovie(movie4);
	DA_QUEUE.addMovie(movie5);
	DA_QUEUE.printMovies();
	System.out.println(DA_QUEUE.getBestMovie());



}
}
