package com.example.project3.scraper;

import com.example.project3.model.Company;
import com.example.project3.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);

    ScrapedResult scrap(Company company);
}
