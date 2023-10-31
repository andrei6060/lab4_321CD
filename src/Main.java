public class Main {
    public static void main(String[] args) {
        StudentLaPoli student = new StudentLaPoli();
        student.setFacultate("Acs");
        //OKAY si singura varianta
        System.out.println(student.getFacultate());
        //OKAY
        System.out.println(StudentLaPoli.universitate);
        //EROARE de compilare
        //System.out.println(StudentLaPoli.getfacultate());
        //E posibil, dar nu e good practice
        System.out.println(student.universitate);
        //student.primulAn = 2023;
        //EROARE DE COMPILARE
        //StudentLaPoli.universitate = "ASE";
        PoliSingletonBlockInstantiation instance = PoliSingletonBlockInstantiation.getInstance();
        System.out.println(instance.getData());
    }


}

//good practice
//instanta e creata cand e utilizata
class PoliSingletonLazy {
    private static PoliSingletonLazy instance = null;
    private String data;
    private PoliSingletonLazy(String data) {
        this.data = data;
    }
    public static PoliSingletonLazy getInstance(String data) {
        if(instance == null){
            instance = new PoliSingletonLazy(data);
        }
        return instance;
    }

}
//instanta creata inainte de a fi utilizata
class PoliSingletonEager {
    private static PoliSingletonEager instance = new PoliSingletonEager();

    public String getData() {
        return data;
    }

    private final String data = "POLI";

    private PoliSingletonEager() {
    }
    public static PoliSingletonEager getInstance(String data) {
        return instance;
    }


}
//instanta creata inainte de a fi utilizata
class PoliSingletonBlockInstantiation{
    private static PoliSingletonBlockInstantiation instance = null;
    private final String data;
    private PoliSingletonBlockInstantiation(){
        data = "POLI";
    }
    public String getData() {
        return data;
    }

    static{
        try{
            instance = new PoliSingletonBlockInstantiation();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static PoliSingletonBlockInstantiation getInstance() {
        return instance;
    }

}
