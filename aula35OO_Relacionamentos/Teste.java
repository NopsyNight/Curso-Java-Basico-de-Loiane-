package aulas.aula35OO_Relacionamentos;

public class Teste {
    public static void main(String[] args){

        Contato contato = new Contato();
        contato.setNome("Matheus");
        // contato.setEndereco("Temeria");
        // contato.setTelefone("87 99999-9999");

        // Criar objeto Endereço
        Endereco end = new Endereco();
        end.setNomeDaRua("Rua Foltest II");
        end.setNumeroDaCasa("157");
        end.setComplemento("n/a");
        end.setCidade("Vízima");
        end.setEstado("Temeria");
        end.setCep("69");

        contato.setEndereco(end);

        // Agora o telefone será trocado.

        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("87");
        telefone.setNumero("99999-9999");

        // Telefone 2
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Computador");
        telefone2.setDdd("11");
        telefone2.setNumero("11111-1111");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);
        // Teste saída no console

        System.out.println(contato.getNome());

        // Agora, loiane explica que criará uma classe Endereço, para que essa classe seja indexada no atributo endereço da classe contato.

        //System.out.println(contato.getEndereco()); aulas.aula35OO_Relacionamentos.Endereco@2a84aee7

        //System.out.println(contato.getEndereco().getCidade());  Null Pointer Excepetion.

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade()); // Não irá sair no console.
        }

        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + contato.getTelefone().getNumero());
        }
         */
        // Agora o telefone terá um Array de telefones para ter vários relacionamentos.

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
