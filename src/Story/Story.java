package Story;

import Exeptions.WeightlessnessDeviseOnExeption;
import Human.Human;
import ThingLike.*;

import static Enum.Methods.MATHEMATICAL;
import static Enum.Methods.PRACTICAL;
import static Enum.Direction.UP;
import static Enum.Direction.DOWN;


public class Story {
    private static Human human1;
    private static Human human2;
    private static Human human3;
    private static Human human4;

    public static void addToCrew(Human human1, Human human2, Human human3, Human human4){
        Story.human1 = human1;
        Story.human2 = human2;
        Story.human3 = human3;
        Story.human4 = human4;
    }

    public static void tell(Cord cord1, Cord cord2, Rocket rocket, Place cave, Place moon, WeightlessnessDevise devise){
        System.out.println("\n\t\tНАЧАЛО ИСТОРИИ\n");
        System.out.println("\t\t\t*****\n");

        human1.say("CRY", "ААААААА");
        human2.toved(human1.toString(), UP, human4.toString());
        human4.move("GO", "обратный путь");
        human4.move("COME", rocket.toString());
        System.out.println();

        human2.meeting();
        human1.say("TELL", "я видел внизу какую-то неизвестную землю с населенным пунктом");
        human1.see("SAW","только часть населённого пункта");
        System.out.println();

        human3.say("SAY", "Ракета НИП вполне исправна и ничуть не пострадала при посадке на Луну, все ее механизмы действуют безотказно");
        human3.say("SAY", "Прибор невесомости находиться в полной исправности");
        human2.say("SAY", "Принести прибор невесомости");

        if (cord1.hashCode() != cord2.hashCode()){
            System.out.println();
            human2.calculate(MATHEMATICAL, cord1.toString());
            cord1.lengthTriple();
            if (!cord1.equals(cord2)){
                System.out.println();
                human2.calculate(PRACTICAL, cord1.toString());
                cord1.lengthDouble();
            }
            else {
                System.out.println("шнуры равны");
            }
        }
        else {
            System.out.println("шнуры равны");
        }

        System.out.println();

        rocket.bind(cord1.toString());
        human2.take(cord1.toString());
        human2.move(240);
        System.out.println();

        String command = "Включить " + devise.toString();
        human2.giveCommand(command);
        human3.executeCommand(command);
        try {
            devise.turnOn();
        } catch (WeightlessnessDeviseOnExeption weightlessnessDeviseOnExeption) {
            weightlessnessDeviseOnExeption.printStackTrace();
        }
        human2.toved(rocket.toString(), cave.toString(), devise.getWork());
        System.out.println();

        rocket.separate(moon.toString());
        rocket.move(UP);

        human2.toved(cord1.toString());
        human2.move("STEP", "лунной поверхности");
        rocket.swimOnSurface(moon.toString(), 3, true);
        human4.see("SEE", "иллюминаторы");
        human4.say("FUN", "Знайка тащит ракету на привязи");
        rocket.move(DOWN);
        human2.see("SEEN", "");
        rocket.swimOnSurface(moon.toString(), 3, false);
        human2.toved(rocket.toString(), cave.toString(), !(devise.getWork()));
        human2.move("COME", rocket.toString());
        try {
            devise.turnOff();
        } catch (WeightlessnessDeviseOnExeption weightlessnessDeviseOnExeption) {
            weightlessnessDeviseOnExeption.printStackTrace();
        }

        System.out.println("\n\t\t\t*****\n");
        System.out.println("\t\tКОНЕЦ ИСТОРИИ\n");
    }
}
