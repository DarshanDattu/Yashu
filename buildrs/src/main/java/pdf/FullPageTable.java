package pdf;


import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
//import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.property.TextAlignment;

import java.io.File;

public class FullPageTable {
    public static final String DEST = "D:\\TestFile.pdf";

    public static void main(String[] args) throws Exception {
        File file = new File(DEST);
        file.getParentFile().mkdirs();

        new FullPageTable().manipulatePdf(DEST);
    }

    protected void manipulatePdf(String dest) throws Exception {
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(dest));
        Document doc = new Document(pdfDoc, new PageSize(595, 842));
        doc.setMargins(0, 0, 0, 0);

        Table tableHeader = new Table(new float[10]).useAllAvailableWidth();
        tableHeader.setMarginTop(0);
        tableHeader.setMarginBottom(0);

        // first row
        Cell cellHeader = new Cell().add(new Paragraph("GSTIN    :    29AIKPR2096R1Z4"));
        cellHeader.setTextAlignment(TextAlignment.LEFT);
        cellHeader.setBorderRight(Border.NO_BORDER);
        cellHeader.setBorderBottom(Border.NO_BORDER);
        tableHeader.addCell(cellHeader);
        
        Cell cellHeaderRight = new Cell().add(new Paragraph("Oroginal copy"));
        cellHeaderRight.setTextAlignment(TextAlignment.RIGHT);
        cellHeaderRight.setBorderBottom(Border.NO_BORDER);
        cellHeaderRight.setBorderLeft(Border.NO_BORDER);
        tableHeader.addCell(cellHeaderRight);
       
        
        //second row of the header
        Table tableHeader1 = new Table(new float[1]).useAllAvailableWidth();
        tableHeader1.setMarginTop(0);
        tableHeader1.setMarginBottom(0);

       
        Cell cellHeader1 = new Cell().add(new Paragraph("TAX INVOICE"));
        cellHeader1.setUnderline();
        cellHeader1.setBold();
        cellHeader1.setTextAlignment(TextAlignment.CENTER);
        cellHeader1.setBorderTop(Border.NO_BORDER);
        cellHeader1.setBorderBottom(Border.NO_BORDER);
         tableHeader1.addCell(cellHeader1);
     // second row of header ends
        
      //third row of the header
        Table tableHeader2 = new Table(new float[1]).useAllAvailableWidth();
        tableHeader2.setMarginTop(0);
        tableHeader2.setMarginBottom(0);

       
        Cell cellHeader2 = new Cell().add(new Paragraph("MHC BUILDERS AND DEVELOPERS"));
        cellHeader2.setFontSize(20);
        cellHeader2.setBorderTop(Border.NO_BORDER);
        cellHeader2.setBorderBottom(Border.NO_BORDER);
        cellHeader2.setTextAlignment(TextAlignment.CENTER);
       tableHeader2.addCell(cellHeader2);
     // third row of header ends
        
      //fourth row of the header
        Table tableHeader3 = new Table(new float[1]).useAllAvailableWidth();
        tableHeader3.setMarginTop(0);
        tableHeader3.setMarginBottom(0);

       
        Cell cellHeader3 = new Cell().add(new Paragraph(" NEAR BASAVARAJA NURSINGHOME, OPPOSIT TO SURYA HOTEL"));
        cellHeader3.setBorderTop(Border.NO_BORDER);
        cellHeader3.setBorderBottom(Border.NO_BORDER);
       
        cellHeader3.setTextAlignment(TextAlignment.CENTER);
         tableHeader3.addCell(cellHeader3);
     // fourth row of header ends
        
      //5th row of the header
        Table tableHeader4 = new Table(new float[1]).useAllAvailableWidth();
        tableHeader4.setMarginTop(0);
        tableHeader4.setMarginBottom(0);

       
        Cell cellHeader4 = new Cell().add(new Paragraph("HIRIYUR"));
        cellHeader4.setBorderTop(Border.NO_BORDER);
        cellHeader4.setBorderBottom(Border.NO_BORDER);
       
        cellHeader4.setTextAlignment(TextAlignment.CENTER);
        tableHeader4.addCell(cellHeader4);
     // 5th row of header ends
        
      //6th row of the header
        Table tableHeader5 = new Table(new float[10]).useAllAvailableWidth();
        tableHeader5.setMarginTop(0);
        tableHeader5.setMarginBottom(0);

       
        Cell cellHeader5 = new Cell().add(new Paragraph("Tel  :  9980123467   email  :  info@mhcbuilderssanddevelopers.com"));
        cellHeader5.setBorderTop(Border.NO_BORDER);
       
        cellHeader5.setTextAlignment(TextAlignment.CENTER);
        tableHeader5.addCell(cellHeader5);
     // 6th row of header ends
        
