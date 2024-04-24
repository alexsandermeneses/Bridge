package org.example.platforms;

public class Twitch implements IPlatform{
    public Twitch() {
        configureRMTP();
        System.out.println("Twitch: Transmissão Iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch: configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("Twitch: Validando o canal");
    }
}
