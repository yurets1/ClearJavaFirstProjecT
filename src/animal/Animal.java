package animal;

public class Animal {
    String name;
    int run;
    int swim;

    String subClass;
    static int count;

    public void run(int run) {
        System.out.println("run " + run);
    }

    public void swim(int swim) {
        System.out.println("swim " + swim);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Animal() {
        count++;
    }

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String getSubClass() {
        return subClass;
    }
}
