public class HochschuleApp {
    
    public static void main(String[] args) {

        Studierender anna = new Studierender("Anna Schmidt");
        Vorlesung prog1 = new Vorlesung("Grundlagen der Programmierung");

        prog1.gibEingeschriebeneStudierendeAus();
        prog1.einschreiben(anna);
        prog1.gibEingeschriebeneStudierendeAus();
        
    }
}
