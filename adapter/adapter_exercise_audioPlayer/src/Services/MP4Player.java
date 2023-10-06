package Services;

public class MP4Player implements Service {


	@Override
	public void play(String fileName) {
		if(fileName.endsWith(".mp4")) {

			System.out.println("Reproduzindo arquivo MP4. Nome: "+ fileName);	

		}	
		else {
			System.out.println("Midia invalida. Formato " + fileName + " nao suportado.");
		}
	}
	   
}
