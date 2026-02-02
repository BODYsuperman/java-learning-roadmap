package com.alex.demo;

public class MovieOperator {

    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public  void showAllMovies(){
        for (int i = 0; i < movies.length ; i++) {

            Movie m = movies[i];
            System.out.println("Movie{" +
                    "id=" + m.getId() +
                    ", name='" + m.getName() + '\'' +
                    ", price=" + m.getPrice() +
                    ", actor='" + m.getActor() + '\'' +
                    '}');
        }
    }

    public  void getMovieById(int id){

        for (int i = 0; i < movies.length ; i++) {
            Movie m = movies[i];
            if(id == movies[i].getId()){
                System.out.println("Movie{" +
                        "id=" + m.getId() +
                        ", name='" + m.getName() + '\'' +
                        ", price=" + m.getPrice() +
                        ", actor='" + m.getActor() + '\'' +
                        '}');
                return;
            }

            System.out.println("No relevant movie");

        }
    }
}
