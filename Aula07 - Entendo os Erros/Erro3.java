class Erro3 {
    public static void Main(String[] args) {
        System.out.println("Voce digitou: ");
    }
}

// Erro de Capitalização

// Erro3.java:3: error: cannot find symbol
//     public static void Main(String[] args) { 
//                        ^

// Quando o simbolo não é reconhecido pelo compilador, pode ser por causa de uma letra maiúscula ou minúscula incorreta
// No caso acima, o "M" de Main deveria ser minúsculo "m"
// O correto seria "public static void main(String[] args) {"
// O compilador também irá te dar uma dica da onde está o erro, nesse caso na linha 3, coluna 24