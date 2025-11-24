package aulas.aula44OOInterfaces_e_Herancas_casting_e_instaceOf;

public class Teste2 {
    public static void main(String[] args){
        Object obj1 = obterString();
        String s1 = (String) obj1;

        // Não dá erro mesmo que o Object seja uma super classe

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        Object obj3 = new Object(); // Não está fazedo referência a nenhuma string e então vai falhar.
        // String s3 = (String) obj3;

        Object obj4 = obterInteiro();
        String s4 = (String) obj4; // ERROR por conta do método ser um inteiro e não uma String como o caso acima.

    }

    public static String obterString(){
        return "minha String";
    }

    public static int obterInteiro(){
        return 4;
    }
}
