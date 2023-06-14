package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	public Connection recuperarConexao() {
		try {
			return createDataSource().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private HikariDataSource createDataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/byte_bank");
		config.setUsername("root");
		config.setPassword("p4p4l3g84s");
		config.setMaximumPoolSize(10);
		
		return new HikariDataSource(config);
		
	}
}
/*
login git token
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

novo token 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

salvar ultima senha salva
git config --global credential.helper cache

comando para executar 
java -jar target/app.jar

comando para criar executavel e baixar dependencias
mvn clean install
*/