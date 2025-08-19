package programasSemana01;

import javax.swing.JOptionPane;

public class ProgramaPedidos {

  public static void main(String[] args) {
    int op, cantInvent, cantTvVend, invetAgregad;
    int pedidoCompleto = 0, pedidoIncompleto = 0, sumVendidos = 0;
    String entrada;
    do {
      entrada = JOptionPane.showInputDialog("""
          Bienvenido
          Ingresar cantidad de Inventario: """);
      cantInvent = Integer.parseInt(entrada);

      if (cantInvent <= 0) {
        JOptionPane.showMessageDialog(null, "Vuelve a ingresar", "Error", JOptionPane.WARNING_MESSAGE);
      }

    } while (cantInvent <= 0);

    do {
      do {
        entrada = JOptionPane.showInputDialog("""
            Cajero
            1. Actualizar Inventario
            2. Realizar Pedido
            3. Mostrar
            4. Salir
            Seleccione opcion:
            """);
        op = Integer.parseInt(entrada);

        if (op < 1 || op > 4) {
          JOptionPane.showMessageDialog(null, "Vuelve a ingresar", "Error", JOptionPane.WARNING_MESSAGE);
        }

      } while (op < 1 || op > 4);

      switch (op) {
        case 1 -> {
          do {
            entrada = JOptionPane.showInputDialog("Ingresar cantidad: ");
            invetAgregad = Integer.parseInt(entrada);

            if (invetAgregad <= 0) {
              JOptionPane.showMessageDialog(null, "Vuelva a ingresar", "Error", JOptionPane.WARNING_MESSAGE);
            }
          } while (invetAgregad <= 0);
        }

        case 2 -> {
          do {
            entrada = JOptionPane.showInputDialog("Ingresar cantidad a vender");
            cantTvVend = Integer.parseInt(entrada);
            if (cantTvVend < 0) {
              JOptionPane.showMessageDialog(null, "Vuelva a ingresar", "Error", JOptionPane.WARNING_MESSAGE);
            }
          } while (cantTvVend < 0);

          if (cantTvVend <= cantInvent) {
            JOptionPane.showMessageDialog(null, "Pedido completo", "PEDIDO", JOptionPane.WARNING_MESSAGE);
            cantInvent = cantInvent - cantTvVend;
            pedidoCompleto++;
            sumVendidos = sumVendidos + cantTvVend;
          } else {
            JOptionPane.showMessageDialog(null, "Pedido incompleto", "PEDIDO", JOptionPane.WARNING_MESSAGE);
            pedidoIncompleto++;
          }
        }

        case 3 -> {
          JOptionPane.showMessageDialog(null,
              "Queda: " + cantInvent + "\nVendidos: " + sumVendidos + "\nCantidad completos: "
                  + pedidoCompleto + "\nPedidos incompletos: " + pedidoIncompleto,
              "PEDIDO", JOptionPane.WARNING_MESSAGE);
        }
        case 4 -> {
          JOptionPane.showMessageDialog(null, "Gracias...! Vuelva pronto", "SALIR", JOptionPane.WARNING_MESSAGE);
        }
        default -> throw new AssertionError();
      }
    } while (op != 4);
  }
}
