package ru.netology.stats.statistics.sales.servies;

public class StatsService {
    public int minSales(long[] sales) { // номер месяца где был мин продаж
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { // номер месяца где был макс продаж
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {  // сумма продаж
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth += sales[i];
        }
        return sumMonth;
    }

    public double averageSales(double[] sales) {  // средняя сумма продаж
        double averageMonth = 0;
        double sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        averageMonth = sum / sales.length;

        return averageMonth;
    }

    public double belowAverage(double[] sales) { // количество месяцев ниже среднего
        double belowAverageMonth = 0;
        double averageMonth = averageSales(sales);
        for (double sale : sales) {
            if (sale < averageMonth) {
                belowAverageMonth += 1;
            }
        }
        return belowAverageMonth;


    }

    public double aboveAverage(double[] sales) { // количество месяцев выше среднего
        double aboveAverageMonth = 0;
        double averageMonth = averageSales(sales);
        for (double sale : sales) {
            if (sale > averageMonth) {
                aboveAverageMonth += 1;
            }
        }
        return aboveAverageMonth;
    }
}