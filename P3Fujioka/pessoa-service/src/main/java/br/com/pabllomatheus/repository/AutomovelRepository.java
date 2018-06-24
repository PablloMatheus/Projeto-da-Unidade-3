package br.com.pabllomatheus.repository;


import java.util.List;

import br.com.pabllomatheus.model.AutomovelModel;
import org.springframework.data.repository.Repository;



public interface AutomovelRepository extends Repository<AutomovelModel, Integer> {



    void save(AutomovelModel auto);

    void delete(AutomovelModel auto);

    List<AutomovelModel> findAll();

//	ProdutoModel findOne(Integer id);

}