      //7th row of the header
        Table tableHeader6 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader6.setMarginTop(0);
        tableHeader6.setMarginBottom(0);

       
        Cell cellHeader6 = new Cell().add(new Paragraph("Invoice No           :     183"));
        cellHeader6.setTextAlignment(TextAlignment.LEFT);
        cellHeader6.setPaddingRight(-33);
        cellHeader6.setBorderTop(Border.NO_BORDER);
        cellHeader6.setBorderBottom(Border.NO_BORDER);
       
        tableHeader6.addCell(cellHeader6);
     // 7th row of header ends
        
      //7th row of second cell header
        Cell cellHeader7 = new Cell().add(new Paragraph("Transport    :   Self"));
        cellHeader7.setTextAlignment(TextAlignment.LEFT);
        cellHeader7.setBorderLeft(Border.NO_BORDER);
        cellHeader7.setBorderTop(Border.NO_BORDER);
        cellHeader7.setBorderBottom(Border.NO_BORDER);
        tableHeader6.addCell(cellHeader7);
     // 7th row of  second cell header ends
        
      //8th row of the header
        Table tableHeader8 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader8.setMarginTop(0);
        tableHeader8.setMarginBottom(0);

       
        Cell cellHeader8 = new Cell().add(new Paragraph("Date Of Invoice   :     04-03-2021"));
        cellHeader8.setTextAlignment(TextAlignment.LEFT);
        cellHeader8.setPaddingRight(-25);
        cellHeader8.setBorderRight(Border.NO_BORDER);
        cellHeader8.setBorderTop(Border.NO_BORDER);
        cellHeader8.setBorderBottom(Border.NO_BORDER);
       
        tableHeader8.addCell(cellHeader8);
     // 8th row of header ends
        
      //8th row of second cell header
        Cell cellHeader9 = new Cell().add(new Paragraph("Vehicle No  :  AP04UB2538"));
        cellHeader9.setTextAlignment(TextAlignment.LEFT);
        //cellHeader9.setPaddingLeft(27);
        cellHeader9.setBorderTop(Border.NO_BORDER);
        cellHeader9.setBorderBottom(Border.NO_BORDER);
        cellHeader9.setWidth(-1);
        tableHeader8.addCell(cellHeader9);
     // 8th row of second cell header ends
        
        
      //10th row of the header
        Table tableHeader10 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader10.setMarginTop(0);
        tableHeader10.setMarginBottom(0);

       
        Cell cellHeader10 = new Cell().add(new Paragraph("Place Of Supply  :     Karnataka(29)"));
        cellHeader10.setTextAlignment(TextAlignment.LEFT);
        cellHeader10.setPaddingRight(-83);
        cellHeader10.setBorderTop(Border.NO_BORDER);
        cellHeader10.setBorderBottom(Border.NO_BORDER);
       
        tableHeader10.addCell(cellHeader10);
     // 10th row of header ends
        
      //10th row of second cell header
        
        Cell cellHeader11 = new Cell().add(new Paragraph("Station  :  UDVALLI"));
        cellHeader11.setTextAlignment(TextAlignment.LEFT);
        cellHeader11.setBorderTop(Border.NO_BORDER);
        cellHeader11.setBorderBottom(Border.NO_BORDER);
       
        tableHeader10.addCell(cellHeader11);
     // 10th row of second cell header ends
        
      //11th row of the header
        Table tableHeader12 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader12.setMarginTop(0);
        tableHeader12.setMarginBottom(0);

       
        Cell cellHeader12 = new Cell().add(new Paragraph("Reverse Charge  :     N"));
        cellHeader12.setTextAlignment(TextAlignment.LEFT);
        cellHeader12.setPaddingRight(-20);
        cellHeader12.setBorderTop(Border.NO_BORDER);
        cellHeader12.setBorderBottom(Border.NO_BORDER);
       
        tableHeader12.addCell(cellHeader12);
     // 11th row of header ends
        
      //11th row of second cell header
        
        Cell cellHeader13 = new Cell().add(new Paragraph("E-Way Bill No       :"));
        cellHeader13.setTextAlignment(TextAlignment.LEFT);
        cellHeader13.setBorderLeft(Border.NO_BORDER);
        cellHeader13.setBorderTop(Border.NO_BORDER);
        cellHeader13.setBorderBottom(Border.NO_BORDER);
       
        tableHeader12.addCell(cellHeader13);
     // 11th row of second cell header ends
        
       //12 th row header
      
        Table tableHeader13 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader13.setMarginTop(0);
        tableHeader13.setMarginBottom(0);

       
        Cell cellHeader14 = new Cell().add(new Paragraph("GR/RR NO          :"));
        cellHeader14.setTextAlignment(TextAlignment.LEFT);
        cellHeader14.setPaddingLeft(2);
        cellHeader14.setBorderTop(Border.NO_BORDER);
       cellHeader14.setBorderRight(Border.NO_BORDER);
       
