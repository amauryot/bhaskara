package model;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {

	private final String AUDIO_FILE = "errorSound.wav";
	
	private URL file;
	private AudioInputStream audioStream;
	private Clip clip;
	
	public Audio() {
		try {
			file = ClassLoader.getSystemResource(AUDIO_FILE);
			
			audioStream = AudioSystem.getAudioInputStream(file);
			
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			
		} catch (UnsupportedAudioFileException exception) {
			exception.printStackTrace();
			
		} catch (IOException exception) {
			exception.printStackTrace();
			
		} catch (LineUnavailableException exception) {
			exception.printStackTrace();
		}
	}
	
	public void play() {
		clip.setMicrosecondPosition(0);
		clip.start();
	}
}
