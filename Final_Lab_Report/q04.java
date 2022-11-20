public class example{   
    String id="213-15-4588";
    String name="Sourav Kumar Das";
    public void display(){
        System.out.println("Student name : "+name);
        System.out.println("Student ID : "+id);
    }
}



public class person extends example{
    public void display(){
        System.out.println("Person name : "+super.name);
        System.out.println("Person ID : "+super.id);
        super.display();
    }
    public static void main(String[] args){
        person p1 = new person();
        p1.display();
    }
}