        tableHeader13.addCell(cellHeader14);
     //   12th row of header ends
        
      // 12th row of second cell
        
        Cell cellHeader15 = new Cell().add(new Paragraph(""));
        cellHeader15.setTextAlignment(TextAlignment.LEFT);
        cellHeader15.setPaddingLeft(99);
        cellHeader15.setBorderTop(Border.NO_BORDER);
       
        tableHeader13.addCell(cellHeader15);
     // 12th row of second cell ends
        
      //13 th row header
        
        Table tableHeader14 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader14.setMarginTop(0);
        tableHeader14.setMarginBottom(0);

       
        Cell cellHeader16 = new Cell().add(new Paragraph("  Billed To      :"));
        cellHeader16.setTextAlignment(TextAlignment.LEFT);
        cellHeader16.setPaddingRight(8);
        cellHeader16.setBorderTop(Border.NO_BORDER);
        cellHeader16.setBorderBottom(Border.NO_BORDER);
       
        tableHeader14.addCell(cellHeader16);
     //   13th row of header ends
        
      // 13th row of second cell
        
        Cell cellHeader17 = new Cell().add(new Paragraph("     Shipped To    :"));
        cellHeader17.setTextAlignment(TextAlignment.LEFT);
        cellHeader17.setPaddingLeft(0);
        cellHeader17.setBorderTop(Border.NO_BORDER);
        cellHeader17.setBorderBottom(Border.NO_BORDER);
       
        tableHeader14.addCell(cellHeader17);
     // 13th row of second cell ends
     
     //14 th row header
        
        Table tableHeader15 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader15.setMarginTop(0);
        tableHeader15.setMarginBottom(0);

       
        Cell cellHeader18 = new Cell().add(new Paragraph("YASHASWI GROUPS"));
        cellHeader18.setTextAlignment(TextAlignment.LEFT);
        cellHeader18.setBorderTop(Border.NO_BORDER);
        cellHeader18.setBorderBottom(Border.NO_BORDER);
       
        tableHeader15.addCell(cellHeader18);
     //   14th row of header ends
        
      // 14th row of second cell
        
        Cell cellHeader19 = new Cell().add(new Paragraph("YASHASWI GROUPS"));
        cellHeader19.setTextAlignment(TextAlignment.LEFT);
        cellHeader19.setBorderTop(Border.NO_BORDER);
        cellHeader19.setBorderBottom(Border.NO_BORDER);
       
        tableHeader15.addCell(cellHeader19);
     // 14th row of second cell ends
      
    //15 th row header
        
        Table tableHeader16 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader16.setMarginTop(0);
        tableHeader16.setMarginBottom(0);

       
        Cell cellHeader20 = new Cell().add(new Paragraph("UDVALLI, HIRIYUR"));
        cellHeader20.setTextAlignment(TextAlignment.LEFT);
        cellHeader20.setPaddingBottom(40);
        cellHeader20.setBorderTop(Border.NO_BORDER);
        cellHeader20.setBorderBottom(Border.NO_BORDER);
       
        tableHeader16.addCell(cellHeader20);
     //   15th row of header ends
        
      // 15th row of second cell
        
        Cell cellHeader21 = new Cell().add(new Paragraph("UDVALLI, HIRIYUR"));
        cellHeader21.setTextAlignment(TextAlignment.LEFT);
        cellHeader21.setBorderTop(Border.NO_BORDER);
        cellHeader21.setBorderBottom(Border.NO_BORDER);
       
        tableHeader16.addCell(cellHeader21);
     // 15th row of second cell ends
        
     //16 th row header
        
        Table tableHeader17 = new Table(new float[2]).useAllAvailableWidth();
        tableHeader17.setMarginTop(0);
        tableHeader17.setMarginBottom(0);

       
        Cell cellHeader22 = new Cell().add(new Paragraph("GSTIN/UIN  :  29FDXPS2186G1ZK"));
        cellHeader22.setTextAlignment(TextAlignment.LEFT);
        cellHeader22.setBorderTop(Border.NO_BORDER);
       
        tableHeader17.addCell(cellHeader22);
     //   16th row of header ends
        
      // 16th row of second cell
        
        Cell cellHeader23 = new Cell().add(new Paragraph("GSTIN/UIN  :  29FDXPS2186G1ZK"));
        cellHeader23.setTextAlignment(TextAlignment.LEFT);
        cellHeader23.setBorderTop(Border.NO_BORDER);
       
        tableHeader17.addCell(cellHeader23);
     // 16th row of second cell ends
        
//16 th row header
        
        Table tableHeader18 = new Table(new float[11]).useAllAvailableWidth();
        tableHeader18.setMarginTop(0);
        tableHeader18.setMarginBottom(0);

        
       
