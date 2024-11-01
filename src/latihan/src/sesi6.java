import java.util.ArrayList;
        import java.util.Stack;
        import java.util.Queue;
        import java.util.LinkedList;

public class sesi6 {
    public static void main(String[] args) {
        ArrayList<String> Mahasiswa = new ArrayList<>();
        Stack<Integer> Stack = new Stack<>();
        Queue<Integer> Queue = new LinkedList<>() {
            
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        queue.add(1);
        queue.add(2);

        Mahasiswa.add("Budi");
        Mahasiswa.add("Andi");
        Mahasiswa.add("Joko");
        Mahasiswa.add("Rudi");
        Mahasiswa.remove("Andi");
        Mahasiswa.set(1, "Dodi");

        for (String mhs:Mahasiswa){
            System.out.println(mhs);
        }
        System.out.println("===========");
        for (int i=0; i<Mahasiswa.size(); i++){
            System.out.println(Mahasiswa.get(i));
        }
        }
    }
    }