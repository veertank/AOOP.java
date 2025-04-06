public class student{

    public int ernum;
    public String name;

    public student ( String name , int ernum){
        this.ernum=ernum;
        this.name=name;
    }

    public static void main(String[]args){
        student s1 = new student("rahul",31);
        student s2 = new student("rahul",31);
        student s3 = new student("rahul",31);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
    
}


