package com.nttdata.ffcustom;

import java.io.*;
import java.util.HashMap;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.MatchedRecord;
import com.blackbear.flatworm.errors.*;
import com.blackbear.flatworm.converters.CoreConverters;

@SuppressWarnings("unused")
public class SimpleFlatwormExample {
    public static void main(String[] args) {
         ConfigurationReader parser = new ConfigurationReader();
         try {
             FileFormat ff = parser.loadConfigurationFile(args[0]);
             InputStream in = new FileInputStream(args[1]);
             BufferedReader bufIn = new BufferedReader(new InputStreamReader(in));
             MatchedRecord results;
             while ((results = ff.getNextRecord(bufIn)) != null) {
                 if (results.getRecordName().equals("newhire")) {
                    System.out.println(results.getBean("employee"));
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