public class StudentLaPoli {
    static final String universitate = "Poli";
    String facultate;
    final int primulAn = 2021;

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
}

//Coding style la teme
final class Universitate{
    String numeUniversitate;
}
//imposibil, deoarece Universitate este final
//class Facultate extends Universitate{
//    String numeFacultate;
//}