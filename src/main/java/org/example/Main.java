package org.example;

import org.example.platforms.*;
import org.example.transmissions.AdvancedLive;
import org.example.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new Twitch());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform){
        /*System.out.println("aguarde...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("Transmissão avançada... aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}