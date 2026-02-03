import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    public static class Student {
        private final String name, mail;
        private final int age, semester;

        public Student(String name, int age, int semester, String mail) {
            this.name = name;
            this.age = age;
            this.semester = semester;
            this.mail = mail;
        }

        public String getName() { return this.name; }
        public int getAge() { return this.age; }
        public int getSemester() { return this.semester; }
        public String getMail() { return this.mail; }
    }

    public static class WelcomeMessage {
        private final String message;

        public WelcomeMessage(List<Student> students) {

            String introduction = students.stream()
                    .map(s -> String.format("%s, estudiante de la escuela de %d.° semestre de %d años",
                            s.getName(), s.getSemester(), s.getAge()))
                    .collect(Collectors.joining(", y "));

            String ending = students.stream()
                    .map(Student::getMail)
                    .collect(Collectors.joining(" y "));

            this.message = String.format(
                    "¡Hola, bienvenidos! Nosotros somos la pareja conformada por %s. " +
                    "Nuestros correos institucionales son %s.",
                    introduction, ending
            );
        }

        public String getMessage() { return this.message; }
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Paula Valentina Lozano", 20, 7, "paula.lozano-c@mail.escuelaing.edu.co"),
                new Student("Ángela Gómez Valencia", 20, 6, "angela.gomez-v@mail.escuelaing.edu.co")
        );

        WelcomeMessage message = new WelcomeMessage(students);
        System.out.println(message.getMessage());
    }
}