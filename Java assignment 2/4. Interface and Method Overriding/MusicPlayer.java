interface Mplayer{
    void play();
    void stop();
}
class Mp3Player implements Mplayer{
    public void play(){
        System.out.println("Playing Music from Mp3Player");
    }
    public void stop(){
        System.out.println("Stopping Music from Mp3Player");
    }
}
class CdPlayer implements Mplayer{
    public void play(){
        System.out.println("Playing Music from CdPlayer");
    }
    public void stop(){
        System.out.println("Stopping Music from CdPlayer");
    }
}
class MusicPlayer {
    public static void main(String[] args) {
        Mp3Player MP3 = new Mp3Player();
        CdPlayer CD = new CdPlayer();
        MP3.play();
        MP3.stop();
        CD.play();
        CD.stop();
    }
}
