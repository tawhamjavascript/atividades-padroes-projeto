package Services;


public class MP3Player implements Service{

	
	public void play(String fileName) {
		if(fileName.endsWith(".mp3")) {
			System.out.println("Reproduzindo arquivo MP3. Nome: "+ fileName);	
			
		}	
		else {
			System.out.println("Midia invalida. Formato " + fileName + " nao suportado.");
		}
	}
}
