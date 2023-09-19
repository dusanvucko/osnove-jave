package d18_09_2023;

public class Zadatak1 {

    public static void main(String[] args) {

        VideoPlayer player = new VideoPlayer(254, 24, 2);
        player.stampaj();

        TimeControl kontrolaVremena = new TimeControl(false);
        kontrolaVremena.izvrsiAkciju(player);
        kontrolaVremena.izvrsiAkciju(player);

        player.stampaj();

        AudioControl kontrolaZvuka = new AudioControl(false);
        kontrolaZvuka.izvrsiAkciju(player);
        kontrolaZvuka.izvrsiAkciju(player);
        kontrolaZvuka.izvrsiAkciju(player);
        kontrolaZvuka.izvrsiAkciju(player);

        player.stampaj();

        QualityOptimizerControl kontrolaKvaliteta = new QualityOptimizerControl(75.4);
        kontrolaKvaliteta.izvrsiAkciju(player);

        player.stampaj();
    }
}
