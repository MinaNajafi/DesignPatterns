package com.example.designpatterns;

import com.example.designpatterns.structural.homeTheater.models.Amplifier;
import com.example.designpatterns.structural.homeTheater.models.CdPlayer;
import com.example.designpatterns.structural.homeTheater.models.DvdPlayer;
import com.example.designpatterns.structural.homeTheater.HomeTheaterFacade;
import com.example.designpatterns.structural.homeTheater.models.PopcornPopper;
import com.example.designpatterns.structural.homeTheater.models.Projector;
import com.example.designpatterns.structural.homeTheater.models.Screen;
import com.example.designpatterns.structural.homeTheater.models.TheaterLights;
import com.example.designpatterns.structural.homeTheater.models.Tuner;

public class DesignPatternTestDrive {

    public static void main(String[] args) {
        runFacadeHomeTheaterSample();
    }


    public static void runFacadeHomeTheaterSample() {
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(),
                        new Projector(), new Screen(), new TheaterLights(), new PopcornPopper());
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}