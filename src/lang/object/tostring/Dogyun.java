package lang.object.tostring;

public class Dogyun {

    private String name;
    private int age;
    public Dogyun(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dogyun{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
