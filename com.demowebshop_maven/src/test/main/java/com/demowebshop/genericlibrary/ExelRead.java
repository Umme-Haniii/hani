package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		singlRead();

	}

	public static void singlRead() throws EncryptedDocumentException, IOException {
		File f = new File("./testdata/TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		int num_rows = s.getPhysicalNumberOfRows();
		System.out.println(num_rows);
		int num_cell = s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(num_cell);
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		System.out.println(c.toString());
		System.out.println(num_cell);
		System.out.println(num_rows);

	}
//	public static String[][] multipleRead() throws EncryptedDocumentException, IOException{
//	File f = new File("./testdata/TestData.xlsx");
//	FileInputStream fis = new FileInputStream(f);
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet s = wb.getSheet("Sheet1");
//	int row_size = s.getPhysicalNumberOfRows();
//	int col_size = s.getRow(0).getPhysicalNumberOfCells();
//	String[][]data=new String[row_size][col_size];
//	for(int i=1;i<row_size;i++) {
//		for(int j=1;j<row_size;j++) {
//		data[i][j]=s.getRow(i).getCell(j).toString();
//		}}
//	return data;}

	public static String[][] multipleRead() throws EncryptedDocumentException, IOException {
		File f = new File("./testdata/TestData.xlsx");
	FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("Sheet1");
		int row_size = s.getPhysicalNumberOfRows();
		int col_size = s.getRow(0).getPhysicalNumberOfCells();
		String[][]data=new String[row_size][col_size];
		for(int i=1;i<row_size;i++) {
			for(int j=1;j<row_size;j++) {
			data[i][j]=s.getRow(i).getCell(j).toString();		}}
	

		return data;
	}
}
