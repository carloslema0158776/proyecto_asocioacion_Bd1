package org.asociacion;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Asociación de Agricultores - Sistema");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar=new JMenuBar();

        JMenu menuArchivo=new JMenu("Archivo");
        JMenuItem itemImportarExcel=new JMenuItem("Importar Base de Datos (Excel)");
        itemImportarExcel.addActionListener(e->{ExcelImportDialog dialog=new ExcelImportDialog(this);dialog.setVisible(true);});
        JMenuItem itemSalir=new JMenuItem("Salir");
        itemSalir.addActionListener(e->System.exit(0));
        menuArchivo.add(itemImportarExcel);menuArchivo.addSeparator();menuArchivo.add(itemSalir);

        JMenu menuMiembro=new JMenu("Miembros");
        JMenuItem itemNuevoMiembro=new JMenuItem("Registrar Miembro");
        itemNuevoMiembro.addActionListener(e->{MemberDialog dialog=new MemberDialog(this);dialog.setVisible(true);});
        menuMiembro.add(itemNuevoMiembro);

        JMenu menuPagos=new JMenu("Pagos");
        JMenuItem itemSimularPago=new JMenuItem("Simular Pago de Membresía");
        itemSimularPago.addActionListener(e->{PagoDialog dialog=new PagoDialog(this);dialog.setVisible(true);});
        menuPagos.add(itemSimularPago);

        JMenu menuReportes=new JMenu("Reportes");
        JMenuItem itemReporteBeneficios=new JMenuItem("Miembros por Beneficio");
        itemReporteBeneficios.addActionListener(e->{ReporteBeneficiosDialog dialog=new ReporteBeneficiosDialog(this);dialog.setVisible(true);});
        menuReportes.add(itemReporteBeneficios);
        JMenuItem itemReporteContratos=new JMenuItem("Contratos por Monto");
        itemReporteContratos.addActionListener(e->{ReporteContratosDialog dialog=new ReporteContratosDialog(this);dialog.setVisible(true);});
        menuReportes.add(itemReporteContratos);

        menuBar.add(menuArchivo);menuBar.add(menuMiembro);menuBar.add(menuPagos);menuBar.add(menuReportes);
        setJMenuBar(menuBar);

        BackgroundPanel fondo=new BackgroundPanel();
        JLabel titulo=new JLabel("Sistema de Asociación de Agricultores",SwingConstants.CENTER);
        titulo.setFont(new Font("Arial",Font.BOLD,32));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(false);
        fondo.setLayout(new GridBagLayout());
        fondo.add(titulo);
        add(fondo,BorderLayout.CENTER);
    }
}
class BackgroundPanel extends JPanel {
    @Override protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g.create();
        g2.setPaint(new GradientPaint(0,0,new Color(22,65,65),getWidth(),getHeight(),new Color(12,30,50)));
        g2.fillRect(0,0,getWidth(),getHeight());
        g2.dispose();
    }
}
