public class Student {

    public static void main(String args[]) {
        Studentt student = new Studentt();
        student.setName("Shakira");
        System.out.println(student.name);
        student.setId(94);
        System.out.println(student.id);
        student.setAverage(4f, 2.5f, 3.5f);
        System.out.println(student.average);

        Color c1 = new Color();
        c1.setColor("pink");
        System.out.println(c1.getColor());

    }

}

class Studentt {
    String name;
    int id;
    float average;

    void setName(String newName)

    {
        name = newName;
    }

    void setId(int newId) {
        id = newId;
    }

    void setAverage(Float java, Float cpp, Float c_sharp) {
        average = (java + cpp + c_sharp) / 3;
    }
}

class Color {
    private String colorName;

    void setColor(String colorName) {
        this.colorName = colorName;
    }

    String getColor() {
        return this.colorName;
    }

}
