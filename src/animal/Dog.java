package animal;

public class Dog extends Animal{
    private String name;
    private int run;
    private int swim;

    private String subClass = "dog";


    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }


    static int count;

    @Override
    public void run(int run) {
        if (this.run > 500) {
            System.out.println("dog " + name + " does not run");
        } else {
            System.out.println(name + " run " + run + " m");
        }
    }

    public void run() {
        if (run > 500) {
            System.out.println("dog " + name + " does not run");
        } else {
            System.out.println(name + " run " + run + " m");
        }
    }

    @Override
    public void swim(int swim) {
        if (swim > 10) {
            System.out.println("dog " + name + " does not swim");
        } else {
            System.out.println(name + " swim " + swim + " m") ;
        }
    }

    public void swim() {
        if (this.swim > 10) {
            System.out.println("dog " + name + " does not swim");
        } else {
            System.out.println(name + " swim " + swim + " m") ;
        }
    }

    public Dog() {
        count++;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Dog(String name) {
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
