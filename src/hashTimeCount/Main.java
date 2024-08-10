package hashTimeCount;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> pessoaArray = new ArrayList<>();
        LinkedList<Integer> pessoaLinkedList = new LinkedList<>();
        HashMap<Integer, String> pessoaHashMap = new HashMap<>();

        // ARRAY
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            pessoaArray.add(i);
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo ArrayList: %.3f segundos\n", (tempoFinal - tempoInicial) / 1000.00);

        //LinkedList
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            pessoaLinkedList.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo LinkedList: %.3f segundos\n", (tempoFinal - tempoInicial) / 1000.00);

        //HASHMAP
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            pessoaHashMap.put(i, "Pessoa " + i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo HashMap: %.3f segundos\n", (tempoFinal - tempoInicial) / 1000.00);
    }
}