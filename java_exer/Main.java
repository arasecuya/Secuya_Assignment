public class Main{
    public static void main(String[]args){

        Personal_Info a = new Personal_Info(); 
        Personal_Info constructor = new Personal_Info("Ara Mae Secuya" , 20, "Female");


        a.setName("Ara Mae Secuya");
        a.setAge(20);
        a.setGender("Female");

        System.out.println("Constructor in java with parameter");
        System.out.println ("================================");
        System.out.println("Name: " + constructor.name);
        System.out.println("Age: " + constructor.age);
        System.out.println("Gender: " + constructor.gender);
        System.out.println ("================================");

        
        System.out.println("Name: " + a.getName() );
        System.out.println("Age: " + a.getAge() );
        System.out.println("Gender: " + a.getGender() );
        System.out.println ("================================");

        student s = new student();
        System.out.println("Teacher of Java Programming 2: " + s.InstructorsName);

        Personal_Info p = new Personal_Info();
        p.show();

        Personal_Info p2 = new student();
        p2.show();

    }
}