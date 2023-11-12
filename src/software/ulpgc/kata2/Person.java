package software.ulpgc.kata2;

public record Person(
        int index,
        String id,
        String name,
        String surname,
        String sex,
        String email,
        String phone,
        String birthday,
        String title
) {
    @Override
    public String toString() {
        return "Person{" +
                "index=" + index +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
