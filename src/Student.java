import java.util.Date;

public class Student {
    //attributes~ thuoc tinh
    String name;
    Date birthdate;
    String code;
    // methods~ phuong thuc
    //1.constructor `ham tao
    public Student(){
        this.name = " Nguyen Van A";
        this.birthdate = new Date();
        this.code ="d1309";
    }
    //other methods
    public void print(){
        System.out.println(this.name);
        System.out.println(this.birthdate);
        System.out.println(this.code);

    }

}
