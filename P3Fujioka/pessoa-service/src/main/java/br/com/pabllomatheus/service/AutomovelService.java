package br.com.pabllomatheus.service;

import java.util.List;

import br.com.pabllomatheus.model.AutomovelModel;
import br.com.pabllomatheus.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.pabllomatheus.model.ResponseModel;

@RestController
@RequestMapping("/service")
public class AutomovelService {

    @Autowired
    private AutomovelRepository auto;

    /**
     * SALVAR UM NOVO REGISTRO
     * @param auto
     * @return
     */
    @RequestMapping(value="/automoveis", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseModel salvar(@RequestBody AutomovelModel auto){


        try {

            this.auto.save(auto);

            return new ResponseModel(1,"Registro salvo com sucesso!");

        }catch(Exception e) {

            return new ResponseModel(0,e.getMessage());
        }
    }

    /**
     * ATUALIZAR O REGISTRO DE UMA PESSOA
     * @param auto
     * @return
     */
    @RequestMapping(value="/automoveis", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseModel atualizar(@RequestBody AutomovelModel auto){

        try {

            this.auto.save(auto);

            return new ResponseModel(1,"Registro atualizado com sucesso!");

        }catch(Exception e) {

            return new ResponseModel(0,e.getMessage());
        }
    }

    /**
     * CONSULTAR TODAS AS PESSOAS
     * @return
     */
    @RequestMapping(value="/automoveis", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody List<AutomovelModel> consultar(){


        return this.auto.findAll();
    }

    /***
     * EXCLUIR UM REGISTRO PELO CÓDIGO
     * @param codigo
     * @return
     */
    @RequestMapping(value="/automoveis/{codigo}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Integer codigo){

        AutomovelModel automovelModel= new AutomovelModel();
        automovelModel.setCodigo(codigo);

        try {

            auto.delete(automovelModel);

            return new ResponseModel(1, "Registro excluido com sucesso!");

        }catch(Exception e) {
            return new ResponseModel(0, e.getMessage());
        }
    }

}
