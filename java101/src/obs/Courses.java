package obs;

public class Courses {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Courses(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0; //this.note=0;
    }
    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            //printTeacher();
        }else{
            System.out.println("Yanlis kod girdiniz.");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }
}