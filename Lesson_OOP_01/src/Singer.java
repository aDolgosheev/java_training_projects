public class Singer extends Person {
    public int rating;

    public Singer(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }

    public void printRating() {
        System.out.println(rating);
    }

    public void sing(String verse) {
        System.out.printf("Я пою: %s%n", verse);
    }

    @Override
    public void happyBirthday() {
//        super.happyBirthday();
        age++;
        System.out.println("Я пою себе с др!");
    }

    @Override
    public String toString() {
        return "[" + rating + "] " + name + " (" + age + " лет)";
    }
}
