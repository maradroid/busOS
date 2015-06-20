package com.maradroid.busos;



import java.util.ArrayList;
import java.util.List;


/**
 * Created by mara on 13.04.15..
 */
public class Stanice {

    private List<LonLat> listaStanica;

    public Stanice(){
        listaStanica = new ArrayList<>();
        listaStanica.add(new LonLat("Hrvatske republike sjever", 45.558418, 18.677670));
        listaStanica.add(new LonLat("Hrvatske republike jug", 45.558191, 18.679472));
        listaStanica.add(new LonLat("Gajev trg sjever",45.557422, 18.685352));
        listaStanica.add(new LonLat("Gajev trg jug",45.557384, 18.684740));
        listaStanica.add(new LonLat("Zagrbačka sjever",45.556383, 18.689742));
        listaStanica.add(new LonLat("Zagrbačka jug",45.556446, 18.688316));
        listaStanica.add(new LonLat("Vukovarska 74 (Drvljanik)",45.554729, 18.696397));
        listaStanica.add(new LonLat("Vijenac Ivana Meštrovića",45.554870, 18.697912));
        listaStanica.add(new LonLat("Campus sjever",45.554696, 18.703167));
        listaStanica.add(new LonLat("Campus jug",45.554456, 18.703102));
        listaStanica.add(new LonLat("Drvara sjever",45.554260, 18.714968));
        listaStanica.add(new LonLat("Drvara jug",45.554035, 18.714743));
        listaStanica.add(new LonLat("Donji grad sjever",45.552976, 18.721921));
        listaStanica.add(new LonLat("Donji grad jug",45.552517, 18.723659));
        listaStanica.add(new LonLat("Zeleno polje sjever",45.551462, 18.731048));
        listaStanica.add(new LonLat("Zaleno polje jug",45.551124, 18.731681));

    }

    public LonLat getStanica(int position){
        return listaStanica.get(position);
    }
}
