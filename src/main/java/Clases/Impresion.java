/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.borders.SolidBorder;
import java.io.FileNotFoundException;
import javax.swing.JTable;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.net.URL;  // Importa la clase URL

public class Impresion {

    // Asegúrate de que esta variable se inicialice correctamente antes de llamarla
    public static String Mensaje;

    public static void exportTableToPDF(JTable table, String filePath) throws FileNotFoundException {
        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        try {
            // Crear la fuente "Times New Roman" tamaño 12
            PdfFont font = PdfFontFactory.createFont("Times-Roman");

            // Comprobar la ruta de la imagen
            URL imageUrl = Impresion.class.getResource("/Imagenes/Logo_Utec.png");  // Usa Impresion.class
            if (imageUrl != null) {
                String imagePath = imageUrl.getPath();
                Image img = new Image(ImageDataFactory.create(imagePath));
                img.setWidth(170);  // Establece el tamaño de la imagen
                img.setHeight(200);
                img.setHorizontalAlignment(com.itextpdf.layout.properties.HorizontalAlignment.CENTER);
                document.add(img);
            } else {
                // La imagen no fue encontrada
                //System.out.println("Imagen no encontrada en la ruta especificada.");
            }

            // Añadir el texto justificado antes de la tabla
            Paragraph paragraph = new Paragraph(Mensaje)
                    .setFont(font)
                    .setFontSize(12)
                    .setTextAlignment(TextAlignment.JUSTIFIED) // Justificar el texto
                    .setMarginBottom(10); // Espacio entre el texto y la tabla
            document.add(paragraph);

            // Crear la tabla con el número de columnas de la JTable
            float[] columnWidths = new float[table.getColumnCount()];
            for (int i = 0; i < columnWidths.length; i++) {
                columnWidths[i] = 1;
            }

            // Crear la tabla en el PDF
            Table pdfTable = new Table(columnWidths);

            // Color para el encabezado (vino)
            DeviceRgb headerColor = new DeviceRgb(174, 40, 39); // Vino

            // Agregar los encabezados con estilo
            for (int col = 0; col < table.getColumnCount(); col++) {
                pdfTable.addHeaderCell(new Cell()
                        .add(new Paragraph(table.getColumnName(col)))
                        .setFont(font)
                        .setFontSize(12)
                        .setBackgroundColor(headerColor)
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBorder(new SolidBorder(0.5f))
                        .setFontColor(DeviceRgb.WHITE)
                );
            }

            // Agregar las filas de datos
            for (int row = 0; row < table.getRowCount(); row++) {
                for (int col = 0; col < table.getColumnCount(); col++) {
                    pdfTable.addCell(new Cell()
                            .add(new Paragraph(table.getValueAt(row, col).toString()))
                            .setFont(font)
                            .setFontSize(12)
                            .setTextAlignment(TextAlignment.LEFT)
                            .setBorder(new SolidBorder(0.5f))
                    );
                }
            }

            // Agregar la tabla al documento
            document.add(pdfTable);

            // Añadir la fecha y hora al pie de página
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String date = sdf.format(new Date());
            document.add(new Paragraph("Fecha de generación: " + date)
                    .setFont(font)
                    .setFontSize(12)
                    .setTextAlignment(TextAlignment.RIGHT)
                    .setMarginTop(10)
                    .setMultipliedLeading(1.5f)
            );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
