package ThingLike;
import Exeptions.WeightlessnessDeviseOnExeption;
import Thing.Thing;

public class WeightlessnessDevise extends Thing {
    private boolean work = false;
    private final int range;

    public WeightlessnessDevise(String name, int range) {
        this.range = range;
        setName(name);
    }

    public void turnOn() throws WeightlessnessDeviseOnExeption {
        if (!this.work) {
            this.work = true;
            System.out.println("Вкючение объекта " + toString() + ": ");
            System.out.println("\tСила тяжести начинает ощущаться на расстоянии " + this.range + " шагов");
        }
        else throw new WeightlessnessDeviseOnExeption(toString() + " и так включен");
    }

    public void turnOff() throws WeightlessnessDeviseOnExeption {
        if (this.work) {
            this.work = false;
            System.out.println("Выкючение объекта " + toString() + ": ");
            System.out.println("\tСила тяжести перестаёт ощущаться");
        }
        else throw new WeightlessnessDeviseOnExeption(toString() + " и так выключен");
    }

    public boolean getWork(){
        return this.work;
    }

}
