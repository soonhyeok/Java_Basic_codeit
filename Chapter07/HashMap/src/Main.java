import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> arrayList = new ArrayList<>();
        arrayList.add(new Pokemon("이상해씨"));
        arrayList.add(new Pokemon("이상해풀"));
        arrayList.add(new Pokemon("이상해꽃"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
}
