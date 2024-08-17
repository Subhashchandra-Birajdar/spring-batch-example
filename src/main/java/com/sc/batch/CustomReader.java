package com.sc.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomReader implements ItemReader<String> {

    private String[] tokens ={ "java","Spring","SpringBoot","Hibernate","Springbatch","Advance java"};

    private int index = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(index >=tokens.length){
            return null;
        }
        String data = index+" "+tokens[index];
        index ++;

        System.out.println("Reading data - "+data);
        return data;
    }
}
