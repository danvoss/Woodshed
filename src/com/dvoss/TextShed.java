package com.dvoss;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Dan on 11/17/16.
 */

// thanks to tutorials.jenkov.com

public class TextShed {

    public static void main(String[] args) throws FileNotFoundException, DocumentException {

        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("textshed.pdf"));

        doc.open();

        doc.add(new Phrase("This is the opening sentence."));
        doc.add(new Phrase("This is the next sentence."));

        Paragraph paragraph = new Paragraph();
        paragraph.setAlignment(Element.ALIGN_CENTER);

        for (int i = 0; i < 5; i++) {
            Chunk chunk = new Chunk("Here is sentence number " + i + ".");
            paragraph.add(chunk);
        }

        doc.add(paragraph);

        Paragraph paragraph2 = new Paragraph();
        paragraph2.setAlignment(Element.ALIGN_RIGHT);

        Chunk chunk = new Chunk("Visit website.");
        chunk.setUnderline(0.1f, -2f);
        Anchor anchor = new Anchor(chunk);
        anchor.setReference("https://www.google.com/");
        paragraph2.add(anchor);

        doc.add(paragraph2);

        doc.close();

        System.out.println("Your PDF has been created.");
    }
}
