package hw12;

public class Task2 {
    public static void main(String[] args) throws Exception {
        f();
    }

    static void f() throws Exception {
        try {
            g();
        } catch (Exception g) {
            g.getCause();
            throw new Exception("2");
        }
    }

    static void g() throws Exception {
        throw new Exception("1");
    }
}

