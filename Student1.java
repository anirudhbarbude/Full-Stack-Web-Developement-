
public class Student1 {

    public void studentDetails(int roll, String name, String address, int mark) {
        System.out.println(roll + " " + name + " " + address + " " + mark);
    }

    public int getTotalmark(int x, int y, int z) {
        int total = x + y + z;
        return total;
    }

    public static void main(String[] args) {
        Student1 stu = new Student1();
        int output = stu.getTotalmark(60, 70, 75);
        System.out.println(output);

        stu.studentDetails(101, "Anirudh", "cartoonnetwork", output);
    }
}

