package com.cg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//b)	Develop a utility for finding matches vs mismatches across two data sources (Reconciliation)
public class MatchVsMismatch 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
        BufferedReader TextFile1 = new BufferedReader(new FileReader("C:\\Users\\rheas\\eclipse-workspace\\JavaAssignment-pg2\\src\\com\\cg\\File1"));         
        BufferedReader TextFile2 = new BufferedReader(new FileReader("C:\\Users\\rheas\\eclipse-workspace\\JavaAssignment-pg2\\src\\com\\cg\\File2"));
         
        String content1= TextFile1.readLine();         
        String content2 = TextFile2.readLine();         
        boolean file = true;         
        int count = 1;
         
        while (content1!=null || content2!=null)
        {
            if(content1==null || content2==null)
            {
            	file = false;                 
                break;
            }
            else if(!content1.equalsIgnoreCase(content2))
            {
            	file = false;                 
                break;
            }
             
            content1 =TextFile1.readLine();             
            content2 = TextFile2.readLine();             
            count++;
        }
         
        if(file)
        {
            System.out.println("Data present in the two given sources matches.");
        }
        else
        {
            System.out.println("Data present in the two given sources does not match.");
            System.out.println("Data mismatch occured at line "+count);
            System.out.println("\n");
            System.out.println("Mismatched Data in File 1====="+content1);
            System.out.println("Mismatched Data in File 2====="+content2);
        }         
        TextFile1.close();         
        TextFile2.close();
	}

}
