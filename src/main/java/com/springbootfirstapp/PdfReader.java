package com.springbootfirstapp;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdfReader {

	@GetMapping("/pdfreader")
	public String pdfreader() {
	
		try {
			PDDocument document = PDDocument.load(new File("E:\\Danny\\test_folder\\test_doc.pdf"));
			//File file = new File("E:\\Danny\\test_folder\\test_doc.pdf");
			//PDDocument document = Loader.loadPDF(file);		
			PDFTextStripper pdftext = new PDFTextStripper();
			String pdftextdata = pdftext.getText(document);
			System.out.println(pdftextdata);
			} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		//return pdftextdata;
		return null;
	}
}
