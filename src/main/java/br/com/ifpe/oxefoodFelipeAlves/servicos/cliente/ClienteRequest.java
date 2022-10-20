package br.com.ifpe.oxefoodFelipeAlves.servicos.cliente;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.ifpe.oxefoodFelipeAlves.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

    private String chaveEmpresa;

    @Size(max = 1000)
    @NotNull
    @NotEmpty
    private String nome;
    
    private String cpf;
    
    private String fone;
    
    private String foneAlternativo;

    public Cliente buildCliente() {

    return Cliente.builder()
        .chaveEmpresa(chaveEmpresa)
        .nome(nome)
        .cpf(cpf)
        .fone(fone)
        .foneAlternativo(foneAlternativo)
        .build();
    }
}
