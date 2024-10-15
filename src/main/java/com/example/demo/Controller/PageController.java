package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.EmailSenderService;



@Controller
public class PageController {
	
	@Autowired
	private EmailSenderService senderService;
	
	 @GetMapping("/")
     public String homePage() {
	
		 return "eSihleConnections.html";
		 
	 }
	 
	 @PostMapping("/get-in-touch")
     public String sendEmail( @RequestParam("name")  String name ,  @RequestParam("email")  String email ,  @RequestParam("message")  String message  ) {
		 
	        // SEND EMAIL TO CLIENT
               
		 senderService.sendSimpleEmail(email, "eSihle Connections - no reply",
         "Dear " + name + ",\r\n"
         + "\r\n"
         + "I hope this email finds you well!\r\n"
         + "\r\n"
         + "Thank you for your interest, At eSihle Connections, we are committed to providing top-notch web solutions tailored to meet your business needs. Below is an overview of our services that can help elevate your online presence:\r\n"
         + "\r\n"
         + "Database Management\r\n"
         + "Secure data, with database backup\r\n"
         + "Availability: 24/7\r\n"
         + "Price: R350.00/month\r\n\n"
         + "Spring Boot Hosting\r\n"
         + "Reliable and Secure Hosting\r\n"
         + "Scalable Infrastructure\r\n"
         + "High-Performance Deployment\r\n"
         + "Price: R450.00/month\r\n\n"
         + "DNS Management\r\n"
         + "Reliable and secure domain name system\r\n"
         + "Fast propagation and resolution times\r\n"
         + "Price: R250.00/PAYN\r\n"
         + "Maintenance Services\r\n"
         + "Regular updates, Monitoring, Backup & Recovery\r\n"
         + "SEO Services\r\n"
         + "Price: R950.00/month\r\n\n"
         + "Web Development Packages\r\n"
         + "1. Basic Package\r\n"
         + "\r\n"
         + "Essential Features\r\n"
         + "Custom Design\r\n"
         + "Mobile-friendly and responsive design\r\n"
         + "5-page website (home, about, services, contact, etc.)\r\n"
         + "Perfect for small businesses\r\n"
         + "Price: R4800.00\r\n\n"
         + "2. Premium Package\r\n"
         + "\r\n"
         + "Fast Launch (3-4 weeks)\r\n"
         + "10-page website (home, about, services, contact, etc.)\r\n"
         + "Integrated SEO optimization and meta tags\r\n"
         + "3 months free hosting and preferred domain name\r\n"
         + "Price: R7000.00\r\n\n"
         + "3. Advanced Package\r\n"
         + "\r\n"
         + "Custom Search Functionality\r\n"
         + "Up to 15 pages (home, about, services, contact, etc.)\r\n"
         + "Advanced E-commerce Integration (online store, payment gateways)\r\n"
         + "6 months free hosting and preferred domain name\r\n"
         + "Price: R9500.00\r\n\n"
         + "4. Ultimate Package\r\n"
         + "\r\n"
         + "Includes all packages\r\n"
         + "Priority Development and Launch\r\n"
         + "Integration with CRM or ERP systems\r\n"
         + "API Integration (third-party services, e.g., shipping, inventory)\r\n"
         + "Let's talk!\r\n\n"
         + "We believe our offerings can significantly contribute to your business growth. If you're interested in any of these services or would like to discuss a custom solution, please don't hesitate to reach out.\r\n"
         + "\r\n"
         + "Thank you for considering eSihle Connections. Will get in touch with you!\r\n"
         + "\r\n"
         + "Warm regards,\r\n"
         + "\r\n"
         + "Sihle Sithole\r\n"
         + "CEO and Founder\r\n"
         + "esihleconnections.co.za");
		 
		 
	     // SEND EMAIL TO eSihleConnections
		 
		 senderService.sendSimpleEmail("esihleconnections@gmail.com", "Web development & Hosting - " + name,
		  "Dear eSihle Connections Team,\r\n"
		  + "\r\n"
		  + "I hope this message finds you well. My name is " + name + ", and I am interested in your services.\r\n"
		  + "\r\n"
		  + "Client Information:\r\n"
		  + "\r\n"
		  + "Name: " + name + "\r\n"
		  + "Email: " + email + "\r\n"
		  + "Message:\r\n"
		  +  message + "\r\n"
		  + "\r\n"
		  + "I look forward to your response and hope to discuss how we can work together.\r\n"
		  + "\r\n"
		  + "Best regards,\r\n"
		  + name + "\r\n"
		 );
		         

		 return "redirect:/";
		 
	 }
	 
	 

}
