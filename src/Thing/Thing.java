package Thing;

public abstract class Thing{
    private String name = "name";

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
