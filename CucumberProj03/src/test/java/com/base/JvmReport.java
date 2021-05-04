package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	
		    public static void generateReport(String jsonFile){
	        Configuration config=new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "FacebookJvmReport");
	        config.addClassifications("Sprint", "24");
	        config.addClassifications("Browser", "Chrome");
	        config.addClassifications("OS", "Windows");
	        List<String> jsonFiles=new ArrayList<String>();
	        jsonFiles.add(jsonFile);
	        ReportBuilder builder=new ReportBuilder(jsonFiles, config);
	        builder.generateReports();
	    }
	}

