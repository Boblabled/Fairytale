package ThingLike;

import Exeptions.CordLengthExeption;
import Thing.Thing ;

public class Cord extends Thing {
    private int length;

    public Cord(String name, int length) throws Exception{
        this.length = length;
        setName(name);
        if (this.length < 0) throw new CordLengthExeption(toString() + " не может иметь отрицательную длинну");
        if(this.length == 0) throw new CordLengthExeption(toString() + " не может иметь длинну равную 0");
    }

    public void lengthDouble(){
        this.length = this.length * 2;
        System.out.println(toString() + " увеличить вдвое до значения " + this.length + " шагов");
    }

    public void lengthTriple() {
        this.length = this.length * 3;
        System.out.println(toString()+ " увеличить втрое до значения " + this.length + " шагов");
    }

    @Override
    public int hashCode() {
        return length;
    }

    @Override
    public boolean equals(Object object) {
        Cord cord = (Cord) object;
        return length == cord.length;
    }
}
