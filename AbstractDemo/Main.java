public class Main {
    public static void main(String[] args) {
        Son son1 = new Son(20);
        son1.career();
        son1.partner();

        Daughter daughter = new Daughter(22);
        daughter.career();
        daughter.partner();

        Parent.hello();

        son1.normal();

        daughter.normal();

        // Parent mom = new Parent(); // we can not create abstract objects

    }
}
