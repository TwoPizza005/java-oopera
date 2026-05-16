
import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    String director;
     ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже найден");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен.");
        }
    }

    public void removeActor(Actor newActor, String replaceableActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor noName = listOfActors.get(i);
            if (noName.surname.equals(replaceableActor)) {
                listOfActors.remove(i);
                listOfActors.add(newActor);
                System.out.println("Актёр с фамилией " + replaceableActor + " заменён на: " + newActor);
                return;
            }
        }
        System.out.println("Актер с фамилией " + replaceableActor + " не найден.");
    }

}


