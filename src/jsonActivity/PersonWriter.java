// PersonWriter.java
package jsonActivity;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class PersonWriter {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "john.doe@example.com");
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Writing to a JSON file
            mapper.writeValue(new File("person.json"), person);
            System.out.println("Person object written to person.json successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

