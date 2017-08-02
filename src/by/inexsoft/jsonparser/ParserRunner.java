package by.inexsoft.jsonparser;

import by.inexsoft.jsonparser.element.JsonBaseElement;
import by.inexsoft.jsonparser.element.NullElement;
import by.inexsoft.jsonparser.element.StringElement;
import by.inexsoft.jsonparser.exception.NotValidJsonException;
import by.inexsoft.jsonparser.parser.JsonReader;
import by.inexsoft.jsonparser.reader.impl.JsonFileReader;

public class ParserRunner {

	public static void main(String[] args) throws Exception{
		String pathToFolder = ".\\example\\";
		String fullJson = "json.txt";
		String stringJson = "json-string.txt";
		String nullJson = "json-null.txt";

//		String json = new JsonFileReader(pathToFolder + stringJson).getResult();
		String json = new JsonFileReader(pathToFolder + nullJson).getResult();

		
		print(json);
		
		JsonReader reader = new JsonReader(json);
		createNullJson(json);
//		createStringJson(json);
	}

	private static void createNullJson(String json) throws NotValidJsonException {
		JsonReader reader = new JsonReader(json);
		print(reader.getParsedElement());
		JsonBaseElement jsonNull = new NullElement();
		jsonNull.setValue(reader.getParsedElement());
		print(jsonNull);
	}

	private static void createStringJson(String json) throws NotValidJsonException {
		JsonReader reader = new JsonReader(json);
		print(reader.getParsedElement());
		JsonBaseElement jsonString = new StringElement();
		jsonString.setValue(reader.getParsedElement());
		print(jsonString);
	}
	
	public static void print(Object message){
		System.out.println(message);
	}
}
