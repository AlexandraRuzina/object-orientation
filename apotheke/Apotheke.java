package apotheke;

public class Apotheke {

    private String ort;
    private String besitzer;
    private Medikament[] medikamente = new Medikament[100];


    public Apotheke(String ort, String besitzer){
        this.ort = ort;
        this.besitzer = besitzer;
    }


    public void gebeVerfuegbareMedikamenteAus(){
        for (Medikament medi : medikamente ){
            System.out.println(medi);
        }
    }

    
}
