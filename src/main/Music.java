package main;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jeremy on 6/15/14.
 */
public class Music {

    AudioPlayer MGP = AudioPlayer.player;
    AudioStream BGM;
    AudioData MD;
    ContinuousAudioDataStream loop = null;

    public Music()
    {



        try
        {
            InputStream test = new FileInputStream("resources/chiptuneLoop.wav");
            BGM = new AudioStream(test);
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException error)
        {
            error.printStackTrace();
        }
       // MGP.start(loop);
    }

    public void startMusic(){
        MGP.start(loop);
    }
}
