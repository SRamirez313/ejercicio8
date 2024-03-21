package ejerciciointegrador;

import javax.swing.JOptionPane;

public class EjercicioIntegrador {
    
    public static void main(String[] args) {
        
                    
        String nombreSupermercado = JOptionPane.showInputDialog("Ingrese el nombre del supermercado:");
        String codigoSupermercado = JOptionPane.showInputDialog("Ingrese el código del supermercado:"); 
        Supermercado supermercado = new Supermercado(nombreSupermercado, codigoSupermercado);
        
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String cedulaEmpleado = JOptionPane.showInputDialog("Ingrese la cédula del empleado:"); 
        
        
        Producto[] productos = new Producto[1]; 
        
        for (int i = 0; i < productos.length; i++) { 
            String codigoProducto = JOptionPane.showInputDialog("Ingrese el código del producto:"); 
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:"); 
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:")); 
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del producto:")); 
            String tipo = JOptionPane.showInputDialog(null, "digite el tipo de producto(,alimentos, bebidas, higiene, limpieza):"); 
            
            productos[i] = new Producto(codigoProducto, nombreProducto, nombreEmpleado, cedulaEmpleado, cantidad, precioBase, tipo); 
        } 
            
            
        String productosInfo = "Productos:\n";

        for (Producto producto : productos) {
            productosInfo += producto.obtenerInformacion() + "\n\n";
        }

        JOptionPane.showMessageDialog(null, productosInfo);

        
        double Total = 0;
        for (Producto producto : productos) {
            Total += producto.ganancia;
        }

        
        JOptionPane.showMessageDialog(null, "Ganancia total esperada: " + Total);
    }
}
