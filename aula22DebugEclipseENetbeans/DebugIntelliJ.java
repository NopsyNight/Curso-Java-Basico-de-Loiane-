package aulas.aula22DebugEclipseENetbeans;

public class DebugIntelliJ {
        /*
        No IntelliJ, temos algumas ferramentas disponíveis:

        🔴  Breakpoint	    -  Lugar onde o programa vai parar
        ▶	Resume Program	-  Continua a execução até o próximo breakpoint
        ⏭	Step Over (F8)	-  Avança para a próxima linha, sem entrar em métodos
        ⏬	Step Into (F7)	-  Entra dentro do método que está sendo chamado
        ⏹	Stop	        -  Finaliza o Debug
        ⏫	Step Out (Shift+F8) -	Sai de um método e volta para o escopo anterior
        🧭	Evaluate Expression -  	Testa expressões e valores manualmente

        ---------------------------------------------
        Entendendo os Breakpoints

        Você pode ter quantos breakpoints quiser.
        Quando o programa chega em um breakpoint, ele pausa.

        Durante essa pausa, você consegue:

        Ver o valor atual de variáveis

        Ver o que está sendo passado para funçōes

        Descobrir se uma condição do if é verdadeira ou falsa

        Dica:

        Se você quer que o breakpoint pare somente se uma condição for verdadeira, clique com o direito sobre o breakpoint → More → Condition
        Exemplo:

        i == 5
       ----------------------------------------------
        Janela de Variáveis

        Quando o debug está pausado, aparece uma janela com as variáveis do escopo atual.

        Ali você pode:

        Ver valores

        Expandir objetos para ver seus atributos

        Clicar e editar valores em tempo real (isso é muito útil!)

        Exemplo: Você pode mudar o valor de contador enquanto o programa está parado.

        ----------------------------------------------

        Evaluate Expression (Ferramenta Ouro)

        Esse recurso é incrível.

        Com o programa pausado:

        Clique no ícone Evaluate Expression (normalmente um calculator).

        Digite qualquer código que você quer testar ali.

        Exemplos:

        Ver se um método retorna o que você espera:

        minhaLista.size()


        Fazer cálculos:

        (valorProduto * 0.10)

        ----------------------------------------------

        Como usar Debug no dia a dia

        Situação -	                                                       Como o Debug ajuda:
        O programa está dando resultado errado	----- Pare nos pontos onde o cálculo ocorre e veja se valores estão certos.
        Você quer entender um código que não escreveu ---- Use Step Into para entrar nos métodos e ver a lógica.
        Está estudando Java ou lógica ------  Depurar faz você ver o fluxo real da execução, fortalecendo o aprendizado.
        Um loop está estranho ---- Coloque um breakpoint dentro dele e acompanhe o valor mudando.

        */
}
