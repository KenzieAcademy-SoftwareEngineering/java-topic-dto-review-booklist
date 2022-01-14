import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        try {
            //TODO: HTTP GET
            //Skip this

            //TODO: Instead - use input file for testing
            File jsonListFile = new File("bookList_dune.json");

            //TODO: Create DTO
            BookListDTO bookList;

            //TODO: Parse the JSON data
            ObjectMapper mapper = new ObjectMapper();

            //readValue   1. JSON string   2.DTO class
            bookList = mapper.readValue(jsonListFile,BookListDTO.class);

            //Get specific index
            System.out.println(bookList.getDocs().get(0).getTitle());

            /*
            for ( Docs singleBook : bookList.getDocs()) {
                System.out.println(singleBook.getTitle());
                System.out.println(singleBook.getIsbn());
            }
            */
        }
        catch (Exception e) {
            System.out.println("Unexpected Error");
            System.out.println(e.getMessage());
        }
    }
}
