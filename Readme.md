# Cajero Automático

Aplicación que pide una cantidad de dinero y devuelve los billetes correspondientes

---

### Diagrama de Flujo

````mermaid
flowchart TD
id0([inicio])-->id1(mostrarMenu)
id1-->id2[/introducirOpcion/]
id2-->id3{"¿cantidad o salir?"}
id3-- salir -->id999([fin])
id3-- cantidad -->id4{"¿Que cantidad?"}
id4-->id5[/introducirCantidad/]
id5-->id6{"¿esMultiplo?"}
id6--no_es_multiplo-->id3
id6--es_multiplo-->id7[contarBilletes]
id7-->id8(mostrarBilletes)-->id999

````

### Diagrama de Clases