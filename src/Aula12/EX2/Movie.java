package Aula12.EX2;


public class Movie {

    private String nome, rating, genre;
    private Double score;
    private int runningTime;

    public Movie(String mNome, Double mScore, String mRating, String mGenre, int mRunningTime) {
        nome = mNome;
        score = mScore;
        rating = mRating;
        genre = mGenre;
        runningTime = mRunningTime;
    }

    public String getNome() {
        return nome;
    }

    public Double getScore() {
        return score;
    }
    
    public int getRunningTime() {
        return runningTime;
    }
    
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return String.format("┃  %-26.26s ┃ %8s ┃ %8s ┃ %12s  ┃ %13s ┃", nome, score, rating, genre, runningTime);
    }
}
