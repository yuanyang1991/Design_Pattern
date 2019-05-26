package com.yuanyang;

/**
 * 家庭影院外观
 */
public class HomeTheaterFacade {

    private CDPlayer cdPlayer;

    private PopcornPopper popcornPopper;

    private Screen screen;


    public HomeTheaterFacade(CDPlayer cdPlayer, PopcornPopper popcornPopper, Screen screen) {
        this.cdPlayer = cdPlayer;
        this.popcornPopper = popcornPopper;
        this.screen = screen;
    }

    public void on(){
        cdPlayer.on();
        popcornPopper.on();
        screen.down();
    }

    public void off(){
        cdPlayer.off();
        popcornPopper.off();
        screen.up();
    }
}
