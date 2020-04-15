package SingletonPattern;

class Person {
    private static Person person = null;
    private String name;
    private int age;
    private int salary;

    private Person() {
    };

    public static Person getInstance() {
        if (person == null) {
            synchronized (Person.class) {
                if (person == null) {
                    person = new Person();
                }
            }
        }
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", salary=" + salary + "]";
    }
}