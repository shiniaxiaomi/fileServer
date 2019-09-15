package com;

/**
 * Created by Yingjie.Lu on 2019/9/15.
 */
public class Main {


    public static void main(String[] args) {

        WebServiceDemo webServiceDemoPort = new WebServiceDemoService().getWebServiceDemoPort();
        String s = webServiceDemoPort.transWords("nihao");
        System.out.println(s);

    }
}
