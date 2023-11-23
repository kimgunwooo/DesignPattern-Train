package dp.hf.facadePattern;

import dp.hf.MyHWInfo;
import dp.hf.facadePattern.facade.HomeTheaterFacade;
import dp.hf.facadePattern.subSystem.Amplifier;
import dp.hf.facadePattern.subSystem.CdPlayer;
import dp.hf.facadePattern.subSystem.DvdPlayer;
import dp.hf.facadePattern.subSystem.PopcornPopper;
import dp.hf.facadePattern.subSystem.Projector;
import dp.hf.facadePattern.subSystem.Screen;
import dp.hf.facadePattern.subSystem.TheaterLights;
import dp.hf.facadePattern.subSystem.Tuner;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner,
                dvd, cd, projector, lights, screen,  popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println();
        homeTheater.endMovie();
    }
}
