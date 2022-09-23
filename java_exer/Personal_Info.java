public class Personal_Info implements interFace{
    String name, gender;
    int age;
    String InstructorsName = "Victor Chiong"; 


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public Personal_Info(){
        System.out.println("Hi, This is Java Programming Class.");
        System.out.println ("================================");
    }

    public Personal_Info(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    
    public void show(){
        System.out.println("Inside the method of the parent class");
    }
}
