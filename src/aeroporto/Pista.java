package aeroporto;

import java.util.ArrayList;

public class Pista {
    
    boolean ocupada;
    ArrayList<fila> Lista;
    
    public Pista(final int aterrisagem) {
        this.ocupada = false;
        for (int i = 0; i < aterrisagem; i++) {
            final fila prat_aterrisagem = new fila();
            this.Lista.add(prat_aterrisagem);
        }
        final fila prat_decolagem = new fila();
        this.Lista.add(prat_decolagem);
    }
}
