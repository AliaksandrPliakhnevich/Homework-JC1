package JC1.Homework.Homework1_Correction;

/**
 * Задание № 1
 *
 * 1) Написать алгоритмы конвертации физических величин.
 * Код должен быть написан в соответствующих функциях
 * вместо комментария со вловом TODO
 *
 * 2) Написать 2-3 собственные функции по конвертированию величин.
 * Результат вывести в консоль с помощью команды System.out.println().
 * См. Пример ее использования в методе main
 *
 * PS Предусмотреть деление на 0, в этом случае нужно возвращать число -999.
 *
 * Метод проверки: когда запустите метод main и посмотреть результаты в консоли.
 */

public class Task1 {

    public static double meterToInch(double meter) {
        if (meter == 0.0){
            return -999;
        } else {
        return meter / 0.0254;
        }
        // мы входной параметр умножаем или делим на величину, все равно не понимаю,
        // зачем тут делить на 0.
        // напиши мне второй способ решения
        
        // не понимаю, как может появиться деление на 0 в этих методах
        // деление на 0 исключил бы проверкой if (meter == 0) return -999;
        /** NOTE! Ну задание можно сделать двумя способами
         * поэтому и написал про деление
         **/
    }

    public static double inchToMeter(double inch) {
        return inch * 0.0254;
    }

    public static double kilogramToGram(double kilogram) {
        return kilogram * 1000;
    }

    public static double gramToKilogram(double gram) {
        return gram * 0.001;
    }

    public static double literToCubicMeter(double liter) {
        return liter * 0.001;
    }

    public static double cubicMeterToLiter(double /*liter*/cubicMeter) {
        return cubicMeter * 1000;
    }
    
    // далее три моих примера конвертации физических величин
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double kilogramToPound(double kilogram) {
        return kilogram * 2.205;
    }
    
    public static double kPaToBar(double kPa) {
        return kPa * 0.01;
    }

    public static void main(String[] args) {
        double inch = meterToInch(5);
        System.out.println("meterToInch - 5: " + inch);

        inch = meterToInch(0);
        System.out.println("meterToInch - 0: " + inch);

        double meter = inchToMeter(10);
        System.out.println("inchToMeter - 10: " + meter);

        meter = inchToMeter(0);
        System.out.println("inchToMeter - 0: " + meter);

        double gram = kilogramToGram(13);
        System.out.println("kilogramToGram - 13: " + gram);

        gram = kilogramToGram(0);
        System.out.println("kilogramToGram - 0: " + gram);

        double kilogram = gramToKilogram(991);
        System.out.println("gramToKilogram - 991: " + kilogram);

        kilogram = gramToKilogram(0);
        System.out.println("gramToKilogram - 0: " + kilogram);

        double cubicMeter = literToCubicMeter(88);
        System.out.println("literToCubicMeter - 88: " + cubicMeter);

        cubicMeter = literToCubicMeter(0);
        System.out.println("literToCubicMeter - 0: " + cubicMeter);

        double liter = cubicMeterToLiter(69);
        System.out.println("cubicMeterToLiter - 69: " + liter);

        liter = cubicMeterToLiter(0);
        System.out.println("cubicMeterToLiter - 0: " + liter);
        
        double kelvin = celsiusToKelvin(20);
        System.out.println("celsiusToKelvin - 20: " + kelvin);
        
        double pound = kilogramToPound(5);
        System.out.println("kilogramToPound - 5: " + pound);
        
        double bar = kPaToBar(200);
        System.out.println("kPaToBar - 200: " + bar);
    }
}
