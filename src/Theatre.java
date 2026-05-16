import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Михаил", "Зубенко", Gender.MALE, 183);
        Actor actor2 = new Actor("Даша", "Путешественница", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Роберт", "Дауни мл.", Gender.MALE, 174);


        Director director1 = new Director("Кристофер", "Колумб", Gender.MALE, 15);
        Director director2 = new Director("Грета", "Туборг", Gender.FEMALE, 8);

        String musicAuthor = "Людвиг ван Бетховен";
        String choreographer = "Алекандр Петрович";


        ArrayList<Actor> emptyList = new ArrayList<>();

        Show regularShow = new Show("Зубенко Михаил Петрович ", 180,
                director1.name + " " + director1.surname, emptyList);
        Opera opera = new Opera("Тоска", 150,
                director2.name + " " + director2.surname, emptyList,
                musicAuthor, "Либретто оперы Тоска: действие в Риме...", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 130,
                director1.name + " " + director1.surname, emptyList,
                musicAuthor, "Либретто балета: принц Зигфрид влюбляется в Одетту...", choreographer);


        System.out.println("Добавление актёров");
        regularShow.addNewActor(actor1);
        regularShow.addNewActor(actor2);
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor3);
        System.out.println();

        regularShow.printActors();
        opera.printActors();
        ballet.printActors();
        System.out.println();


        System.out.println("Замена актёра (существующий) ");
        regularShow.removeActor(actor3, "Зубенко");
        regularShow.printActors();
        System.out.println();

        System.out.println(" Попытка замены несуществующего актёра ");
        ballet.removeActor(actor1, "Пупкин");
        System.out.println();


        System.out.println(" Либретто оперы ");
        opera.getLibrettoText();
        System.out.println(" Либретто балета ");
        ballet.getLibrettoText();
    }
}