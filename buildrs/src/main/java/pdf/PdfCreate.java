package pdf;

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Cell; 
import com.itextpdf.layout.element.Table;
import com.itextpdf.text.pdf.PdfPCell;  


public class PdfCreate {
	
	
    
 public static void main(String args[]) throws Exception {           
    // Creating a PdfDocument object   
    String dest = "D:\\TestFile.pdf";   
    PdfWriter writer = new PdfWriter(dest);       
       
    // Creating a PdfDocument object      
    PdfDocument pdf = new PdfDocument(writer);                  
    
    // Creating a Document object       
    Document doc = new Document(pdf);                       
       
    // Creating a table       
    float [] pointColumnWidths = {150F, 150F, 150F,150f,150f};   
    Table table = new Table(pointColumnWidths);    
    
    Cell c = new Cell();
    // Adding cells to the table    
    PdfPCell cell = new PdfPCell();
    //cell.addElement(element);
    table.addCell(new Cell());       
    table.addCell(new Cell());       
    table.addCell(new Cell());       
    table.addCell(new Cell());       
    table.addCell(new Cell());       
    table.addCell(new Cell());                 
       
    // Adding Table to document        
    doc.add(table);                  
       
    // Closing the document       
    doc.close();
    System.out.println("Table created successfully..");   
 }     		

}
