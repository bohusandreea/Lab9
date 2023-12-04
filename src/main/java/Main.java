import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

        private static void main(String[] args)
        {
            Dog dog= new Dog("Rex","Labrador");
            //Creating the ObjectMapper object
            ObjectMapper mapper = new ObjectMapper();
            //Converting the Object to JSONString
            String jsonString = null;
            try {
                jsonString = mapper.writeValueAsString(dog);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            System.out.println(jsonString);


        }

}
