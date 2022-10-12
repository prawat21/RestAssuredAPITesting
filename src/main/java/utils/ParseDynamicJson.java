package utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseDynamicJson {
	
	private static ObjectMapper mapper = getdefaultObjectMapper();
	
	private static ObjectMapper getdefaultObjectMapper() {
		ObjectMapper defaultMapper = new ObjectMapper();
		//---
		return defaultMapper;
	}
	
	public static JsonNode parse(String inputjson) throws JsonMappingException, JsonProcessingException {
		return mapper.readTree(inputjson);
	}
	
	//1. How to parse dynamic json?
	//2. How to parse nested json?
	
	public static void main(String args[]) {
		
		String inputjson = "{\r\n"
				+ "  \"person1\": [\r\n"
				+ "    {\r\n"
				+ "      \"first\": \"Nicole\",\r\n"
				+ "      \"last\": \"Adelstein\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"person2\": [\r\n"
				+ "    {\r\n"
				+ "      \"first\": \"Pleuni\",\r\n"
				+ "      \"last\": \"Pennings\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"person3\": [\r\n"
				+ "    {\r\n"
				+ "      \"first\": \"Rori\",\r\n"
				+ "      \"last\": \"Rohlfs\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		JsonNode node = Json.parse(inputjson);
		
		//String writeValueAsString = mapper.writeValueAsString(inputjson);
		//getKey(inputjson, "first");
	}

}
