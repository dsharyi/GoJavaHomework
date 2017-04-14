package com.sharyi_dmytro.practice.module07.task04;


import static com.sharyi_dmytro.practice.module07.task04.SpeedTestIntegerArrList.testSpeedIntegerArrList1000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestIntegerArrList.testSpeedIntegerArrList10000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestIntegerLinkList.testSpeedIntegerLinkList1000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestIntegerLinkList.testSpeedIntegerLinkList10000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestStringArrList.testSpeedStringArrList1000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestStringArrList.testSpeedStringArrList10000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestStringLinkList.testSpeedStringLinkList1000;
import static com.sharyi_dmytro.practice.module07.task04.SpeedTestStringLinkList.testSpeedStringLinkList10000;

public class Main {

    public static void main(String[] args) {


        testSpeedIntegerArrList1000();
        testSpeedIntegerArrList10000();
        testSpeedIntegerLinkList1000();
        testSpeedIntegerLinkList10000();
        testSpeedStringArrList1000();
        testSpeedStringArrList10000();
        testSpeedStringLinkList1000();
        testSpeedStringLinkList10000();


    }


}
