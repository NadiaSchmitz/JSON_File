import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSON_prozessing {

	public static void main(String[] args) {
		
		JSONObject bild = new JSONObject();
		
		bild.put("Breite", 800);
		bild.put("Hoehe", 600);
		bild.put("Titel", "Berglandschaft");
		
		JSONObject autor = new JSONObject();
		
		autor.put("Name", "Mustermann");
		autor.put("Vormane", "Max");
		
		bild.put("Autor", autor);
		
		JSONArray preisliste = new JSONArray();
		preisliste.put(12.73);
		preisliste.put(15.22);
		preisliste.put(10.66);
		
		bild.put("Preisliste", preisliste);
		
		try {
			FileWriter file = new FileWriter ("bild.json");
			file.write(bild.toString());
			file.close();
		}
		
		catch(Exception e) {
			System.out.println("Fehler!");
		}
		
	}

}
