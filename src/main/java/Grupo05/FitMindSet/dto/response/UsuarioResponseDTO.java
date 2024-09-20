package Grupo05.FitMindSet.dto.response;

import lombok.Data;

@Data
public class UsuarioResponseDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private String correo;
    private int edad;
    private String genero;
    private String mensaje;
}
