import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;

public class mainlock {
    public static void main(String[] args) }

class User {
    String password;
    String login;

    public User(String password, String login) {
    this.password = password;
    this.login = login;
    }        

}

class Cinema {
    int id;
    int creatorId;
    String name;
    int genereId;
}

class Genere {
    int id;
    String name;

}

class FilmProducer {
    int id;
    String titleName;
}

class Dd {
    ArrayList<Cinema>films = new ArrayList<>()
    ArrayList<Cinema>genres = new ArrayList<>()
    ArrayList<Cinema>filmProducers = new ArrayList<>()

}

class DdApi {
    int cinemaIdGenrator;
    int filmProducerIdGenerator;
    int genreIdGenerator;

    Dd db;

    private void getGenreId(){
        return genreIdGenerator++;
    }

    public void init(){
        db = new Db();
    }

    public void init() {
        db = new Db();
        FilmProducer fp1 = new FilmProducer(1, "Ужас");
        FilmProducer fp2 = new FilmProducer(2, "Комедия");
        FilmProducer fp3 = new FilmProducer(3, "Боевик");

        db.filmProducers.add(fp1);
        db.filmProducers.add(fp2);
        db.filmProducers.add(fp3);


        Genere g1 = new Genere(getGenreId(), "Комедия");
        Genere g2 = new Genere(getGenreId(), "Фентази");
        Genere g3 = new Genere(getGenreId(), "Драма");
        Genere g4 = new Genere(getGenreId(), "Теле");

        db.genres.add(g1);
        db.genres.add(g2);
        db.genres.add(g3);
        db.genres.add(g4);

db.films.add(new Cinema(1, 2, "Телепузики" , 1))
db.films.add(new Cinema(1, 3, "Хачипури" , 2))
}

public Db getGb(){
    return db;
}

class FilmProducer{
    Db db;

    public Pro(){
        return db;
    }
}

class Film{
    String creatorId;
    String name;
    String genere;
}
    @Override
    public String toString(){

        return String.format("%S %S %S");

    }

class FilmFinder{
    Db db;

    public FilmFinder(Db db){
        this.db = db;
    }
    public Film getFilmBy(int id){
        Cinema c = db.films.get(id - 1);

        Genere g = db.generes.get(c.genereId - 1);
        FilmProducer p = db.filmProducers.get(c.creatorId - 1);

        return new Film(p.titleName, c.name, g.name);
    }
}

class Appication{
    public static void run(){
        DbApi dbApi = new DbApi();
        dbApi.init();

        Db db = dbApi.getGb();

        FilmFinder ff = new FilmFinder(db);
        System.out.println(ff.getFilmBy(1));
    }
}