        Cell cellHeader24 = new Cell().add(new Paragraph("S.N"));
        cellHeader24.setTextAlignment(TextAlignment.LEFT);
        cellHeader24.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader24);
         
     //   16th row of header ends
        
      // 17th row of second cell
        
        Cell cellHeader25 = new Cell().add(new Paragraph("Description Of Goods"));
        cellHeader25.setTextAlignment(TextAlignment.LEFT);
        cellHeader25.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader25);
     // 17th row of second cell ends
        
// 17th row of third cell
        
        Cell cellHeader26 = new Cell().add(new Paragraph("HSN/SAC Code"));
        cellHeader26.setTextAlignment(TextAlignment.LEFT);
        cellHeader26.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader26);
     // 17th row of third cell ends
      
// 17th row of 4th cell
        
        Cell cellHeader27 = new Cell().add(new Paragraph("Qty"));
        cellHeader27.setTextAlignment(TextAlignment.LEFT);
        cellHeader27.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader27);
     // 17th row of 4th cell ends
        
// 17th row of 5th cell
        
        Cell cellHeader28 = new Cell().add(new Paragraph("Unit"));
        cellHeader28.setTextAlignment(TextAlignment.LEFT);
        cellHeader28.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader28);
     // 17th row of 5th cell ends
      
        
// 17th row of 6th cell
        
        Cell cellHeader29 = new Cell().add(new Paragraph("Price"));
        cellHeader29.setTextAlignment(TextAlignment.LEFT);
        cellHeader29.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader29);
     // 17th row of 6th cell ends
        
// 17th row of 7th cell
        
        Cell cellHeader30 = new Cell().add(new Paragraph("CGST Rate"));
        cellHeader30.setTextAlignment(TextAlignment.LEFT);
        cellHeader30.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader30);
     // 17th row of 7th cell ends
        
// 17th row of 8th cell
        
        Cell cellHeader31 = new Cell().add(new Paragraph("CGST Amount"));
        cellHeader31.setTextAlignment(TextAlignment.LEFT);
        cellHeader31.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader31);
     // 17th row of 8th cell ends
        
// 17th row of 9th cell
        
        Cell cellHeader32 = new Cell().add(new Paragraph("SGST Rate"));
        cellHeader32.setTextAlignment(TextAlignment.LEFT);
        cellHeader32.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader32);
     // 17th row of 8th cell ends
        
// 17th row of 10th cell
        
        Cell cellHeader33 = new Cell().add(new Paragraph("SGST Amount"));
        cellHeader33.setTextAlignment(TextAlignment.LEFT);
        cellHeader33.setBorderTop(Border.NO_BORDER);
        tableHeader18.addCell(cellHeader33);
     // 17th row of 10th cell ends
        
// 17th row of 11th cell
        
        Cell cellHeader34 = new Cell().add(new Paragraph("Amount()"));
        cellHeader34.setTextAlignment(TextAlignment.LEFT);
        cellHeader34.setBorderTop(Border.NO_BORDER);
       
        tableHeader18.addCell(cellHeader34);
     // 17th row of 11th cell ends
      
        
        Table tableHeader19 = new Table(new float[11]).useAllAvailableWidth();
        tableHeader19.setMarginTop(0);
        tableHeader19.setMarginBottom(0);
        
// 18th row of 1st cell
        
        Cell cellHeader35 = new Cell().add(new Paragraph("   "));
        cellHeader35.setTextAlignment(TextAlignment.LEFT);
        cellHeader35.setPaddingBottom(110);
        cellHeader35.setBorderTop(Border.NO_BORDER);
        cellHeader35.setBorderRight(Border.NO_BORDER);
       
        tableHeader19.addCell(cellHeader35);
     // 18th row of 1st cell ends
      
// 18th row of 2st cell
        
        Cell cellHeader36 = new Cell().add(new Paragraph("                    "));
        cellHeader36.setTextAlignment(TextAlignment.LEFT);
        cellHeader36.setPaddingBottom(60);
        cellHeader36.setBorderTop(Border.NO_BORDER);
        cellHeader36.setBorderLeft(Border.NO_BORDER);
        cellHeader36.setBorderRight(Border.NO_BORDER);
       
        tableHeader19.addCell(cellHeader36);
     // 18th row of 2st cell ends
        

        
// 18th row of 3st cell
        
        Cell cellHeader37 = new Cell().add(new Paragraph("            "));
        cellHeader37.setTextAlignment(TextAlignment.LEFT);
        cellHeader37.setPaddingBottom(60);
        cellHeader37.setBorderTop(Border.NO_BORDER);
        cellHeader37.setBorderLeft(Border.NO_BORDER);
        cellHeader37.setBorderRight(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader37);
     // 18th row of 3st cell ends
        
