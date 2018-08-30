public class Main {
    public static void main(String[] args) {

        Predicate<String> p1=s -> s.length() <20 ;
        Predicate<String> p2=s -> s.length() >5 ;

        boolean b=p1.test("Hello");
        System.out.println("Hello is shorter than 20 chars :"+b);

        Predicate<String> p3=p1.and(p2);

        System.out.println("P3 for yes :" +p3.test("yes"));
        System.out.println("P3 for Good Morning:" +p3.test("Good Morning"));
        System.out.println("P3 for Good Morning LindaDaniel:" +p3.test("Good Morning LindaDaniel"));

        System.out.println("**************************");

        Predicate<String> p4=p1.or(p2);

        System.out.println("P4 for yes :" +p4.test("yes"));
        System.out.println("P4 for Good Morning:" +p4.test("Good Morning"));
        System.out.println("P4 for Good Morning LindaDaniel:" +p4.test("Good Morning LindaDaniel"));

        System.out.println("**************************");

        Predicate<String> p5=Predicate.isEqualTo("Yes");

        System.out.println("P5 for yes :" +p5.test("Yes"));
        System.out.println("P5 for No :" +p5.test("No"));

        System.out.println("**************************");
        Predicate<Integer> p7=Predicate.isEqualTo(1);
        System.out.println("P5 for 10 :" +p7.test(10));
        System.out.println("P5 for 1 :" +p7.test(1));
    }
}