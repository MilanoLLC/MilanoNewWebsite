package com.milanopalace.website.productionWebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;


@RestController
public class SitemapController {

	@RequestMapping("/sitemap.xml")
    @GetMapping(produces = "application/xml")
    public String getSitemap() {
        // Replace this with your actual sitemap XML content
        String sitemapXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
        		+ "<urlset\r\n"
        		+ "      xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\"\r\n"
        		+ "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n"
        		+ "      xsi:schemaLocation=\"http://www.sitemaps.org/schemas/sitemap/0.9\r\n"
        		+ "            http://www.sitemaps.org/schemas/sitemap/0.9/sitemap.xsd\">\r\n"
        		+ "<!-- created with Free Online Sitemap Generator www.xml-sitemaps.com -->\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>1.00</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/index</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/events</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/wedding</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/itSolutions</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/marketingWd</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/marketingApps</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/about</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "<url>\r\n"
        		+ "  <loc>https://milanollc.com/contact</loc>\r\n"
        		+ "  <lastmod>2023-10-04T08:23:23+00:00</lastmod>\r\n"
        		+ "  <priority>0.80</priority>\r\n"
        		+ "</url>\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "</urlset>";
        return sitemapXml; 
    }   
      
    @GetMapping(value = "/xmlfile", produces = MediaType.APPLICATION_XML_VALUE)
    public Resource getXMLFile() {
        // Load the XML file from the resources directory
        Resource xmlFile = new ClassPathResource("sitemap.xml");
        
        return xmlFile;
    }    
         
  
      
} 
