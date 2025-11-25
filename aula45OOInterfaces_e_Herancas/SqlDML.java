package aulas.aula45OOInterfaces_e_Herancas;

public interface SqlDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}
