package ExA;

public class Main {

    public static void main(String[] args) {
        Person primeira = new Person("Maria", "Silva", 20);
        primeira.setNationality("Portuguesa");

        Person segunda = new Person("João", "Santos", 30);
        segunda.setNationality("Espanhol");
        segunda.setStreet("Benfica");

        System.out.println(primeira.getNationality());
        System.out.println(primeira);
        System.out.println(segunda);

    }

}
