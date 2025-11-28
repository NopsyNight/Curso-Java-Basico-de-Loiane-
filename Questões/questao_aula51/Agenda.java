package questoes.questao_aula51;

import java.util.ArrayList;

public class Agenda {
    private Contato[] contatos;
    private int capacidade = 5;

    public Agenda(){
        contatos = new Contato[capacidade];
    }

    public void adicionarContato(String nome, String telefone) throws AgendaCheiaException{
        for (int i = 0; i < contatos.length; i++){
            if (contatos[i] == null) {
                contatos[i] = new Contato(nome, telefone);
                return;
            }
        }
        throw new AgendaCheiaException("Agenda está cheia!");
    }

    public Contato consultar(int id) throws ContatoNaoExisteException{
        for (Contato c : contatos) {
            if (c != null && c.getIdentificador() == id){
                return c;
            }
        }
        throw new ContatoNaoExisteException("Contato com ID " + id +" não existe.");
    }
}
