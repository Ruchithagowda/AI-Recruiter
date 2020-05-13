package com.java.ai.pdfcrawler;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PDFCrawler {
	
	public static void main(String[] args) {
		
		Document doc = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the url");		
		String url = input.next();
		
		url += "http://" + url;
		
		try {
			doc = Jsoup.connect(url).get();
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