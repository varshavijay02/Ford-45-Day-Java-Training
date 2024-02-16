package interfaces;

interface AudioPlayer {
    void play();
}

interface VideoPlayer {
    void play();
}

class MP3Player implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("playing mp3");
    }
    // Implement play method for MP3
}

class MP4Player implements VideoPlayer {
    @Override
    public void play() {
        System.out.println("playing mp4");
    }
    // Implement play method for MP4
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        MP4Player mp4Player = new MP4Player();
        mp3Player.play();
        mp4Player.play();
    }
}

//Problem Statement 3: Dynamic Method Dispatch in Interface
//Develop a multimedia player application using interfaces for media types (Audio and Video) and dynamic method dispatch for playing different formats (mp3, mp4).
//
//Requirements:
//Interfaces AudioPlayer and VideoPlayer with play methods
//Concrete classes: MP3Player and MP4Player implementing interfaces
//Dynamic method dispatch for playing various formats
//
//Operations to Perform:
//Implement play methods for audio and video players
//Demonstrate dynamic method dispatch for playing different media formats
//
//Sample Code Stub:
//interface AudioPlayer {
//    void play();
//}
//
//interface VideoPlayer {
//    void play();
//}
//
//class MP3Player implements AudioPlayer {
//    // Implement play method for MP3
//}
//
//class MP4Player implements VideoPlayer {
//    // Implement play method for MP4
//}
//
//Sample Input:
//Play an mp3 file using MP3Player
//Play an mp4 file using MP4Player
//
//Sample Output:
//Playing mp3 file...
//Playing mp4 file...
