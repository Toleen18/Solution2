public class Tester {
    public static void main(String [] args){

        /// Question 3
        Student MyStudent = new Student();
        MyStudent.setName("Toleen");
        MyStudent.setGrade(89);
        MyStudent.setID(48347837);
        System.out.println( "Student grade :" +MyStudent.getGrade());
        System.out.println( "Student Name :" +MyStudent.getName());
        System.out.println( "Student ID :" +MyStudent.getID());
        System.out.println(MyStudent.isPassing(33));
        MyStudent.positiveGrade(76);
        MyStudent.positive(343847384);

        // Question 2(car)
        car ca=new car();
        ca.setBrand("toyota");
        ca.setModel(2020);
        ca.print();


        // Question 1
        person p=new person();
        p.setName("");
        p.setAge(130);
        p.printperson();

        // Question 4
        Rectangle2 MyRectangle = new Rectangle2();
        MyRectangle.setLength(24.2);
        MyRectangle.setWide(12.6);
        System.out.println(MyRectangle.getLength());
        System.out.println(MyRectangle.getWide());
        System.out.println(MyRectangle.g(12.6,24.2));
        System.out.println(MyRectangle.Area(12.6,24.2));

    }
}
