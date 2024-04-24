package org.example.transmissions;

import org.example.platforms.IPlatform;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Live implements ITransmission{
    protected IPlatform platform;

    public Live(){

    }

    public Live(IPlatform platform){
        this.platform = platform;
    }
    @Override
    public void broadcasting() {
        System.out.println("Iniciando trasmissão");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
