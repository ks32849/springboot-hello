package de.stephankennedy.springboothello;

@RestController
public class MainController {
    
    @GetMapping("/")
    public Response<?> home() {
        return Response.body("hello");
    }
}
