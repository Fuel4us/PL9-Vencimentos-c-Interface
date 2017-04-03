package vencimentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class TesteVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        Trabalhador[] trab = new Trabalhador[3];

        trab[0] = tc;
        trab[1] = tp;
        trab[2] = th;

//        System.out.println("### Trabalhadores ###");
//        listar(trabs);
//        // Comparable
//        // a)
//        System.out.println("\n Vencimentos por Ordem Crescente");
//        Arrays.sort(trab);
//        listar2(trab);
//
//        // b)
//        System.out.println("\n Vencimentos por Ordem Decrescente");
//        Arrays.sort(trab, Collections.reverseOrder());
//        listar2(trab);
        
        // Comparator
        // a)
        ComparadorVencimento c1 = new ComparadorVencimento();
        Arrays.sort(trab, c1);
        listar2(trab);

        // estética
        System.out.println("\n--------------------x--------------------");

        // b)
        ComparadorVencimento c2 = new ComparadorVencimento();
        Arrays.sort(trab, c2.reversed());
        listar2(trab);

        // estética
        System.out.println("\n--------------------x--------------------");

        // c)
        ComparadorNome n1 = new ComparadorNome();
        Arrays.sort(trab, n1);
        listar2(trab);

    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }

    public static void listar2(Trabalhador[] t) {
        System.out.println("\n--- Listagem de Trabalhadores Ordenada: ---");
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {
                System.out.printf("%s, vencimento = %.2f€%n", t[i].getNome(),
                        t[i].calcularVencimento());
            }
        }
    }

}
