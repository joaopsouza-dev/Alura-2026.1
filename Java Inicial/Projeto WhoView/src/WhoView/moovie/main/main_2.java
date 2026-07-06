package WhoView.moovie.main;

import WhoView.moovie.pack.Moovie;

public class main_2 {

    public static void main(String[] args) {
        Moovie moovie1 = new Moovie();

        moovie1.setName("Harry Potter and the Filosofer's Stone");
        moovie1.setGenre("Action and Magic");
        moovie1.setIncluded(false);
        moovie1.setMinutes(127);
        moovie1.setRelease(2000);

        moovie1.somarNotas(7.8);
        moovie1.somarNotas(9.6);
        moovie1.somarNotas(4.8);

        moovie1.FichaTecnica();

    }
}
