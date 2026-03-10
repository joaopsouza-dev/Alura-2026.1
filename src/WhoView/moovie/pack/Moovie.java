package WhoView.moovie.pack;

public class Moovie {

    private String name;
    private int release;
    private String genre;
    private boolean included;
    private int minutes;
    private double avaliacao;
    private int qtd_avaliacoes;

    public void FichaTecnica () {

        System.out.println("DADOS DO FILME:\n");
        System.out.println("Nome: " + name);
        System.out.println("Data de lançamento: " + release);
        System.out.println("Gênero: " + genre);
        System.out.printf("Tamanho do filme: %d minutos", minutes);
        System.out.println("\nQuantidade de Avaliações: " + qtd_avaliacoes);
        System.out.printf("Media de Avaliação do público: %.2f", average());

        if (included) {
            System.out.println("\nO filme está incluso no seu plano atual");
        } else {
            System.out.println("\nO filme não está incluso no seu plano atual");
        }

    }

    public void somarNotas (double notas) {

        avaliacao += notas;
        qtd_avaliacoes++;
    }

    public double average() {
        return avaliacao / qtd_avaliacoes;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setQtd_avaliacoes(int qtd_avaliacoes) {
        this.qtd_avaliacoes = qtd_avaliacoes;
    }
}
