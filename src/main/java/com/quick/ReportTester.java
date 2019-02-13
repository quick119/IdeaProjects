package com.quick;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finace = new FinanceReport();
        Report health = new HealthReport();
        List<Report> reports = new ArrayList<>(); //父類別的參照資料型態可以放入子類別的物件
        reports.add(finace);
        reports.add(health);
        for (Report report : reports) {
            report.load();
            report.print();
        }
    }
}
