import Human.Human;
import Story.Story;
import ThingLike.Cord;
import ThingLike.Place;
import ThingLike.Rocket;
import ThingLike.WeightlessnessDevise;

public class Main {
    public static void main(String[] args) {
        Human znayka = new Human("Знайка", "М");
        Human steklyashkin = new Human("Стекляшкин", "М");
        Human fucsia = new Human("Фуксия", "Ж");
        Human korotishki = new Human("Коротышки", "ТОЛПА");
        Cord cordHave = null;
        try {
            cordHave = new Cord("Шнур", 40);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Cord cordNeed = null;
        try {
            cordNeed = new Cord("Шнур который нужен", 240);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Rocket rocket = new Rocket("Ракета");
        Place cave = new Place("Пещера");
        Place moon = new Place("Луна");
        WeightlessnessDevise weightlessnessDevise = new WeightlessnessDevise("Прибор невесомости", 240);

        Story.addToCrew(steklyashkin, znayka, fucsia, korotishki);

        Story.tell(cordHave, cordNeed, rocket, cave, moon, weightlessnessDevise);
    }
}