// 18th row of 4st cell
        
        Cell cellHeader38 = new Cell().add(new Paragraph("   "));
        cellHeader38.setTextAlignment(TextAlignment.LEFT);
        cellHeader38.setPaddingBottom(60);
        cellHeader38.setBorderTop(Border.NO_BORDER);
        cellHeader38.setBorderRight(Border.NO_BORDER);
        cellHeader38.setBorderLeft(Border.NO_BORDER);
     // 18th row of 4st cell ends
        
// 18th row of 5st cell
        
        Cell cellHeader39 = new Cell().add(new Paragraph("    "));
        cellHeader39.setTextAlignment(TextAlignment.LEFT);
        cellHeader39.setPaddingBottom(60);
        cellHeader39.setBorderTop(Border.NO_BORDER);
        cellHeader39.setBorderRight(Border.NO_BORDER);
        cellHeader39.setBorderLeft(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader39);
     // 18th row of 5st cell ends
        
// 18th row of 6st cell
        
        Cell cellHeader40 = new Cell().add(new Paragraph("     "));
        cellHeader40.setTextAlignment(TextAlignment.LEFT);
        cellHeader40.setPaddingBottom(60);
        cellHeader40.setBorderTop(Border.NO_BORDER);
        cellHeader40.setBorderLeft(Border.NO_BORDER);
        cellHeader40.setBorderRight(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader40);
     // 18th row of 6st cell ends
        
// 18th row of 7st cell
        
        Cell cellHeader41 = new Cell().add(new Paragraph("         "));
        cellHeader41.setTextAlignment(TextAlignment.LEFT);
        cellHeader41.setPaddingBottom(60);
        cellHeader41.setBorderTop(Border.NO_BORDER);
        cellHeader41.setBorderLeft(Border.NO_BORDER);
        cellHeader41.setBorderRight(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader41);
     // 18th row of 7st cell ends
        
// 18th row of 8st cell
        
        Cell cellHeader42 = new Cell().add(new Paragraph("           "));
        cellHeader42.setTextAlignment(TextAlignment.LEFT);
        cellHeader42.setPaddingBottom(60);
        cellHeader42.setBorderTop(Border.NO_BORDER);
        cellHeader42.setBorderRight(Border.NO_BORDER);
        cellHeader42.setBorderLeft(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader42);
     // 18th row of 8st cell ends
        
// 18th row of 9st cell
        
        Cell cellHeader43 = new Cell().add(new Paragraph("         "));
        cellHeader43.setTextAlignment(TextAlignment.LEFT);
        cellHeader43.setPaddingBottom(60);
        cellHeader43.setBorderTop(Border.NO_BORDER);
        cellHeader43.setBorderLeft(Border.NO_BORDER);
        cellHeader43.setBorderRight(Border.NO_BORDER);
       
        tableHeader19.addCell(cellHeader43);
     // 18th row of 9st cell ends
        
// 18th row of 10st cell
        
        Cell cellHeader44 = new Cell().add(new Paragraph("           "));
        cellHeader44.setTextAlignment(TextAlignment.LEFT);
        cellHeader44.setPaddingBottom(60);
        cellHeader44.setBorderTop(Border.NO_BORDER);
        cellHeader44.setBorderRight(Border.NO_BORDER);
        cellHeader44.setBorderLeft(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader44);
     // 18th row of 10st cell ends
        
