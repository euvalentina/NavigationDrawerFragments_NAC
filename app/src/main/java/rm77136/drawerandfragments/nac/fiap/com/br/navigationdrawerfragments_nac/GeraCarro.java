package rm77136.drawerandfragments.nac.fiap.com.br.navigationdrawerfragments_nac;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valentina on 28/03/2017.
 */

public class GeraCarro {
    public static List<Carro> listaCarros(){
        List<Carro> carro = new ArrayList<>();
        carro.add(new Carro("Passat TS", 1977, "", R.drawable.passat));
        carro.add(new Carro("Bmw M3", 1990, "", R.drawable.bmwm3));
        carro.add(new Carro("Fusca", 1952, "", R.drawable.fusca));
        carro.add(new Carro("Nissan GTR", 1990, "", R.drawable.nissan));
        carro.add(new Carro("Honda NSX", 1992, "", R.drawable.honda));
        carro.add(new Carro("Audi S3", 1999, "", R.drawable.audi1999));
        return carro;

}
