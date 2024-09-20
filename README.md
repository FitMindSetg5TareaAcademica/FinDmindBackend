# **FitMindSet_UPAO**
**Proyecto: Seguimiento de Hábitos Saludables**

## **Descripción**
FitMindSet_UPAO es una plataforma diseñada para facilitar la adopción y el seguimiento de hábitos saludables. Está dirigida a usuarios que desean mejorar su estilo de vida, pacientes con condiciones crónicas que requieren monitoreo continuo, y comunidades interesadas en el bienestar colectivo. La plataforma ofrece un enfoque personalizado y accesible, con herramientas respaldadas por profesionales de la salud, proporcionando recomendaciones ajustadas, monitoreo en tiempo real y motivación constante.

## **Características Principales**
- **Monitoreo de Hábitos**: Seguimiento personalizado de áreas clave como alimentación, ejercicio y sueño.
- **Recomendaciones Basadas en Datos**: Propuestas personalizadas según las necesidades del usuario y su progreso.
- **Motivación Continua**: Recordatorios automáticos y notificaciones personalizadas para mantener la constancia en los hábitos.
- **Desafíos de Bienestar**: Participación en retos diseñados para fomentar hábitos saludables.
- **Acceso a Contenidos Especializados**: Recursos validados por profesionales de la salud.
- **Soporte Comunitario**: Herramientas para organizar actividades de bienestar y compartir experiencias en comunidades.

## **Tipos de Usuarios**
1. **Personas que desean mejorar su estilo de vida**:
   - Monitoreo de progreso diario en ejercicio, alimentación y sueño.
   - Recordatorios y desafíos para promover hábitos saludables.
   - Acceso a información médica confiable y personalizada.

2. **Pacientes que requieren seguimiento continuo**:
   - Monitoreo en tiempo real de indicadores clave de salud.
   - Integración de horarios de alimentación, medicación y rutinas de ejercicio.
   - Recomendaciones y recordatorios personalizados.

3. **Comunidades interesadas en el bienestar colectivo**:
   - Organización de actividades colectivas (ejercicio, meditación).
   - Espacios para compartir experiencias y recomendaciones.
   - Monitoreo del progreso colectivo.

## **Estructura del Proyecto**
- **/src**: Código fuente de la aplicación.
- **/docs**: Documentación técnica y manuales de usuario.
- **/tests**: Pruebas unitarias y de integración.
- **/resources**: Recursos adicionales como imágenes, contenido educativo y materiales complementarios.

## **Tecnologías Utilizadas**
- **Frontend**: ReactJS, HTML5, CSS3
- **Backend**: Node.js, Express
- **Base de Datos**: MongoDB
- **Autenticación**: JWT (JSON Web Tokens)
- **Notificaciones**: Firebase Cloud Messaging
- **Despliegue**: Docker, Kubernetes

## **Asignación de Historias de Usuario**
Cada historia de usuario se asigna a un módulo y tiene un identificador único:

| **Integrante**                       | **ID**   | **Módulo**                  | **Historia de Usuario**                                                                                                                                     | **Tipo**   |
|--------------------------------------|----------|-----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| Saavedra Arroyo Sebastián Alonso     | EPC-1    | Gestión de Usuarios          | Como usuario quiero poder registrarme especificando mis objetivos de salud y preferencias para recibir recomendaciones personalizadas.                       | CRUD       |
| Saavedra Arroyo Sebastián Alonso     | EPC-2    | Gestión de Usuarios          | Como usuario registrado quiero poder iniciar sesión con las credenciales para acceder a mi perfil y progreso.                                                | CORE       |
| Saavedra Arroyo Sebastián Alonso     | EPC-3    | Gestión de Usuarios          | Como usuario quiero acceder a mi perfil con mi cuenta de correo electrónico para tener mayor seguridad.                                                      | CORE       |
| Saavedra Arroyo Sebastián Alonso     | EPC-4    | Gestión de Usuarios          | Como usuario quiero poder recuperar mis credenciales para poder acceder nuevamente a mi perfil sin perder mi progreso en las metas de salud.                  | CORE       |
| Saavedra Arroyo Sebastián Alonso     | EPC-5    | Gestión de Usuarios          | Como usuario quiero actualizar mi perfil para mantener mis datos personales y objetivos de salud al día.                                                     | CRUD       |
| Jimenez Atoche Sthefano Gabriel      | EPC-7    | Gestión de Usuarios          | Como usuario quiero establecer preferencias de notificaciones para recibir recordatorios y motivaciones según mis necesidades.                               | CRUD/CORE  |
| Jimenez Atoche Sthefano Gabriel      | EPC-8    | Gestión de Usuarios          | Como usuario quiero eliminar mi cuenta si ya no deseo utilizar la plataforma para de esta manera asegurar la privacidad de mis datos.                        | CRUD       |
| Lescano Gutiérrez Jaime Rafael       | EPC-11   | Metas y Seguimiento          | Como usuario quiero registrar lo que hago día a día en relación a mi dieta equilibrada y actividad física para mantener una organización de mis objetivos.   | CORE       |
| Prieto Meléndez Alexander Antonio    | EPC-12   | Reportes                    | Como usuario quiero visualizar un reporte estadístico de mi progreso diario para identificar áreas de mejora y ajustar mis hábitos.                          | CORE       |
| Baylón Toledo Diogho Matteo          | EPC-19   | Reportes/Seguimiento         | Como usuario quiero poder ver una barra de progreso que muestre mi avance hacia mis metas para tener una referencia visual rápida de mi desempeño.            | Reporte    |
| Baylón Toledo Diogho Matteo          | EPC-21   | Pagos en Línea               | Como usuario quiero poder suscribirme a contenido adicional para tener acceso continuo a recursos especializados y mejorar mi experiencia en la plataforma.   | Pago CORE  |