// 18th row of 11st cell
        
        Cell cellHeader45 = new Cell().add(new Paragraph("        "));
        cellHeader45.setTextAlignment(TextAlignment.LEFT);
        cellHeader45.setPaddingBottom(60);
        cellHeader45.setBorderTop(Border.NO_BORDER);
        cellHeader45.setBorderLeft(Border.NO_BORDER);
        tableHeader19.addCell(cellHeader45);
     // 18th row of 11st cell ends
        
        Table tableHeader20 = new Table(new float[10]).useAllAvailableWidth();
        tableHeader20.setMarginTop(0);
        tableHeader20.setMarginBottom(0);

        // 19 th  row
        Cell cellHeader46 = new Cell().add(new Paragraph("Grand Total  :"));
        cellHeader46.setUnderline();
        cellHeader46.setPadding(5);
        cellHeader46.setTextAlignment(TextAlignment.CENTER);
        cellHeader46.setBorderRight(Border.NO_BORDER);
        cellHeader46.setBorderBottom(Border.NO_BORDER);
        cellHeader46.setBorderTop(Border.NO_BORDER);
        tableHeader20.addCell(cellHeader46);
        // 19 th row second cell
        Cell cellHeaderRight1 = new Cell().add(new Paragraph(""));
        cellHeaderRight1.setTextAlignment(TextAlignment.RIGHT);
       // cellHeaderRight1.setBorderBottom(Border.NO_BORDER);
        //cellHeaderRight1.setBorderLeft(Border.NO_BORDER);
        cellHeaderRight1.setBorderTop(Border.NO_BORDER);
        tableHeader20.addCell(cellHeaderRight1);
       //19th row second cell ends
        
      
        Table tableHeader21 = new Table(new float[10]).useAllAvailableWidth();
        tableHeader21.setMarginTop(0);
        tableHeader21.setMarginBottom(0);
        
     // 19 th  row
        Cell cellHeader47 = new Cell().add(new Paragraph("Tax Rate"));
        cellHeader47.setUnderline();
        cellHeader47.setTextAlignment(TextAlignment.LEFT);
        cellHeader47.setBorderRight(Border.NO_BORDER);
        cellHeader47.setBorderTop(Border.NO_BORDER);
        cellHeader47.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader47);
        
        // 19 th row second cell
        Cell cellHeader48 = new Cell().add(new Paragraph("Taxable Amt"));
        cellHeader48.setTextAlignment(TextAlignment.LEFT);
        cellHeader48.setUnderline();
        cellHeader48.setBorderRight(Border.NO_BORDER);
        cellHeader48.setBorderLeft(Border.NO_BORDER);
        cellHeader48.setBorderTop(Border.NO_BORDER);
        cellHeader48.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader48);
       //19th row second cell ends
        
     // 19 th row 3rd cell
        Cell cellHeader49 = new Cell().add(new Paragraph("CGST Amt"));
        cellHeader49.setTextAlignment(TextAlignment.LEFT);
        cellHeader49.setUnderline();
        cellHeader49.setBorderRight(Border.NO_BORDER);
        cellHeader49.setBorderLeft(Border.NO_BORDER);
        cellHeader49.setBorderTop(Border.NO_BORDER);
        cellHeader49.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader49);
       //19th row 3rd cell ends
        
     // 19 th row second cell
        Cell cellHeader50 = new Cell().add(new Paragraph("SGST Amt"));
        cellHeader50.setTextAlignment(TextAlignment.LEFT);
        cellHeader50.setUnderline();
        cellHeader50.setBorderRight(Border.NO_BORDER);
        cellHeader50.setBorderLeft(Border.NO_BORDER);
        cellHeader50.setBorderTop(Border.NO_BORDER);
        cellHeader50.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader50);
       //19th row second cell ends
        
     // 19 th row second cell
        Cell cellHeader52 = new Cell().add(new Paragraph("Total Amt"));
        cellHeader52.setTextAlignment(TextAlignment.LEFT);
        cellHeader52.setUnderline();
        cellHeader52.setBorderRight(Border.NO_BORDER);
        cellHeader52.setBorderLeft(Border.NO_BORDER);
        cellHeader52.setBorderTop(Border.NO_BORDER);
        cellHeader52.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader52);
       //19th row second cell ends
        
     // 19 th row second cell
        Cell cellHeader53 = new Cell().add(new Paragraph(""));
        cellHeader53.setTextAlignment(TextAlignment.LEFT);
        cellHeader53.setBorderRight(Border.NO_BORDER);
        cellHeader53.setBorderLeft(Border.NO_BORDER);
        cellHeader53.setBorderTop(Border.NO_BORDER);
        cellHeader53.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader53);
       //19th row second cell ends
        
     // 19 th row second cell
        Cell cellHeader54 = new Cell().add(new Paragraph(""));
        cellHeader54.setTextAlignment(TextAlignment.LEFT);
        cellHeader54.setBorderLeft(Border.NO_BORDER);
        cellHeader54.setBorderTop(Border.NO_BORDER);
        cellHeader54.setBorderBottom(Border.NO_BORDER);
        tableHeader21.addCell(cellHeader54);
       //19th row second cell ends
        
        Table tableHeader22 = new Table(new float[10]).useAllAvailableWidth();
        tableHeader22.setMarginTop(0);
        tableHeader22.setMarginBottom(0);
        
     // 20 th row 1st cell to enter tax rate
        Cell cellHeader55 = new Cell().add(new Paragraph(""));
        cellHeader55.setTextAlignment(TextAlignment.LEFT);
        cellHeader55.setPadding(20);
        cellHeader55.setBorderRight(Border.NO_BORDER);
        cellHeader55.setBorderTop(Border.NO_BORDER);
        cellHeader55.setBorderBottom(Border.NO_BORDER);
        tableHeader22.addCell(cellHeader55);
       //20th row 1st cell ends
        
     // 20 th row second cell to enter taxable amt
        Cell cellHeader56 = new Cell().add(new Paragraph(""));
        cellHeader56.setTextAlignment(TextAlignment.LEFT);
        cellHeader56.setBorderRight(Border.NO_BORDER);
        cellHeader56.setBorderLeft(Border.NO_BORDER);
        cellHeader56.setBorderTop(Border.NO_BORDER);
        cellHeader56.setBorderBottom(Border.NO_BORDER);
        tableHeader22.addCell(cellHeader56);
       //20th row second cell ends
        
     // 20 th row 3rd cell to enter CGST amt
        Cell cellHeader57 = new Cell().add(new Paragraph(""));
        cellHeader57.setTextAlignment(TextAlignment.LEFT);
        cellHeader57.setBorderRight(Border.NO_BORDER);
        cellHeader57.setBorderLeft(Border.NO_BORDER);
        cellHeader57.setBorderTop(Border.NO_BORDER);
        cellHeader57.setBorderBottom(Border.NO_BORDER);
        tableHeader22.addCell(cellHeader57);
       //19th row second cell ends
        
     // 20 th row 4th cell to enter SGST Amt
        Cell cellHeader58 = new Cell().add(new Paragraph(""));
        cellHeader58.setTextAlignment(TextAlignment.LEFT);
        cellHeader58.setBorderRight(Border.NO_BORDER);
        cellHeader58.setBorderLeft(Border.NO_BORDER);
        cellHeader58.setBorderTop(Border.NO_BORDER);
        cellHeader58.setBorderBottom(Border.NO_BORDER);
        tableHeader22.addCell(cellHeader58);
       //20th row 4th cell ends
        
        // 20 th row 5th cell to enter total Amt
        Cell cellHeader59 = new Cell().add(new Paragraph(""));
        cellHeader59.setTextAlignment(TextAlignment.LEFT);
        cellHeader59.setBorderRight(Border.NO_BORDER);
        cellHeader59.setBorderLeft(Border.NO_BORDER);
        cellHeader59.setBorderTop(Border.NO_BORDER);
        cellHeader59.setBorderBottom(Border.NO_BORDER);
        tableHeader22.addCell(cellHeader59);
       //20th row 5th cell ends
        
     // 20 th row 6th cell 
        Cell cellHeader60 = new Cell().add(new Paragraph(""));
        cellHeader60.setTextAlignment(TextAlignment.LEFT);
        cellHeader60.setBorderLeft(Border.NO_BORDER);
        cellHeader60.setBorderTop(Border.NO_BORDER);
        cellHeader60.setBorderBottom(Border.NO_BORDER);
        tableHeader22.addCell(cellHeader60);
       //20th row 6th cell ends
        
        
        Table tableHeader23 = new Table(new float[1]).useAllAvailableWidth();
        tableHeader23.setMarginTop(0);
        tableHeader23.setMarginBottom(0);
        
     // 20 th row second cell
        Cell cellHeader61 = new Cell().add(new Paragraph("Amount in words"));
        cellHeader61.setTextAlignment(TextAlignment.LEFT);
        cellHeader61.setBorderTop(Border.NO_BORDER);
        tableHeader23.addCell(cellHeader61);
       //20th row second cell ends

        Table tableHeader24 = new Table(new float[1]).useAllAvailableWidth();
        tableHeader24.setMarginTop(0);
        tableHeader24.setMarginBottom(0);
        
     // 20 th row 1st cell to enter tax rate
        Cell cellHeader62 = new Cell().add(new Paragraph("Bank Details   :   A/C NO  :   54920200001471 BANK OF BARODA                                                                IFSC CODE : BARBOHIRIYU  "));
        cellHeader62.setTextAlignment(TextAlignment.LEFT);
        cellHeader62.setBorderTop(Border.NO_BORDER);
         tableHeader24.addCell(cellHeader62);
       //20th row 1st cell ends
        
         Table tableHeader25 = new Table(new float[2]).useAllAvailableWidth();
         tableHeader25.setMarginTop(0);
         tableHeader25.setMarginBottom(0);
         
         // 21 th row 1st cell
         Cell cellHeader63 = new Cell().add(new Paragraph("Terms and Conditions"));
         cellHeader63.setUnderline();
         cellHeader63.setFontSize(10);
         cellHeader63.setTextAlignment(TextAlignment.LEFT);
         cellHeader63.setBorderBottom(Border.NO_BORDER);
         cellHeader63.setBorderTop(Border.NO_BORDER);
           tableHeader25.addCell(cellHeader63);
        //21th row 1th cell ends
         
      // 21 th row 2th cell 
         Cell cellHeader64 = new Cell().add(new Paragraph("Receivers Signature  :"));
         cellHeader64.setTextAlignment(TextAlignment.LEFT);
         cellHeader64.setFontSize(10);
         cellHeader64.setBorderBottom(Border.NO_BORDER);
         cellHeader64.setBorderTop(Border.NO_BORDER);
          tableHeader25.addCell(cellHeader64);
        //21th row 2th cell ends
          
          Table tableHeader26 = new Table(new float[2]).useAllAvailableWidth();
          tableHeader26.setMarginTop(0);
          tableHeader26.setMarginBottom(0);
          
          // 22 th row 1th cell to enter total Amt
          Cell cellHeader65 = new Cell().add(new Paragraph("E. and O.E"));
          cellHeader65.setTextAlignment(TextAlignment.LEFT);
          //cellHeader65.setPaddingRight(-57);
          cellHeader65.setBorderTop(Border.NO_BORDER);
          cellHeader65.setBorderBottom(Border.NO_BORDER);
          tableHeader26.addCell(cellHeader65);
         //22th row 1th cell ends
          
       // 22 th row2th cell 
          Cell cellHeader66 = new Cell().add(new Paragraph(""));
          cellHeader66.setTextAlignment(TextAlignment.LEFT);
          cellHeader66.setPaddingLeft(61);
          cellHeader66.setBorderTop(Border.NO_BORDER);
          tableHeader26.addCell(cellHeader66);
         //22th row 2th cell ends
        
