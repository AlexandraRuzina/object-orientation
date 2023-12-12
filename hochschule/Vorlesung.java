public class Vorlesung{

    private String name;
    private String dozierende;
    private int maxAnzahlStudierende;
    private Studierender[] eingeschriebeneStudenten = new Studierender[50]; 


    public Vorlesung(String name){
        this.name = name;
    }


    public boolean einschreiben(Studierender student){
        for (int i = 0; i<eingeschriebeneStudenten.length; i++){
            if (eingeschriebeneStudenten[i] == null){
                eingeschriebeneStudenten[i] = student;
                return true;
            }
        }
        return false;
    }

    public void gibEingeschriebeneStudierendeAus(){
        for (Studierender studi : eingeschriebeneStudenten){
            System.out.println(studi);
        }

    }


    
}