package heranca_II;

public class Videogame extends Jogo {
    private String VideoGame;

    public Videogame() {
        super();
    }

    public Videogame(String videoGame) {
        super();
        setVideoGame(videoGame);
    }

    public String getVideoGame() {
        return VideoGame;
    }

    public void setVideoGame(String videoGame) {
        VideoGame = videoGame;
    }

    @Override
    public void MostrarJogo() {
        System.out.println("---------------------------");
        super.MostrarJogo();
        System.out.println("Videogame: " + getVideoGame());
        System.out.println("---------------------------");
    }

}