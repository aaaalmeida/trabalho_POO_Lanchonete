package br.com.arthur.lanchonete.lanchonete;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
    private String observacao;
    @ManyToOne
    //@JoinColumn(name = "nome_customizado_coluna_join")
    private Produto produto;

}