public class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age ,String course){
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
    public String getCourse(){
        return course;
    }
    public void displayDetails(){
        System.out.println("Name" + name);
        System.out.println("Age"+ age);
        System.out.println("Course: "+ course);
    }
    



    public static void main(String[] args) {
        Student student=new Student("John",20,"Computer Science");
        student.displayDetails();

    }
}
