package obs;

public class Main {
    public static void main(String[] args) {
        Teacher t1 =new Teacher("Mahmut hoca", " TRH ", "111");
        Teacher t2 =new Teacher("Grahambel"," FZK ", "000");
        Teacher t3 =new Teacher("Sevim Zengin"," BYL ", "5555");

        Courses tarih=new Courses("Tarih"," 102"," TRH ");
        tarih.addTeacher(t1);
        Courses fizik=new Courses("fizik"," 101"," FZK ");
        fizik.addTeacher(t2);
        Courses biyo=new Courses("Biyoloji"," 100"," BYL ");
        biyo.addTeacher(t3);


        Students s1 =new Students("Ertu", "1748", "London", tarih,fizik,biyo);
        s1.addBulkExamNote(55,50,100);
        s1.isPass();


    }
}
