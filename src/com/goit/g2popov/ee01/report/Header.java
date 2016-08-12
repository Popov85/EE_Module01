package com.goit.g2popov.ee01.report;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Андрей on 12.08.2016.
 */
public class Header {
        public void print() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
                String formattedDate = sdf.format(date);
                System.out.println("Date&Time: "+formattedDate);// 12/01/2011 4:48:16 PM
                System.out.println("Author: Popov Andrey");
                System.out.println("Collections:[HashSet, TreeSet, ArrayList, LinkedList]");
                System.out.println("Observations: 100");
        }
}
