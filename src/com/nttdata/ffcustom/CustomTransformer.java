package com.nttdata.ffcustom;

import java.io.*;
import java.util.HashMap;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.*;
import com.blackbear.flatworm.converters.CoreConverters;

@SuppressWarnings("unused")
public class CustomTransformer {
    public static void main(String[] args) {
         ConfigurationReader parser = new ConfigurationReader();
         try {
             FileFormat ff = parser.loadConfigurationFile(args[0]);
             InputStream in = new FileInputStream(args[1]);
             BufferedReader bufIn = new BufferedReader(new InputStreamReader(in));
             
             MatchedRecord results;
            
             
             while ((results = ff.getNextRecord(bufIn)) != null ){
            	
                 if (args[1].equalsIgnoreCase("Patient")) {
                 if (results.getRecordName().equals("patientresource")) {
                	 
                	 
  
                	 System.out.println(results.getBean("patient"));

                }
             }
             
             if (args[1].equalsIgnoreCase("Diagnosis")) {
                if (results.getRecordName().equals("diagnosisresource")) {

            	    System.out.println(results.getBean("diagnosis"));

                 }
             }
             }

         } catch (FlatwormUnsetFieldValueException flatwormUnsetFieldValueError) {
             flatwormUnsetFieldValueError.printStackTrace();  
         } catch (FlatwormConfigurationValueException flatwormConfigurationValueError) {
             flatwormConfigurationValueError.printStackTrace();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (FlatwormInvalidRecordException e) {
             e.printStackTrace(); 
         } catch (FlatwormInputLineLengthException e) {
             e.printStackTrace(); 
         } catch (FlatwormConversionException e) {
             e.printStackTrace(); 
         }catch (FlatwormCreatorException e) {
             e.printStackTrace(); 
         }
     }

}