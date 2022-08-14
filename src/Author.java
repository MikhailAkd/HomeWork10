import java.util.Objects;

public class Author {
    private String name;
    private String lastName;
    private String patronymic;

    public Author(String name, String patronymic, String lastName) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + patronymic + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && lastName.equals(author.lastName) && patronymic.equals(author.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, patronymic);
    }
}
