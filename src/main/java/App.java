import io.swagger.client.api.PetApi;
import io.swagger.client.model.Pet;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        PetApi petApi = new PetApi();
        System.out.println(petApi.getPetById((long)2)); // Display the string.
        List<String> tag = new ArrayList<>();
        tag.add("available");
        System.out.println(new PetApi().findPetsByStatus(tag));
        Pet pet = petApi.getPetById((long)2);
        System.out.println(pet.toString());
    }
}
