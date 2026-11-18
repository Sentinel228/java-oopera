import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        // Создаём 3 актёра, 2 режиссёра, автора музыки и хореографа
        Actor actor1 = new Actor("Кирилл", "Ключник", Person.Gender.MALE, 180);
        Actor actor2 = new Actor("Александр", "Чернов", Person.Gender.MALE, 175);
        Actor actor3 = new Actor("Никита", "Вержанский", Person.Gender.MALE, 179);
        Director director1 = new Director("Вадим", "Антонов", Person.Gender.MALE, 18);
        Director director2 = new Director("Фёдор", "Васильевич", Person.Gender.MALE, 7);
        Person musicAuthor = new Person("Анатолий", "Кравцов", Person.Gender.MALE);
        Person choreographer = new Person("Эдуард", "Тарасов", Person.Gender.MALE);
        // Создали списки актёров для будущих объектов представлений
        ArrayList<Actor> musicalActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        // Создаём обьекты представлений
        MusicalShow musicalShow = new MusicalShow("Щелкунчик", 180, director1, musicalActors,
                musicAuthor, "Либретто");
        Opera opera = new Opera("Сканди", 120, director2, operaActors,
                musicAuthor, "Либретто оперы", 12);
        Ballet ballet = new Ballet("Лебеди", 90, director1, balletActors,
                musicAuthor, "Либретто баллета", choreographer);
        // Распределяем актёров по спектаклям
        musicalShow.addNewActor(actor1);
        musicalShow.addNewActor(actor3);
        opera.addNewActor(actor1);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);
        // Выводим всех актёров из каждого шоу
        musicalShow.printAllActors(musicalActors);
        opera.printAllActors(operaActors);
        ballet.printAllActors(balletActors);
        // Меняем актёра в musicalShow и снова выводим список всех актеров
        musicalShow.changeAnActor(actor2, "Ключник");
        musicalShow.printAllActors(musicalActors);
        // Пытаемся поменять несуществующего актёра в opera
        opera.changeAnActor(actor3, "Поздняков");
        // Выводим текст Либретто с помощью унаследованного геттера класса musicalShow
        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());

        }
    }

