package ThingLike;

import Thing.Thing ;
import Enum.Direction;
public class Rocket extends Thing {
    public Rocket(String name) {
        setName(name);
    }

    public void bind(String object){
        System.out.println(toString() + " была привязан объектом " + object);
    }

    public void separate(String place){
        System.out.println(toString() + " отделилась от объекта " + place);
    }

    public void move(Direction direction){
        if (direction.toString().equals("вверх")) {
            System.out.println(toString() + " поднялась " + direction);
        }

        if (direction.toString().equals("вниз")) {
            System.out.println(toString() + " опустилась " + direction);
        }
    }

    public void swimOnSurface(String place, int repeat, Boolean work){
        if (work){
            System.out.println(toString() + " поплыла по поверхности объекта " + place + ":");
            int i = 0;
            while (i < repeat) {
                System.out.println("\t" + toString() + " коснулась поверхности объекта " + place);
                System.out.println("\t" + toString() + " оттолкнулась от поверхности объекта " + place);
                System.out.println();
                ++i;
            }
        }

        if (!work) {
            System.out.println("\t" + toString() + " не оттолкнулась от поверхности объекта " + place);
        }
    }
}
