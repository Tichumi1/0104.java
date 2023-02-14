public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
    fullName = "Egor";
    age = 44;
    }
    public void move (){
        System.out.println(fullName + " идет");
    }
    public void talk (){
        System.out.println(fullName + " говорит");
    }
}


