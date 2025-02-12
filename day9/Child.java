public class Child extends Parent{
    public static void main(String[] args) {
        Child child=new Child();    
        child.study();
        child.job();
        
    }
    void study(){
        System.out.println("Studying java programing");
    }
    void job(){
        System.out.println("Got a job");
    }
}
