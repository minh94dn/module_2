package ss10_dsa_list.exerise.exerise1;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Minh");
        Student b = new Student(2, "Diễm");
        Student c = new Student(3, "Lan");
        Student d = new Student(4, "Sỹ");
        Student e = new Student(5, "Cường");
        Student f = new Student(6, "Thắng");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(3, f);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.print("id: " + student.getId() + "\t");
            System.out.print("name: " + student.getName() + "\n");
        }

        System.out.println(studentMyArrayList.size());
    }
}
