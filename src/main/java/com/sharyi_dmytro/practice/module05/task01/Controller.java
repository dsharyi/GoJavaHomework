package com.sharyi_dmytro.practice.module05.task01;

/**
 * Created by nonal on 01.03.2017.
 */
public class Controller {
    private static API apis[] = new API[3];
    {   apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }


}
