public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();
    }

    public static void task_1(){
        /*
        Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более,
        должно соответствовать правилу camelCase.

        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …»
         */

        System.out.println("Задание 1");

        byte variableByte = 127;
        System.out.println("Значение переменной variableByte с типом byte = " + variableByte);

        short variableShort = 32767;
        System.out.println("Значение переменной variableShort с типом short = " + variableShort);

        int variableInt = 2147483647;
        System.out.println("Значение переменной variableInt с типом int = " + variableInt);

        long variableLong = 922L;
        System.out.println("Значение переменной variableLong с типом long = " + variableLong);

        float variableFloat = 19.1267876754f;
        System.out.println("Значение переменной variableFloat с типом float = " + variableFloat);

        double variableDouble = 3.1478256499;
        System.out.println("Значение переменной variableDouble с типом double = " + variableDouble);
    }

    public static void task_2(){
        /*
        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        Значения:

        * 27.12
        * 987 678 965 549
        * 2,786
        * 569
        * -159
        * 27897
        * 67
        */

        System.out.println("\nЗадание 2");

        float floatVariable = 27.12f;
        System.out.println("Значение переменной floatVariable с типом float = " + floatVariable);

        long longVariable = 987678965549L;
        System.out.println("Значение переменной longVariable с типом long = " + longVariable);

        double doubleVariable = 2.786;
        System.out.println("Значение переменной doubleVariable с типом double = " + doubleVariable);

        short shortVariableOne = 569;
        System.out.println("Значение переменной shortVariableOne с типом short = " + shortVariableOne);

        short shortVariableTwo = -159;
        System.out.println("Значение переменной shortVariableTwo с типом short = " + shortVariableTwo);

        int intVariable = 27897;
        System.out.println("Значение переменной intVariable с типом int = " + intVariable);

        byte byteVariable = 67;
        System.out.println("Значение переменной byteVariable с типом byte = " + byteVariable);

    }

    public static void task_3(){
        /*
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте,
        сколько достанется листов каждому ученику.

        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.
        */

        System.out.println("\nЗадание 3");

        byte classTeacherOne = 23;
        byte classTeacherTwo = 27;
        byte classTeacherThree = 30;
        short totalPagePaper = 480;

        int pageByStudent = totalPagePaper / (classTeacherOne + classTeacherTwo + classTeacherThree);

        System.out.println("На каждого ученика рассчитано " + pageByStudent + " листов бумаги");
    }

    public static void task_4(){
        /*
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность
        машины будет:

        * за 20 минут,
        * в сутки,
        * за 3 дня,
        * за 1 месяц?
        Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный
        промежуток времени.
        Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.
         */

        System.out.println("\nЗадание 4");

        byte bottleMakingMachinePerformance = 16;
        byte timeBottleMaking = 2;
        byte durationWorkMinutes = 20;
        byte durationWorkDay = 1;
        byte durationWorkDays = 3;
        byte durationWorkMonth = 1;

        byte countMinutesInHour = 60;
        byte countDayInMonth = 30;
        byte countWorkHours = 24;

        int countBottleInMinutes = bottleMakingMachinePerformance / timeBottleMaking;
        int countMinutesInDay = countWorkHours * countMinutesInHour;

        // подсчет количества производимых бутылок за 20 минут
        int durationWorkOne = countBottleInMinutes * durationWorkMinutes;
        System.out.println("За " + durationWorkMinutes + " минут машина произвела " + durationWorkOne
                + " штук бутылок");

        // подсчет количества производимых бутылок за сутки
        int durationWorkTwo = countBottleInMinutes * durationWorkDay * countMinutesInDay;
        System.out.println("За " + durationWorkDay + " сутки машина произвела " + durationWorkTwo
                + " штук бутылок");

        // подсчет количества производимых бутылок за 3 дня
        int durationWorkTree = countBottleInMinutes * durationWorkDays * countMinutesInDay;
        System.out.println("За " + durationWorkDays + " дня машина произвела " + durationWorkTree
                + " штук бутылок");

        // подсчет количества производимых бутылок за месяц
        int durationWorkFour = countBottleInMinutes * durationWorkMonth * countDayInMonth * countMinutesInDay;
        System.out.println("За " + durationWorkMonth + " месяц машина произвела " + durationWorkFour
                + " штук бутылок");
    }
    public static void task_5(){
        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой
        и 4 банки коричневой краски. Сколько банок каждой краски было куплено?

        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски
        и … банок коричневой краски».
        Для объявления переменных не используйте тип var.
         */

        System.out.println("\nЗадание 5");

        byte totalCansPaint = 120;
        byte countWhitePaintOnClass = 2;
        byte countBrownPaintOnClass = 4;

        // общее количество краски на класс
        int countPaintOnClass = countWhitePaintOnClass + countBrownPaintOnClass;

        int countClassInSchool = totalCansPaint / countPaintOnClass;
        int totalCansWhitePaint = countClassInSchool * countWhitePaintOnClass;
        int totalCansBrownPaint = countClassInSchool * countBrownPaintOnClass;

        System.out.println("В школе, где " +  countClassInSchool + " классов, нужно " + totalCansWhitePaint +
                " банок белой краски и " + totalCansBrownPaint + " банок коричневой краски");
    }

    public static void task_6(){
        /*
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        Вот один из рецептов, по которому спортсмен готовит себе завтрак:

        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.

        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.

        Результат в граммах и килограммах напечатайте в консоль.

        Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
        то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано,
        что нужно добавить 5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм),
        а не считать самим общую сумму граммов.
         */

        System.out.println("\nЗадание 6");

        byte bananaWeightInGrams = 80;      // 1 банан — 80 грамм
        byte milkWeightInGrams = 105;       // 100 мл = 105 грамм
        byte iceCreamWeightInGrams = 100;   // 1 брикета - 100 грамм
        byte eggWeightInGrams = 70;         // 1 яйцо — 70 грамм

        byte countBanana = 5;
        short countMilk = 200;
        byte countIceCream = 2;
        byte countEgg = 4;

        int totalBananaInGrams = countBanana * bananaWeightInGrams;
        int totalMilkInGrams = (countMilk / 100) * milkWeightInGrams;
        int totalIceCreamInGrams = countIceCream * iceCreamWeightInGrams;
        int totalEggInGrams = countEgg * eggWeightInGrams;

        int totalWeightInGrams = totalBananaInGrams + totalMilkInGrams + totalIceCreamInGrams + totalEggInGrams;
        double totalWeightInKg = totalWeightInGrams / 1000.0;

        System.out.println("Вес спортзавтрака в граммах = " + totalWeightInGrams + " грамм");
        System.out.println("Вес спортзавтрака в килограммах = " + totalWeightInKg + " кг");
    }

    public static void task_7(){
        /*
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории,
        нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять
        в весе от 250 до 500 грамм в день.

        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.

        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.

        Результаты всех подсчетов выведите в консоль.
         */
        System.out.println("\nЗадание 7");

        byte weightToDrop = 7;
        short weightKgInGrams = 1000;

        short dropWeightInGramsOne = 250;
        short dropWeightInGramsTwo = 500;

        int weightToDropInGrams = weightToDrop * weightKgInGrams;
        int countDaysOne = weightToDropInGrams / dropWeightInGramsOne;
        int countDaysTwo = weightToDropInGrams / dropWeightInGramsTwo;
        int avgCountDays = (countDaysOne + countDaysTwo) / 2;

        System.out.println("Если спортсмен будет терять каждый день по " + dropWeightInGramsOne +
                " грамм, на похудение уйдет " + countDaysOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + dropWeightInGramsTwo +
                " грамм, на похудение уйдет " + countDaysTwo + " дней");
        System.out.println("На похудение  в среднем уйдет " + avgCountDays + " дней");

    }

    public static void task_8(){
        /*
        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        Каждый год повышение составляет 10% от текущей зарплаты.

        К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
        а также провести расчет для следующих сотрудников:

        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом
        с нынешней зарплатой и после повышения.

        Посчитайте, сколько будет получать каждый из сотрудников,
        а также разницу между годовым доходом до и после повышения.

        Выведите в консоль информацию по каждому сотруднику.
        Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
         */

        System.out.println("\nЗадание 8");

        double percentageSalaryIncrease = 1.1;

        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        double newSalaryMaria = salaryMaria * percentageSalaryIncrease;
        double newSalaryDenis = salaryDenis * percentageSalaryIncrease;
        double newSalaryKristina = salaryKristina * percentageSalaryIncrease;

        int oldSalaryMariaYear = salaryMaria * 12;
        int oldSalaryDenisYear = salaryDenis * 12;
        int oldSalaryKristinaYear = salaryKristina * 12;

        double newSalaryMariaYear = newSalaryMaria * 12;
        double newSalaryDenisYear = newSalaryDenis * 12;
        double newSalaryKristinaYear = newSalaryKristina * 12;

        double differentSalaryMaria = newSalaryMariaYear - oldSalaryMariaYear;
        double differentSalaryDenis = newSalaryDenisYear - oldSalaryDenisYear;
        double differentSalaryKristina = newSalaryKristinaYear - oldSalaryKristinaYear;

        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. " +
                "Годовой доход вырос на " + differentSalaryMaria + " рублей");
        System.out.println("Маша теперь получает " + newSalaryDenis + " рублей. " +
                "Годовой доход вырос на " + differentSalaryDenis + " рублей");
        System.out.println("Маша теперь получает " + newSalaryKristina + " рублей. " +
                "Годовой доход вырос на " + differentSalaryKristina + " рублей");
    }
}