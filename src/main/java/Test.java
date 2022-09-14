import java.io.*;

class  Test {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Save s1 = new Save();

        s1.i = 90;
        System.out.println(s1.i);

        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save s2 = (Save) ois.readObject();
        System.out.println(s2.i);

    }
}

class Save implements Serializable {
    int i;
}