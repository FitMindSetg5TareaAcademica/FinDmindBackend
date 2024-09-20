package Grupo05.FitMindSet.dto.request;

import lombok.Data;

@Data
public class UsuarioLoginRequestDTO {
    private String correo;
    private String contrasena;
}
