public class ClassStudent {
    private String name;
    private int age;
    private String course;

    public ClassStudent(String name, int age, String course){
        this.name=name;
        this.age=age;
        this.course=course;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    
    }
    public String course(){
        return course;
    }
    public void displayDetails(){
        System.out.println("name is "+name);
        System.out.println("Age is "+ age);
        System.out.println("course is "+ course);
    }

    public static void main(String[] args) {
        ClassStudent student=new ClassStudent("John",30,"Science");
        student.displayDetails();

    }
    
}
