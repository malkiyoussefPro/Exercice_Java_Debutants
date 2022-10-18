public class Ejemplo_Switch_case {

    public static void main(String[] args) {
        int a = 0;
        String message = "";

        switch (a){
            case 0:
                message="le numero egal a: 0";
                break;
            case 1:
                message="le numero egal a: 1";
                break;
            case 2:
                message="le numero egal a: 2";
                break;
            default:
                message="le numero introduit est hors liste";
        }

        System.out.println(message);
    }
}
