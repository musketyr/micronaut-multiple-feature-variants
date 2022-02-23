package m2c;

import com.agorapulse.sandbox.mnx.LibraryService;

public class MicronautTwoConsumerService {

    private final LibraryService libraryService;

    public MicronautTwoConsumerService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

}
