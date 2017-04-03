package vencimentos;

import java.util.Comparator;

/**
 *
 * @author Gonçalo Fonseca 1150503
 */
public class ComparadorVencimento implements Comparator {
    
        public int compare(Object obj1, Object obj2) {
        Trabalhador venc1 = (Trabalhador) obj1;
        Trabalhador venc2 = (Trabalhador) obj2;
        
        return (int) (venc1.calcularVencimento() - venc2.calcularVencimento());

    }
    
}
