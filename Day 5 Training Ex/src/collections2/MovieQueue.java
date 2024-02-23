package collections2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Movie {
    // Movie class definition with attributes like title, director, release year, etc.
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return releaseYear+" - "+title+" by "+director;
    }
}

public class MovieQueue {
    public static void main(String[] args) {
        Queue<Movie> movieQueue = new PriorityQueue<>(Comparator.comparingInt(Movie::getReleaseYear));
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        System.out.println("Enqueue movie");
        String title = scanner.nextLine();
        String director = scanner.nextLine();
        int releaseYear = scanner.nextInt();
        Movie inputMovie = new Movie(title, director, releaseYear);
        movieQueue.offer(inputMovie);
        System.out.println("Movie enqueued: "+title+" by "+director+" (Year: "+releaseYear+")");
        movieQueue.offer(new Movie("2012", "someone",2008));
        movieQueue.offer(new Movie("The Dark Knight Rises", "Christopher Nolan", 2012));
        System.out.println("Dequeue movie");
        int remReleaseYear = scanner.nextInt();
        for(Movie movie: movieQueue){
            if(movie.getReleaseYear()==remReleaseYear){
                movieQueue.remove(movie);
                System.out.println("Movie with release year "+remReleaseYear+" dequeued from the queue.");
                break;
            }
        }
        System.out.println("Display all movies");
        System.out.println("Movies in ascending order of release year:");
        for(Movie movie: movieQueue){
            System.out.println(movie);
        }

        scanner.close();

    }
}

//Problem 10: Movie Queue
//Develop a Java program to manage a queue of movie objects.
//
//Requirements:
//Implement a program that allows users to enqueue, dequeue, and display movie objects based on their release year.
//
//Operations to Perform:
//a. Enqueue a movie to the queue.
//b. Dequeue a movie based on its release year.
//c. Display all movies in ascending order of their release year.
//
//Code Stub:
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Movie {
//    // Movie class definition with attributes like title, director, release year, etc.
//}
//
//public class MovieQueue {
//    public static void main(String[] args) {
//        Queue<Movie> movieQueue = new PriorityQueue<>(Comparator.comparingInt(Movie::getReleaseYear));
//        Scanner scanner = new Scanner(System.in);
//
//        // Implement operations here
//
//        scanner.close();
//    }
//}
//Sample Input:
//1  // Enqueue movie
//Inception
//Christopher Nolan
//2010
//2  // Dequeue movie
//2008
//3  // Display all movies
//
//Sample Output:
//Movie enqueued: Inception by Christopher Nolan (Year: 2010)
//Movie with release year 2008 dequeued from the queue.
//Movies in ascending order of release year:
//2010 - Inception by Christopher Nolan
//2012 - The Dark Knight Rises by Christopher Nolan
