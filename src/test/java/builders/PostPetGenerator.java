package builders;

import pojo.PetStorePostPet.Category;
import pojo.PetStorePostPet.Pet;
import pojo.PetStorePostPet.Tag;

import java.util.List;

public class PostPetGenerator {

    public static Pet createDefaultPet() {
        return Pet
                .builder()
                .id(2)
                .category(new Category(4, "doggies"))
                .name("Pipchik")
                .photoUrls(List.of("nahuy"))
                .tags(List.of(new Tag(2, "kittens")))
                .status("disabled")
                .build();
    }
    }
