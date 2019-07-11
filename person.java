import java.util.UUID;

public class Person extends Object {
// Person object for all types of peoples

    private long originallyCreated;
    
private UUID id;
private String firstName;
private String lastName;

Person(){
    this.id = UUID.randomUUID();
}
Person(String first_name, String last_name){
    this();
    this.firstName = first_name;
    this.lastName = last_name;
}
}
