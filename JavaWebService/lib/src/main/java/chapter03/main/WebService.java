package chapter03.main;
import spark.Spark;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import chapter03.backend.CharacterCounter;

public class WebService {
	private static ObjectMapper mapper = new ObjectMapper();
	public static void main(String[] args) {
		Spark.get("/main", (req,res)->{
			res.type("application/json");
			try {
				String value = req.queryMap("value").value();
				value = (value==null? "" : value);
				Map<Character, Integer> map = CharacterCounter.counterCharacters(value);
				return mapper.writeValueAsString(map);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "{}";
		});
		
	}
}
