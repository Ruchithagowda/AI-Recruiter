package com.java.ai.pdfcrawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PDFCrawler {
	
	public static void main(String[] args) {
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect("http://www.ssaurel.com/blog").get();
			String title = doc.title();
			System.out.println("Title : " + title);
			
			Elements links = doc.select("a[hred]");
			for(Element link : links) {
				System.out.println("\n Link : " + link.attr("href"));
				System.out.println("Text : "+ link.text());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}