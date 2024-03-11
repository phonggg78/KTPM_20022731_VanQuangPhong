package org.example;

import jdepend.framework.PackageFilter;
import jdepend.xmlui.JDepend;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try (PrintWriter out = new PrintWriter(new FileOutputStream("reports.xml"),true))
        {

            JDepend depend =new JDepend(new PrintWriter("report.xml"));
            depend.addDirectory("C:\\Phong\\4_HK2\\Library-Assistant");
            depend.analyze();
            System.out.println("DONE");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }    }
}