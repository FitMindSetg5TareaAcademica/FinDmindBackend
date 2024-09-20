package Grupo05.FitMindSet.dto.request;

import lombok.Data;

@Data
public class UsuarioRegistroRequestDTO {
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasena;
    private int edad;
    private String genero;
}
