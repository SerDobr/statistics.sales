package ru.netology.stats.statistics.sales.servies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void minimumSalesMonthNumber() {
        StatsService service = new StatsService();
        long expectedMin = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long minMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMin, minMonth);

    }

    @Test
    public void maxiumSalesMonthNumber() {
        StatsService service = new StatsService();
        long expectedMax = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long maxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMax, maxMonth);

    }

    @Test
    public void totalForAllMonths() {
        StatsService service = new StatsService();
        long expectedSum = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sumMonth = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, sumMonth);

    }

    @Test
    public void averageAmountOfSalesMonth() {
        StatsService service = new StatsService();
        double expectedAverege = 15;
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double averageMonth = service.averageSales(sales);
        Assertions.assertEquals(expectedAverege, averageMonth);

    }

    @Test
    public void numberOfMonthsInWhichSalesWereBelowAverage() {
        StatsService service = new StatsService();
        double expectedBelowAverage = 5;
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double belowAverageMonth = service.belowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, belowAverageMonth);
    }

    @Test
    public void numberOfMonthsInWhichSalesWereAboveAverage() {
        StatsService service = new StatsService();
        double expectedBelowAverage = 5;
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double aboveAverageMonth = service.aboveAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, aboveAverageMonth);
    }
}

