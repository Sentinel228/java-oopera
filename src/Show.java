import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    public void printAllActors(ArrayList<Actor> listOfActors){
        for (Actor actor : listOfActors){
            System.out.println(actor.name + " " + actor.surname + " (" + actor.height + ")");
        }
    }
    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public void addNewActor(Actor actor){
        for (Actor actors : listOfActors){
            if (actor.equals(actors)){
                System.out.println("Такой актёр в спектакле уже есть, добавьте другого.");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актёр успешно добавлен.");
    }
    public void changeAnActor(Actor actor, String anotherSurname){
        for(Actor actors : listOfActors){
            if(actors.surname.equals(anotherSurname)){
                listOfActors.remove(actors);
                listOfActors.add(actor);
                System.out.println("Актёр успешно изменён.");
                return;
            }

            }
        System.out.println("Актёр с такой фамилией на найден, попробуйте изменить входные данные.");

    }

}
