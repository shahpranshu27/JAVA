class Student {
    int id;
    String name;
    public static void main(String[] args) {
        Student s1 = new Student();
        // initialization through reference variable
        s1.id = 2;
        s1.name = "pranshu";
        System.out.println(s1.id);
        System.out.println(s1.name);

        Student s2 = new Student();
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
