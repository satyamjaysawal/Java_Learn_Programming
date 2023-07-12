public class Person {
    private String name;
    private int age;
    private String fatherName;

    public Person(String name,int age , String fatherName){
        this.name=name;
        this.age=age;
        this.fatherName=fatherName;
    }

    public String getName(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getfatherName(){
        return fatherName;

    }
    public void display(){
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("fatherName "+fatherName);
    }


    public static void main(String[] args) {
        Person person=new Person("Satyam",23,"Anil jaiswal");
        person.display();

        System.out.println(person.getfatherName());
    }
}
