


class Person {

    private String name;
    private int age;
    private String gender;
    private String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String hello() {
        StringBuffer greeting = new StringBuffer();
        greeting.append("Hello, my name is ").append(name)
                .append(", my gender is ").append(gender)
                .append(" and I am ").append(age).append(" years old. ")
                .append("My interests are ");


        for (int i = 0; i < interests.length; i++) {
            greeting.append(interests[i]);
            if (i < interests.length - 1) {
                greeting.append(", ");
            }
        }
        greeting.append(".");
        return greeting.toString();

    }


    public static void main(String[] args) {
        Person person = new Person("Ryuk", 35, "male",
                new String[]{"being a hardarse", "agile", "SSD hard drives"}
        );
        String greeting = person.hello();
        System.out.println(greeting);
    }
}