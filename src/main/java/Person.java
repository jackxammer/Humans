public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public boolean hasAge() {
        if (getAge() != 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (getAddress() != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (!hasAddress()) {
            this.address = address;
        }
    }

    public void happyBirthday() {
        if (!hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(getSurname()).setAddress(getAddress());
        return childBuilder;

    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + "; Возраст: " + this.age + "; Адрес: " + this.address;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
