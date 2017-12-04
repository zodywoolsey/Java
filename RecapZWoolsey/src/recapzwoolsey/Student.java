
package recapzwoolsey;
public class Student {
    public String fName;
    
    static int totalScores;
    static int cntStudents;
    
    private int studentID;
    public boolean isScienceMajor;
    public char gender;
    
    public Student(){//constructor
        int randInt = (int)(Math.random() * 100000);
        studentID = randInt;
    }
    
    public Student(String aName){//overloaded constructor
        fName = aName;
    }
    
    public Student (String aName, boolean Scientist){//another overloaded constructor
        fName = aName;
        isScienceMajor = Scientist;
    }
    
    public void printName(){
        System.out.println(this.fName);
        System.out.printf("ID: %d\tScience Major: %b\tGender: %c\n", studentID, isScienceMajor,gender);
    }
    
    public double getTestPercentage(double totScore, double possPoints){
        totalScores += totScore;
        cntStudents++;
        return (totScore / possPoints);
    }
    
    public void setStudentID(int theID){
        studentID = theID;
    }
    
    public int getStudentID(){
        return studentID;
    }
    
    private int createId(){
        int randInt = (int)(Math.random() * 100000);
        return randInt;
    }
    
}
