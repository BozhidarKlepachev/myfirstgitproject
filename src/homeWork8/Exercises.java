package homeWork8;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        Person bulgarian = new Person("Bozhidar","Male","Orthodox","Bulgarian",true,"Bulgarian","6605044060","Bulgaria");
        Person italian = new Person("Francesco","Male","catholic","Italian",true,"Italian","9512235467","Italia");
        Person american = new Person("Tom","Male","Orthodox","English",true,"American","9903047895","USA");
        Person child = new Person("Ivan","Male","Orthodox","Bulgarian",false,"Bulgarian","9909092050","Bulgaria");

        executePersonActions(bulgarian);
        executePersonActions(italian);
        executePersonActions(american);
        executePersonActions(child);

    }
    private static void executePersonActions(Person person) {
        System.out.println("Execute actions for class " + person.getClass().getSimpleName());
        person.celebrateEaster();
        person.sayHello();
        person.canTakeLoan();
        person.isAdult();
    }
}
