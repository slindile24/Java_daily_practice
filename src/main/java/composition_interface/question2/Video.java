package composition_interface.question1.question3;

public class Video implements Playable{
    @Override
    public void play() {
        System.out.println("Playing video.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video");

    }
}
