package Utility;

public class RadioStation {
    public static void announce(String date, String info){
        class Announcer{
            public void saySpeech(){ System.out.println("Радиосводка от " + date + ": " + info); }
        }
        Announcer announcer = new Announcer();
        announcer.saySpeech();
    }
}
