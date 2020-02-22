package SingletonPattern;

class SingletonPattern {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        p1.setName("Ram");
        p1.setAge(21);
        p1.setSalary(20000);
        System.out.println(p1);

        Person p2 = Person.getInstance();
        System.out.println(p2);
    }
}