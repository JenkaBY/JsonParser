package by.inexsoft.jsonparser;

import by.inexsoft.jsonparser.reader.impl.JsonFileReader;

public class ParserRunner {

	public static void main(String[] args) throws Exception{
		String pathToFile = "d:\\json.txt";
		String json = new JsonFileReader(pathToFile).getResult();
		print(json);
	}

	public static void print(String message){
		System.out.println(message);
	}
}
