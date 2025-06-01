import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            String[] itens = linha.trim().split("\\s+");
            Set<String> set = new HashSet<>(Arrays.asList(itens));
            List<String> lista = new ArrayList<>(set);
            Collections.sort(lista);
            System.out.println(String.join(" ", lista));
        }
        sc.close();
    }
}