
package ejerciciointegrador;

class Producto {
        private String codigo;
        private String nombre;
        private String nombreEmpleado;
        private String cedulaEmpleado;
        private int cantidad;
        private double precioBase;
        private String tipo;
        private double precioBruto;
        double ganancia;
       

        public Producto(String codigo, String nombre, String nombreEmpleado, String cedulaEmpleado, int cantidad, double precioBase, String tipo) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.nombreEmpleado = nombreEmpleado;
            this.cedulaEmpleado = cedulaEmpleado;
            this.cantidad = cantidad;
            this.precioBase = precioBase;
            this.tipo = tipo;
            calcularPrecio();
            calcularGanancia();
        }
        

        private void calcularPrecio() {
            switch (tipo) {
                case "Alimentos":
                    precioBruto = precioBase * 0.20 + precioBase;
                    break;
                case "Bebidas":
                    precioBruto = precioBase * 0.30 + precioBase;
                    break;
                case "Higiene":
                    precioBruto = precioBase * 0.25 + precioBase + 500;
                    break;
                case "Limpieza":
                    precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                    break;
            }
        }
        

        private void calcularGanancia() {
            ganancia = (precioBruto - precioBase) * cantidad;
        }
       

        public String obtenerInformacion() {
            return "Código: " + codigo + "\n"
                    + "Nombre: " + nombre + "\n"
                    + "Nombre del empleado: " + nombreEmpleado + "\n"
                    + "Cédula del empleado: " + cedulaEmpleado + "\n"
                    + "Cantidad: " + cantidad + "\n"
                    + "Precio base: " + precioBase + "\n"
                    + "Tipo: " + tipo + "\n"
                    + "Precio bruto: " + precioBruto + "\n"
                    + "Ganancia esperada: " + ganancia;
        }
    }


 class Supermercado {

        String nombre;
        String codigo;
       

        public Supermercado(String nombre, String codigo) {
            this.nombre = nombre;
            this.codigo = codigo;
        }
    }