//23th row 1th cell ends
          
          Table tableHeader27 = new Table(new float[2]).useAllAvailableWidth();
          tableHeader27.setMarginTop(0);
          tableHeader27.setMarginBottom(0);
          
          // 23 th row 1th cell to enter total Amt
          Cell cellHeader67 = new Cell().add(new Paragraph("1.Goods once sold will not be taken back or Exchanged")).add(new Paragraph("2.Our responsibility is that once goods leave our premises only")).add(new Paragraph("3.Subject to Hiriyur Jurisdiction only."));
          cellHeader67.setFontSize(10);
          cellHeader67.setPaddingBottom(30);
          //cellHeader67.setPaddingRight(25);
          cellHeader67.setTextAlignment(TextAlignment.LEFT);
          cellHeader67.setBorderTop(Border.NO_BORDER);
          cellHeader67.setBorderBottom(Border.NO_BORDER);
          
          tableHeader27.addCell(cellHeader67);
         //23th row 1th cell ends
          
       // 23 th row2th cell 
          Cell cellHeader68 = new Cell().add(new Paragraph(" for MHC BUILDERS AND DEVELOPERS"));
          cellHeader68.setTextAlignment(TextAlignment.RIGHT);
          cellHeader68.setPaddingRight(60);
          cellHeader68.setBorderLeft(Border.NO_BORDER);
          cellHeader68.setBorderTop(Border.NO_BORDER);
          cellHeader68.setBorderBottom(Border.NO_BORDER);
          tableHeader27.addCell(cellHeader68);
         //23th row 2th cell ends
          
