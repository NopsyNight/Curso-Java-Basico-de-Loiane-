package aulas.aula19_vetores_ou_arrays;

// Os Vetores ou Arrays são estruturas de dados mais simples existente na maioria das linguagens de programação.
// Uma lista ordenada de dados.

public class Vetores {
    public static void main(String[] args){
        // Problema
        // Amarzenar a média da temperatura ambiental em 1 ano.

        // Solução? Fazer varias variáveis? KKKKKKKKKK
        double tempeDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 31.7;
        double tempDia005 = 32.7;

        // Claro que não.

        // Solução, utilizar Arrays ou Vetores, como funciona? Seria basicamente como se fosse uma lista infinita de valores como se fosse uma lista:
        // parecido com lista em python, como = "lista = []", só que no java vai ser chamado uma lista, só que com limite que você vai definir o limite de indices.
        // indices são basicamentes numeros que especificam o local da variável guardada na lista

        // Exemplo e Mais recomendável:
        double[] temperaturas = new double[365];

        // Outra forma não recomendada para leitura de código:
        // double temp[];

        // Variável com o vetor com o índice.
        temperaturas[0] = 31.3;
        temperaturas[1] = 31.8;
        temperaturas[2] = 32.3;
        temperaturas[3] = 34.3;
        temperaturas[4] = 33.3;

        // Imprimindo o valor
        System.out.println("O valor da temperatura do dia 1 é " + temperaturas[0]);

        // Como saber o tamanho do Array?
        System.out.println("O tamanho do array: " + temperaturas.length);

        // Imprimindo todos os valores do vetor na tela:

        System.out.println("Valores do array: " + temperaturas);
        // Quando Imprimido o valores do Array [D@2a84aee7], isso acontece pois as variáveis armazenadas no Array, serão transportadas para a memória do java, criptografando elas, para resolver isso

        // Utilizamos o For;
        for (int cont = 0; cont <= temperaturas.length; cont++){
            System.out.println("O valor da temperatura do dia "+ (cont + 1) + " é: " + temperaturas[0]);
        }

        // For melhorado no Java 5.0 Para Arrays
        for (double temp : temperaturas){
            // A variável "temp" seria a mesma coisa que acessar um índice dos Vetores de temperatura
            System.out.println(temp);
        }
    }
}