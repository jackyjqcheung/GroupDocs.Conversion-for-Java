package com.groupdocs.conversion.examples.advanced_usage.loading.load_options_by_document_type.spreadsheet;

import com.groupdocs.conversion.Converter;
import com.groupdocs.conversion.examples.Constants;
import com.groupdocs.conversion.options.convert.PdfConvertOptions;
import com.groupdocs.conversion.options.load.SpreadsheetLoadOptions;

import java.io.File;

/**
* This example demonstrates how to convert a spreadsheet document to pdf with advanced options
*/
public class ConvertSpreadsheetBySpecifyingRange {
    public static void run()
    {
        String convertedFile = Constants.getConvertedPath("ConvertSpreadsheetBySpecifyingRange.pdf");  
        SpreadsheetLoadOptions loadOptions = new SpreadsheetLoadOptions();
        loadOptions.setConvertRange("10:30");
        loadOptions.setOnePagePerSheet(true);
        Converter converter = new Converter(Constants.SAMPLE_XLSX, loadOptions);
        PdfConvertOptions options = new PdfConvertOptions();
        converter.convert(convertedFile, options);

        System.out.print("\nSpreadsheet document converted successfully. \nCheck output in "+ convertedFile);
    }
}