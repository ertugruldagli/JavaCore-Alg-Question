package obs;

public class Teacher {
    String mpno;
    String name;
    String branch;

    Teacher ( String name,  String branch, String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }

    void print(){
        System.out.println( "Teacher: "+this.name+ "\nDal: "+ this.branch + "\nPhone: "+this.mpno);
    }


}