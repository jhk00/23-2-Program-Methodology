public class Main {
    public static void main(String[] args) {
        Person p = new Person("마음");
        Person q = new PersonFrom("소리", "서울");
        System.out.println(p.sameName(q)); // FALSE
        Person x = q; System.out.println(x.getName()); // 소리
        // System.out.println(q.same(p));
        //PersonFrom x = p; System.out.println(x.getCity()); // 에러
        //Person x = q; System.out.println(x.getCity());// 에러



    }
}
