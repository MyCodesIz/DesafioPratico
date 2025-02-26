package src.java.br.com.projeto;

import src.java.br.com.projeto.persistence.migration.MigrationStrategy;
import src.java.br.com.projeto.ui.MainMenu;

import java.sql.SQLException;

import static src.java.br.com.projeto.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}