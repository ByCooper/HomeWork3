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
    public static void task1 () {
        System.out.println("Задача №1" + "\n");
        int q = 10;
        byte w = 100;
        short e = 1000;
        long r = 10000L;
        float t = 10.4f;
        double y = 100.056;
        System.out.println("Значение переменной q с типом int равно " + q);
        System.out.println("Значение переменной w с типом byte равно " + w);
        System.out.println("Значение переменной e с типом short равно " + e);
        System.out.println("Значение переменной r с типом long равно " + r);
        System.out.println("Значение переменной t с типом float равно " + t);
        System.out.println("Значение переменной y с типом double равно " + y);
    }
    public static void task2 () {
        System.out.println("\n" + "Задача №2" + "\n");
       double q = 27.12;
       long w = 987678965549L;
       float e = 2.786f;
       int r = 569;
       int t = -159;
       short y = 27897;
       byte u = 67;
        System.out.println(q + "\n" + w + "\n" + e + "\n" + r + "\n" + t + "\n" + y + "\n" + u);

    }
    public static void task3 () {
        System.out.println("\n" + "Задача №3" + "\n");
        byte userLudPav = 23;
        System.out.println("У Людмилы Павловны в классе " + userLudPav + " учеников");
        byte userAnSer = 27;
        System.out.println("У Анны Сергеевны в классе " + userAnSer + " учеников");
        byte userEkaAnd = 30;
        System.out.println("У Екатерины Андреевны в классе " + userEkaAnd + " учеников");
        int totalPaper = 480;
        System.out.println(totalPaper + " листов бумаги закуплено на 3 класса");
        int everyUserPaper = totalPaper / (userAnSer + userEkaAnd + userLudPav);
        System.out.println("На каждого ученика рассчитано " + everyUserPaper + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("\n" + "Задача №4" + "\n");
        byte totalBot = 16;
        byte totalMin = 2;
        System.out.println("Производительность машины для изготовления бутылок - " + totalBot + " бутылок за " + totalMin + " минуты");
        int contrBot = totalBot / totalMin;
        System.out.println("Производительность машины для изготовления бутылок - " + contrBot + " бутылок в минуту");
        int contTimeMin = 20;
        int minInHour = 60;
        int hourInDay = 24;
        int dayInMonth = 30;
        int control20Min = contrBot * 20;
        System.out.println(control20Min + " бутылок будет произведено за " + contTimeMin + " минут");
        int controlDay = (minInHour * hourInDay) * contrBot;
        System.out.println(controlDay + " бутылок будет произведено за 1 день");
        int controlDay3 = controlDay * 3;
        System.out.println(controlDay3 + " бутылок будет произведено за 3 дня");
        int controlMonth = controlDay * dayInMonth;
        System.out.println(controlMonth + " бутылок будет произведено за 1 месяц");

    }
    public static void task5 () {
        System.out.println("\n" + "Задача №5" + "\n");
        byte totalColor = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        System.out.println("В школе, где " +(totalColor / (whiteColor + brownColor))+ " классов, нужно " +((totalColor / (whiteColor + brownColor))* whiteColor) + " банок белой краски и " +((totalColor / (whiteColor + brownColor))* brownColor) + " банок коричневой краски");

    }
    public static void task6 () {
        System.out.println("\n" + "Задача №6" + "\n");
        //Вес одного банана составляет 80 грамм
        int bananWeight = 80;
        int totalBanan = 5;
        int bananBreakfast = bananWeight * totalBanan;
        System.out.println("Общий вес бананов в завтраке = " + bananBreakfast + " грамм");
        //100 мл молока весит 105 грамм
        int weightMilk = 105;
        int totalMilk = 2;
        int milkBreakfast = weightMilk * totalMilk;
        System.out.println("Общий вес молока в завтраке = " + milkBreakfast + " грамм");
        //Вес одного брикета пломбира равен 100 грамм
        int boxIcecream = 100;
        int totalIcecream = 2;
        int icecreamBreakfast = boxIcecream * totalIcecream;
        System.out.println("Общий вес пломбира в завтраке = " + icecreamBreakfast + " грамм");
        //Все одного яйца составляет 70 грамм
        int weightEgg = 70;
        int totalEgg = 4;
        int eggBreakfast = weightEgg * totalEgg;
        System.out.println("Общий вес яиц в завтраке = " + eggBreakfast + " грамм");
        int weightTotalBreakfastInGramm = bananBreakfast + milkBreakfast + icecreamBreakfast + eggBreakfast;
        System.out.println("Общий вес спортзавтрака составляет " + weightTotalBreakfastInGramm + " грамм");
        double weightTotalBreakfastInKilo = weightTotalBreakfastInGramm / 1000.0;
        System.out.println("Общий вес спортзавтрака составляет " + weightTotalBreakfastInKilo + " килограмма");

    }
    public static void task7 () {
        System.out.println("\n" + "Задача №7" + "\n");

        //Необходимо сбросить 7 кг спортсмену
        int loseWeightNeed = 7;

        //В килограмме 1000 грамм
        int grammInKilo = 1000;
        int totalLoseWeight = loseWeightNeed * grammInKilo;

        //1 вариант рациона для сброса веса позволяет терять 250 грамм в день
        int loseDayWeight1 = 250;

        //2 вариант рациона для сброса веса позволяет терять 500 грамм в день
        int loseDayWeight2 = 500;

        //Необходимо рассчитать количество затраченых дней на достижение рузельтата для двух рационов
        //Рацион 1
        int totalDayDiet1 = totalLoseWeight / loseDayWeight1;
        System.out.println("Придерживаясь рациона №1, спортсмен добьется потери " + loseWeightNeed + " килограммов за " + totalDayDiet1 + " дней");

        //Рацион 2
        int totalDayDiet2 = totalLoseWeight / loseDayWeight2;
        System.out.println("Придерживаясь рациона №2, спортсмен добьется потери " + loseWeightNeed + " килограммов за " + totalDayDiet2 + " дней");

    }
    public static void task8 () {
        System.out.println("\n" + "Задача №8" + "\n");
        //Годовое повышение зарплаты составляет 10 %
        double percentYearHigh = 10;
        int totalMonthInYear = 12;

        //Задаем ежемесячные зарплаты для установленных сотрудников
        //Зарплата Маши
        int salaryMasha = 67760;

        //Зарплата Дениса
        int salaryDenis = 83690;

        //Зарплата Кристины
        int salaryKris = 76230;

        //Вычисляем зарплату после повышения на 10 %
        double newSalaryMasha = ((percentYearHigh / 100) * salaryMasha) + salaryMasha;
        double newSalaryDenis = ((percentYearHigh / 100) * salaryDenis) + salaryDenis;
        double newSalaryKris = ((percentYearHigh / 100) * salaryKris) + salaryKris;
        System.out.println("Зарплаты после повышения составляют: " + "\n" + "Маша = " + newSalaryMasha + "\n" + "Денис = " + newSalaryDenis + "\n" + "Кристина = " + newSalaryKris);

        //Устанавливаем годовые зарплаты до повышения и после
        //Годовые зарплаты Маши
        double totalYearSalaryMasha = salaryMasha * totalMonthInYear;
        double newTotalYearSalaryMasha = newSalaryMasha * totalMonthInYear;
        double highSalaryMasha = newTotalYearSalaryMasha % totalYearSalaryMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + highSalaryMasha + " рублей");

        //Годовые зарплаты Дениса
        double totalYearSalaryDenis = salaryDenis * totalMonthInYear;
        double newTotalYearSalaryDenis = newSalaryDenis * totalMonthInYear;
        double highSalaryDenis = newTotalYearSalaryDenis % totalYearSalaryDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + highSalaryDenis + " рублей");


        //Годовые зарплаты Кристины
        double totalYearSalaryKris = salaryKris * totalMonthInYear;
        double newTotalYearSalaryKris = newSalaryKris * totalMonthInYear;
        double highSalaryKris = newTotalYearSalaryKris % totalYearSalaryKris;
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + highSalaryKris + " рублей");

    }
}