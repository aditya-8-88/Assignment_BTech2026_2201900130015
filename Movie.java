class Movie {
    private String title;
    private int duration; // in minutes
    private String genre;
    private int releaseYear;

    public Movie(String title, int duration, String genre, int releaseYear) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void play() {
        System.out.println("Playing movie: " + title);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ")";
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void watchMovie(Movie movie) {
        System.out.println(name + " is watching " + movie);
        movie.play();
    }

    public void rateMovie(Movie movie, int rating) {
        System.out.println(name + " rated " + movie + " with " + rating + " stars.");
    }
}