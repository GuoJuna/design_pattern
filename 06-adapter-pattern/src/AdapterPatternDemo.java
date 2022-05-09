import com.ap.AudioPlayer;

/**
 * @author GuoJun
 * @desc 演示类
 * @since 2022/4/29 19:13
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","青花瓷.mp3");
        audioPlayer.play("mp4","告白气球.mp4");
        audioPlayer.play("vlc","莫妮卡.vlc");
        audioPlayer.play("avi", "天下.avi");
    }
}
