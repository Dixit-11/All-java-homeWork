public class Homework2 {
     static Homework2 homework2 = new Homework2();
        static int a = 30;// static variable

        int b = 20; // it's called non static variable or  instance variable

        public static void main(String[] args) {
        System.out.println(a); // dont need a visa
        System.out.println(homework2.b); // object is created in the same class, (need a visa)


    }

}
