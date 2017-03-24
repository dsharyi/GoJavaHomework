package com.sharyi_dmytro.practice.module06.task04;

/**
 * Created by nonal on 24.03.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {
        CitizenFactory.createCitizen(CitizenFactory.CitizenType.ENG);
        CitizenFactory.createCitizen(CitizenFactory.CitizenType.CHN);
        CitizenFactory.createCitizen(CitizenFactory.CitizenType.RUS);
        CitizenFactory.createCitizen(CitizenFactory.CitizenType.ITA);


    }
}
