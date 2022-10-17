public class Main {
    public static void main(String[] args) {

        var dog = 8; // Task1
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog += 4; //Task2
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 4; // Task3
        cat -= 1.6;
        paper -= 7_639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19; // Task4
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5; // Task5
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2; //Task6
        var weightBoxer2 = 82.7;
        var weightSum = weightBoxer1 + weightBoxer2;
        System.out.println(weightSum);

        var weighDifference = weightBoxer2 - weightBoxer1; //Task7
        System.out.println(weighDifference);
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println(weightDifference2);

        var workHoursForAllEmployees = 640; //Task8.1
        var workHoursForOneEmployee = 8;
        var numberEmployees = workHoursForAllEmployees / workHoursForOneEmployee;
        System.out.println("Всего сотрудников в комании " + numberEmployees + " человек");

        numberEmployees += 94; //Task8.2
        workHoursForAllEmployees = workHoursForOneEmployee * numberEmployees;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + workHoursForAllEmployees + " часов работы может быть поделено между сотрудниками.");

    }
}