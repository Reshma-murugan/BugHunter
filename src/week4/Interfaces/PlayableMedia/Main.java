package week4.Interfaces.PlayableMedia;

interface Playable {
    void play();
    void pause();
}
class AudioPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Audio is playing");
    }

    @Override
    public void pause() {
        System.out.println("Audio is paused");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable[] media = { new AudioPlayer(), new VideoPlayer() };

        for (Playable m : media) {
            m.play();
            m.pause();
            System.out.println("----------------");
        }
    }
}

