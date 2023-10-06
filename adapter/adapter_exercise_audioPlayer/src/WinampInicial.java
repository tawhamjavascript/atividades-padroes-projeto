

import Services.MP3Player;
import Services.Service;
import adapter.Adapter;
import adapter.AdapterPattern;

public class WinampInicial {
   public static void main(String[] args) {
		Service service = new MP3Player();
	    Adapter adapter = new AdapterPattern(service);

	    adapter.play("Eagles - Hotel California.mp3");
	    adapter.play("alone.mp4");
	    adapter.play("far far away.vlc");
	    adapter.play("mind me.avi");
	}
}
