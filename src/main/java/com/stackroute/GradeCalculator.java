package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeCalculator {

	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores) {
		
		if(scores==null) {
			return null;
		}
		Map<Integer, String> grade=new TreeMap<>();
		for (Map.Entry<Integer,Integer> entry : scores.entrySet()) {  
			
			if(entry.getValue()>100) {
			
			}else if(entry.getValue()>=80) {
				grade.put(entry.getKey(), "A");
			}else if(entry.getValue()>=60) {
				grade.put(entry.getKey(), "B");
			}else if(entry.getValue()>=45) {
				grade.put(entry.getKey(), "C");
			}else {
				grade.put(entry.getKey(), "D");
			}
           
		}
  	return grade;
	}

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
    	Scanner scan=new Scanner(System.in);
    	int numberOfStudent=Integer.parseInt(scan.nextLine()) ;
    	List<String> studentRecord=new ArrayList<>(); 
    	for(int i=0;i<numberOfStudent;i++) {
    		studentRecord.add(scan.nextLine());
    	}
    	Map<Integer, Integer> studentMarks=new HashMap<>();
    	for (String string : studentRecord) {
			String[] data=string.split(" ");
			studentMarks.put(Integer.parseInt(data[0]), Integer.parseInt(data[1]));	
		}
    	
    	Map<Integer, String> grade=calculateGrade(studentMarks);
    	for (Map.Entry<Integer,String> entry : grade.entrySet()) {  
    	System.out.println(entry.getKey()+" "+entry.getValue());
    	}
	}
}