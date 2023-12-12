package apotheke;

public class Medikament {

    private String name;
    private int pzn;
    private String hersteller;

    public Medikament(String name, int pzn, String hersteller){
        this.name = name;
        this.pzn = pzn;
        this.hersteller = hersteller;
    }


    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the pzn
     */
    public int getPzn() {
        return pzn;
    }

    /**
     * @param pzn the pzn to set
     */
    public void setPzn(int pzn) {
        this.pzn = pzn;
    }

    /**
     * @return String return the hersteller
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * @param hersteller the hersteller to set
     */
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

}
