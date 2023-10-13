public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

        public static void task1() {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog +4 );
        System.out.println(cat + 4);
        System.out.println(paper +4 );
    }
    public static void task3() {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
    }
    public static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println("friend"+friend);
        friend=friend/7;
        System.out.println("friend"+friend);
    }
    public static void task5() {
        var frog = 3.5;
        System.out.println("frog");
        frog=frog*10;
        System.out.println("frog"+frog);
        frog=frog/3.5;
        System.out.println("frog"+frog);
        frog=frog+4;
        System.out.println("frog"+frog);
    }
    public static void task6() {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var capacityLeft = firstBoxer + secondBoxer;
        System.out.println("Общуя масса двух бойцов" + capacityLeft + "кг бойцов");
    }
        public static void task7() {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var capacityLeft = firstBoxer - secondBoxer;
        System.out.println("Разница между массами бойцов" + capacityLeft + "кг бойцов");

        var Weight = capacityLeft - firstBoxer - secondBoxer;
            System.out.println("Масса тела"+ Weight+ "кг!");
            Weight = Weight/2;
            System.out.println("Теперь масса тела" + Weight);
            Weight = capacityLeft - firstBoxer - secondBoxer;
            System.out.println("Теперь масса тела" +Weight+ "кг!");
            var load = (firstBoxer - secondBoxer) % capacityLeft;
            System.out.println(" разница масс спортсменов" + load + "кг!");

    }
    public static void task8() {


    }
}