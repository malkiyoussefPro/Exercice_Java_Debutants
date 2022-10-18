public class Ejemplo_Clase_Persona {

    private String nom;

    private String prenom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    Ejemplo_Clase_Persona(String nom,String prenon,int age){
        super();
        this.nom=nom;
        this.prenom=prenon;
        this.age=age;
    }

    public Ejemplo_Clase_Persona() {
        super();
    }

    public static void main(String[] args) {

        Ejemplo_Clase_Persona persona = new Ejemplo_Clase_Persona("Malki","Youssef",40);
        System.out.println(persona.nom+" "+persona.prenom+" "+persona.age+ " ans");
    }
}
