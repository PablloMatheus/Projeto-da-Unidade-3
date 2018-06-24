package br.com.pabllomatheus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_automovel")
@Entity
public class AutomovelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_auto")
    private Integer codigo;

    @Column(name="cor")
    private String  corAuto;

    @Column(name="preco")
    private String  precoAuto;

    @Column(name="tipo")
    private String  tipoAuto;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCorAuto() {
        return corAuto;
    }

    public void setCorAuto(String corAuto) {
        this.corAuto = corAuto;
    }

    public String getPrecoAuto() {
        return precoAuto;
    }

    public void setPrecoAuto(String precoAuto) {
        this.precoAuto = precoAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
}
