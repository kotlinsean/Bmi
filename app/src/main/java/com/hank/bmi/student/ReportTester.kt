package com.hank.bmi.student
fun main() {
    val reports = listOf<Report>(
        FinanceReport(),
        HealthReport()
    )
    //類別去認一個介面叫做實作implement
    //類別去認父類別叫做繼承
    for (report in reports) {
        report.load()
        report.print("Test")
    }



}