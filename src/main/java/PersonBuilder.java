public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname (String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws BadValueException {
        if (age >= 0){
            this.age = age;
            return this;
        } else {
            throw new BadValueException("Введено некорректное значение возраста");
        }

    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws LackOfDataException {
        Person person = new Person(this);
        if(person.getSurname() == null || person.getName() == null) {
            throw new LackOfDataException("Не введены обязательные данные");
        } else {
            return person;
        }

    }

}