//24th row 1th cell ends
          
          Table tableHeader28 = new Table(new float[2]).useAllAvailableWidth();
          tableHeader28.setMarginTop(0);
          tableHeader28.setMarginBottom(0);
          
          // 24 th row 1th cell to enter total Amt
          Cell cellHeader69 = new Cell().add(new Paragraph(""));
          cellHeader69.setTextAlignment(TextAlignment.LEFT);
          cellHeader69.setPaddingRight(116);
          cellHeader69.setBorderTop(Border.NO_BORDER);
          tableHeader28.addCell(cellHeader69);
         //23th row 1th cell ends
          
       // 24 th row2th cell 
          Cell cellHeader70 = new Cell().add(new Paragraph("Authorised Signatory "));
          cellHeader70.setTextAlignment(TextAlignment.RIGHT);
          cellHeader70.setBorderTop(Border.NO_BORDER);
          tableHeader28.addCell(cellHeader70);
         //24th row 2th cell ends
          
        Table table = new Table(new float[1]).useAllAvailableWidth();
        table.setMarginTop(0);
        table.setMarginBottom(0);
		
        doc.add(tableHeader);
        doc.add(tableHeader1);
        doc.add(tableHeader2);
        doc.add(tableHeader3);
        doc.add(tableHeader4);
        doc.add(tableHeader5);
        doc.add(tableHeader6);
        //doc.add(tableHeader7);
        doc.add(tableHeader8);
       // doc.add(tableHeader9);
        doc.add(tableHeader10);
       //// doc.add(tableHeader11);
        doc.add(tableHeader12);
        doc.add(tableHeader13);
        doc.add(tableHeader14);
        doc.add(tableHeader15);
        doc.add(tableHeader16);
        doc.add(tableHeader17);
        doc.add(tableHeader18);
        doc.add(tableHeader19);
        doc.add(tableHeader20);
        doc.add(tableHeader21);
        doc.add(tableHeader22);
        doc.add(tableHeader23);
        doc.add(tableHeader24);
        doc.add(tableHeader25);
        doc.add(tableHeader26);
        doc.add(tableHeader27);
        doc.add(tableHeader28);
        
        //doc.add(tableContent);
        //doc.add(tableContent1);
        doc.add(table);

        doc.close();
    }
}

