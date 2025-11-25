package aulas.aula45OOInterfaces_e_Herancas;

public interface SqlDDL {

    void create(String query);
    void drop(String query);
    void alter(String query);

}
