class Person
{
    String firstName;
    String lastName;
    int age;
    //Default constructor
    public Person()
    {
        firstName = "";
        lastName = "";
        age = 0;
    }
    //parameterized constructor
    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this. age = age;
    }
    // Method to get full name
    public String getfullName()
    {
        return firstName + " " + lastName;
    }
}
public class Practical1
{
   public static void main (String args [])
   {
    // Create two person objects
    Person Person1 = new Person("John", "Doe", 30);
    Person Person2 = new Person("Alice", "Smith", 25);
    // Display full nmes
    System.out.println("Person 1: " + Person1.getfullName());
    System.out.println("Person 2: " + Person2.getfullName());
    // Calculate and display average age
    double averageAge = (Person1.age + Person2.age) / 2.0;
    System.out.println("Average Age: " + averageAge);
   }
}