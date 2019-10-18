package 反射;


public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        System.out.println("-------------");
        Class<Student> c2 = Student.class;
        System.out.println(c2==c1);
        System.out.println("-------------");
        Student one = new Student();
        Class<? extends Student> c3 = one.getClass();
        System.out.println(c3==c1);
        System.out.println("-------------");
        Class<?> c4 = Class.forName("反射.Student");
        System.out.println(c4==c1);

    }
}
