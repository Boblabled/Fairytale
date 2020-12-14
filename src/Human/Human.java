package Human;
import Interfaces.Calculations;
import Interfaces.Command;
import Enum.Methods;
import Enum.Direction;

public class Human implements Command, Calculations{
    private String name = "Имя";
    private String gender = "Heavy battle tank";

    public Human(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void take(String object) {
        if (this.gender.equals("М")) {
            System.out.println(this.name + " взял в руки объект " + object);
        }

        if (this.gender.equals("Ж")) {
            System.out.println(this.name + " взяла в руки объект " + object);
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(this.name + " взяли в руки объект " + object);
        }
    }

    public void move(int distance) {
        if (this.gender.equals("М")) {
            System.out.println(this.name + " отошёл на " + distance + " шагов");
        }
        if (this.gender.equals("Ж")) {
            System.out.println(this.name + " отошла на " + distance + " шагов");
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(this.name + " отошли на " + distance + " шагов");
        }
    }

    public void toved(String object, String place, Boolean deviseWork) {
        if (deviseWork) {
            if (this.gender.equals("М")) {
                System.out.println(this.name + " потащил объект " + object + " к месту " + place);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(this.name + " потащила объект " + object + " к месту " + place);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(this.name + " потащили объект " + object + " к месту " + place);
            }
        }

        if (!deviseWork) {
            if (this.gender.equals("М")) {
                System.out.println(this.name + " не может сдвинуть объект " + object );
            }
            if (this.gender.equals("Ж")) {
                System.out.println(this.name + " не может сдвинуть объект " + object );
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(this.name + " не могут сдвинуть объект " + object );
            }
        }
    }

    public void toved(String object, Direction place, String human) {
        System.out.println(this.name + " и " + human + " потащили " + object + "а " +  place);
    }

    public void toved(String object){
        if (this.gender.equals("М")) {
            System.out.println(this.name + " потянул за объект " + object);
        }
        if (this.gender.equals("Ж")) {
            System.out.println(this.name + " потянул за объект " + object);
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(this.name + " потянул за объект " + object);
        }
    }


    public void giveCommand(String command) {
        if (this.gender.equals("М")) {
            System.out.println(this.name + " подал команду: \n\t" + command);
            System.out.println();
        }
        if (this.gender.equals("Ж")) {
            System.out.println(this.name + " подала команду: \n\t" + command);
            System.out.println();
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(this.name + " подали команду: \n\t" + command);
            System.out.println();
        }
    }

    public void executeCommand(String command){
        if (this.gender.equals("М")) {
            System.out.println(this.name + " выполнил команду: \n\t" + command);
            System.out.println();
        }
        if (this.gender.equals("Ж")) {
            System.out.println(this.name + " выполнила команду: \n\t" + command);
            System.out.println();
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(this.name + " выполнили команду: \n\t" + command);
            System.out.println();
        }
    }

    public void calculate(Methods calculation, String object) {
        if (this.gender.equals("М")) {
            System.out.println(this.name + " произвёл " + calculation + " объекта " + object);
        }
        if (this.gender.equals("Ж")) {
            System.out.println(this.name + " произвела " + calculation + " объекта " + object);
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(this.name + " произвели " + calculation + " объекта " + object);
        }
    }

    public void say(String expression, String phrase) {
        if (expression.equals("CRY")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " закричал: '" + phrase + "'");
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " закричала: '" + phrase + "'");
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " закричали: '" + phrase + "'");
            }
        }

        if (expression.equals("SAY")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " сказал: '" + phrase + "'");
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " сказала: '" + phrase + "'");
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " сказали: '" + phrase + "'");
            }
        }

        if (expression.equals("TELL")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " рассказал: '" + phrase + "'");
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " рассказала: '" + phrase + "'");
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " рассказали: '" + phrase + "'");
            }
        }

        if (expression.equals("FUN")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " радовался: '" + phrase + "'");
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " радовалась: '" + phrase + "'");
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " радовались: '" + phrase + "'");
            }
        }
    }

    public void move(String mode, String place){
        if (mode.equals("GO")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " отправился в " + place);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " отправилась в " + place);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " отправились в " + place);
            }
        }

        if (mode.equals("COME")){
            if (this.gender.equals("М")) {
                System.out.println(toString() + " вернулся в " + place);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " вернулась в " + place);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " вернулись в " + place);
            }
        }

        if (mode.equals("STEP")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " зашагал по " + place);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " зашагала по " + place);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " зашагали по " + place);
            }
        }
    }

    public void see(String mode, String object){
        if (mode.equals("SAW")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " видел " + object);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " видела " + object);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " видели " + object);
            }
        }

        if (mode.equals("SEE")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " смотрел в " + object);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " смотрела в " + object);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " смотрели в " + object);
            }
        }

        if (mode.equals("SEEN")) {
            if (this.gender.equals("М")) {
                System.out.println(toString() + " увидел: " + object);
            }
            if (this.gender.equals("Ж")) {
                System.out.println(toString() + " увидела: " + object);
            }
            if (this.gender.equals("ТОЛПА")) {
                System.out.println(toString() + " увидели: " + object);
            }
        }
    }

    public void meeting(){
        if (this.gender.equals("М")) {
            System.out.println(toString() + " устроил экстренное совещание");
        }
        if (this.gender.equals("Ж")) {
            System.out.println(toString() + " устроила экстренное совещание");
        }
        if (this.gender.equals("ТОЛПА")) {
            System.out.println(toString() + " устроили экстренное совещание");
        }
    }
}
