/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;
//IMPORT
import backend.Circulo;
import backend.Cuadrado;
import backend.FiguraCRUD;
import backend.Triangulo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class ListadoFiguras extends javax.swing.JPanel {

    /**
     * Creates new form ListadoFiguras
     */
    private FiguraCRUD figuraDAO;
    public ListadoFiguras(FiguraCRUD figuraDAO ) {
        initComponents();
        this.figuraDAO = figuraDAO;
        cargarDatosEnTabla();
        Card_footer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        container_content = new javax.swing.JPanel();
        Card_footer = new javax.swing.JPanel();
        textCard = new javax.swing.JLabel();
        jLabelCirculo = new javax.swing.JLabel();
        jLabelCuadrado = new javax.swing.JLabel();
        jLabelTriangulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCirculo = new javax.swing.JTable();
        content_header = new javax.swing.JPanel();
        content_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(631, 396));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(600, 400));

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(30, 33, 44));
        title.setText("Listado de Figuras");

        description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        description.setForeground(new java.awt.Color(51, 51, 51));
        description.setText("Este módulo lista todas las áreas de las figuras");

        container_content.setBackground(new java.awt.Color(255, 255, 255));
        container_content.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(243, 244, 247), 2, true));

        Card_footer.setBackground(new java.awt.Color(60, 153, 127));

        textCard.setBackground(new java.awt.Color(255, 255, 255));
        textCard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textCard.setForeground(new java.awt.Color(255, 255, 255));
        textCard.setText("No hay datos existentes");

        javax.swing.GroupLayout Card_footerLayout = new javax.swing.GroupLayout(Card_footer);
        Card_footer.setLayout(Card_footerLayout);
        Card_footerLayout.setHorizontalGroup(
            Card_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_footerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(textCard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Card_footerLayout.setVerticalGroup(
            Card_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Card_footerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(textCard)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabelCirculo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\POO\\Circulo_P.png")); // NOI18N
        jLabelCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCirculoMouseClicked(evt);
            }
        });

        jLabelCuadrado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\POO\\cuadrado_P.png")); // NOI18N
        jLabelCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCuadradoMouseClicked(evt);
            }
        });

        jLabelTriangulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\POO\\Triangulo_P.png")); // NOI18N
        jLabelTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTrianguloMouseClicked(evt);
            }
        });

        jTableCirculo.setBackground(new java.awt.Color(43, 105, 92));
        jTableCirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 105, 92)));
        jTableCirculo.setForeground(new java.awt.Color(255, 255, 255));
        jTableCirculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#", "Radio", "Área"
            }
        ));
        jTableCirculo.setEnabled(false);
        jTableCirculo.setOpaque(false);
        jScrollPane1.setViewportView(jTableCirculo);

        content_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        content_title.setText("DB");

        javax.swing.GroupLayout content_headerLayout = new javax.swing.GroupLayout(content_header);
        content_header.setLayout(content_headerLayout);
        content_headerLayout.setHorizontalGroup(
            content_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(content_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        content_headerLayout.setVerticalGroup(
            content_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(content_title)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout container_contentLayout = new javax.swing.GroupLayout(container_content);
        container_content.setLayout(container_contentLayout);
        container_contentLayout.setHorizontalGroup(
            container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_contentLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabelCirculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCuadrado)
                .addGap(88, 88, 88)
                .addComponent(jLabelTriangulo)
                .addGap(65, 65, 65))
            .addComponent(content_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(container_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(container_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Card_footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        container_contentLayout.setVerticalGroup(
            container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_contentLayout.createSequentialGroup()
                .addComponent(content_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(container_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCuadrado)
                    .addComponent(jLabelCirculo)
                    .addComponent(jLabelTriangulo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Card_footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description)
                    .addComponent(title)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(container_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(21, 21, 21)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(container_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(407, 407, 407))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void cargarDatosEnTabla() {
        // Obtener la lista de círculos desde tu clase FiguraCRUD
        List<Circulo> listaCirculos = figuraDAO.obtenerListaCirculos();
        System.out.println("Cantidad de círculos: " + listaCirculos.size());

        // Obtener el modelo de la JTable
        DefaultTableModel modelo = (DefaultTableModel) jTableCirculo.getModel();

        // Limpiar la tabla antes de cargar nuevos datos
        modelo.setRowCount(0);

        // Cargar cada círculo en la tabla
        if (listaCirculos.size() == 0){
            textCard.setText("No hay datos existentes");
            Card_footer.setVisible(true);
            jTableCirculo.setVisible(false);
        }else{
            for (Circulo circulo : listaCirculos) {
                Object[] rowData = {circulo.getIndice(),circulo.getRadio(), circulo.getArea()};
                modelo.addRow(rowData);
            }
            Card_footer.setVisible(false);
        }
    }
    private void jLabelCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCirculoMouseClicked
        actualizarDatosEnTabla("CIRCULO");
    }//GEN-LAST:event_jLabelCirculoMouseClicked

    private void jLabelCuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCuadradoMouseClicked
       actualizarDatosEnTabla("CUADRADO");
    }//GEN-LAST:event_jLabelCuadradoMouseClicked

    private void jLabelTrianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTrianguloMouseClicked
       actualizarDatosEnTabla("TRIANGULO");
    }//GEN-LAST:event_jLabelTrianguloMouseClicked
  private void actualizarDatosEnTabla(String tipoFigura) {
    DefaultTableModel modelo = (DefaultTableModel) jTableCirculo.getModel();
    modelo.setRowCount(0);

    if (tipoFigura.equals("CIRCULO")) {
        List<Circulo> listaCirculos = figuraDAO.obtenerListaCirculos();
        actualizarTablaCirculo(listaCirculos);
    } else if (tipoFigura.equals("CUADRADO")) {
        List<Cuadrado> listaCuadrados = figuraDAO.obtenerListaCuadrado();
        actualizarTablaCuadrado(listaCuadrados);
    } else if (tipoFigura.equals("TRIANGULO")) {
        List<Triangulo> listaTriangulos = figuraDAO.obtenerListaTriangulos();
        actualizarTablaTriangulo(listaTriangulos);
    }
}

private void actualizarTablaCirculo(List<Circulo> listaCirculos) {
    DefaultTableModel modelo = (DefaultTableModel) jTableCirculo.getModel();
    modelo.setColumnIdentifiers(new Object[]{"#","Radio","Área"});

    for (Circulo circulo : listaCirculos) {
        Object[] rowData = {circulo.getIndice(), circulo.getRadio(), circulo.getArea()};
        modelo.addRow(rowData);
    }

    mostrarTabla(modelo, listaCirculos.size());
}

private void actualizarTablaCuadrado(List<Cuadrado> listaCuadrados) {
    DefaultTableModel modelo = (DefaultTableModel) jTableCirculo.getModel();
    modelo.setColumnIdentifiers(new Object[]{"#","Lado","Área"});

    for (Cuadrado cuadrado : listaCuadrados) {
        Object[] rowData = {cuadrado.getIndice(), cuadrado.getLado(), cuadrado.getArea()};
        modelo.addRow(rowData);
    }

    mostrarTabla(modelo, listaCuadrados.size());
}

private void actualizarTablaTriangulo(List<Triangulo> listaTriangulos) {
    DefaultTableModel modelo = (DefaultTableModel) jTableCirculo.getModel();
    modelo.setColumnIdentifiers(new Object[]{"#","Base","Altura","Área"});

    for (Triangulo triangulo : listaTriangulos) {
        Object[] rowData = {triangulo.getIndice(), triangulo.getBase(), triangulo.getAltura(), triangulo.getArea()};
        modelo.addRow(rowData);
    }

    mostrarTabla(modelo, listaTriangulos.size());
}

private void mostrarTabla(DefaultTableModel modelo, int cantidad) {
    if (cantidad == 0) {
        textCard.setText("No hay datos existentes");
        Card_footer.setVisible(true);
        jTableCirculo.setVisible(false);
    } else {
        Card_footer.setVisible(false);
        jTableCirculo.setVisible(true);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card_footer;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel container_content;
    private javax.swing.JPanel content_header;
    private javax.swing.JLabel content_title;
    private javax.swing.JLabel description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCirculo;
    private javax.swing.JLabel jLabelCuadrado;
    private javax.swing.JLabel jLabelTriangulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCirculo;
    private javax.swing.JLabel textCard;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
