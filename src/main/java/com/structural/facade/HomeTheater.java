package com.structural.facade;

public class HomeTheater {

    private DVDPlay dvdPlay;
    private Screen screen;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private TheaterLight theaterLight;

    public HomeTheater() {

        this.dvdPlay = dvdPlay.getInstance();
        this.screen = screen.getInstance();
        this.popcorn = popcorn.getInstance();
        this.stereo = stereo.getInstance();
        this.projector = projector.getInstance();
        this.theaterLight = theaterLight.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        stereo.on();
        screen.down();
        projector.on();
        theaterLight.dim();
        dvdPlay.on();
    }

    public void play() {
        dvdPlay.play();
    }

    public void pause() {
        dvdPlay.pause();
    }

    public void end() {
        popcorn.off();
        stereo.off();
        screen.up();
        projector.off();
        theaterLight.bright();
        dvdPlay.off();
    }
}
