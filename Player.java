class Player {

    private String name;
    private int age;
    protected int feet;
    protected int inches;
    protected Height height = new Height(feet, inches);

    public Player(String name, int age, int feet, int inches) {
        
        this.name = name;
        this.age = age;
        this.height = new Height(feet, inches);
    }

    public Height getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        // labels instead of a sentence
        return name + " who's age is " + age + " is " + height.toString();
    }
}