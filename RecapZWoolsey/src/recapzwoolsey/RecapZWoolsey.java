package recapzwoolsey;


public class RecapZWoolsey {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.fName = "Kirsten";
        student1.printName();
        
        Student student2 = new Student();
        student2.fName = "Indie";
        
        System.out.println(student1.getTestPercentage(15, 20));
        System.out.println(student2.getTestPercentage(7, 20));
                
        student1.setStudentID(1234567);
        student1.printName();
        System.out.println();
        
    }
    
}
