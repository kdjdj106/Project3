package com.example.project3;

import com.example.project3.model.Company;
import com.example.project3.scraper.Scraper;
import com.example.project3.scraper.YahooFinanceScraper;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;

@SpringBootApplication
public class Project3Application {

    public static void main(String[] args) {
        SpringApplication.run(Project3Application.class, args);



    }

}
