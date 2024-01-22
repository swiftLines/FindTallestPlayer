class Player {

    private String name;
    private int age;
    private Height height;

    public Player(String name, int age, Height height) {
        
        this.name = name;
        this.age = age;
        this.height = height;
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
        return name + " who's age is " + age + " is " + height.toString();
    }
}