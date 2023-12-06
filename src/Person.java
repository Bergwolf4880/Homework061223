/*Owner - сам по себе класс (firstName, lastName, birthday) Для отражения дат используем класс MyDate созданный ранее.*/
public class Person {
    private String firstName;
    private String lastName;
    MyDate birthday;


    public Person(String firstName, String lastName, MyDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = date;
    }


    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public MyDate getBirthday() {
        return this.birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + this.lastName + ", birthday on " + this.birthday.toString() + "\n";
    }

}
