package animal;

public class Cat extends Animal{

    private String name;
    private int run;
    private int swim;

    private String subClass = "cat";


    public Cat(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    static int count;

    @Override
    public void run(int run) {
        if (run > 200) {
            System.out.println("cat " + name + " does not run");
        } else {
            System.out.println(name + " run " + run + " m");
        }
    }

    public void run() {
        if (run > 200) {
            System.out.println("cat " + name + " does not run");
        } else {
            System.out.println(name + " run " + run + " m");
        }
    }

    @Override
    public void swim(int swim) {
        System.out.println("cat " + name + " does not swim");
    }

    public void swim() {
        System.out.println("cat " + name + " does not swim");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Cat(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
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
