package Services;

public class MKVPlayer implements Service {

	
	public void play(String fileName) {
		if(fileName.endsWith(".mkv")) {
			System.out.println("Reproduzindo arquivo MKV. Nome: "+ fileName);	

		}	
		else {
			System.out.println("Midia invalida. Formato " + fileName + " nao suportado.");
		}
		
	}
}
