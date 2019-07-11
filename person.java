import java.util.UUID;

public class Person extends Object {
// Person object for all types of peoples

private UUID id;
private String firstName;
private String lastName;

Person(){
    this.id = UUID.randomUUID();
}
}
