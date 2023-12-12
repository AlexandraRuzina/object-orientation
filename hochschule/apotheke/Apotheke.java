package apotheke;

public class Apotheke {

    private String ort;
    private String besitzer;
    private Medikament[] medikamente = new Medikament[100];



    public void gebeVerfuegbareMedikamenteAus(){
        for (Medikament medi : medikamente ){
            System.out.println(medi);
        }
    }

    
}
