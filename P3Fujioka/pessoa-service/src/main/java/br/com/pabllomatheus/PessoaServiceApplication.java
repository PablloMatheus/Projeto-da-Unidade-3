package br.com.pabllomatheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.pabllomatheus.model","br.com.pabllomatheus.repository","br.com.pabllomatheus.service"})
public class PessoaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PessoaServiceApplication.class, args);
	}
}
