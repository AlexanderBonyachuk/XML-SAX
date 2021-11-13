package com.company;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class Parser {
/* SAX подход парсинг XML
 не загружает целиком xml файл в память, а кусками*/

    public static void main(String[] args) throws IOException, XMLStreamException {

        XMLInputFactory factory2 = XMLInputFactory.newInstance();
        XMLStreamReader parser2 = factory2.createXMLStreamReader(new FileInputStream("C:\\Java_\\Zanyatia_\\HTMLParser\\src\\com\\company\\workspace.xml"));
        while (parser2.hasNext()) {
            int event = parser2.next();
            if(event == XMLStreamConstants.START_ELEMENT) {
                System.out.println(parser2.getLocalName());
            }
        }

    }
}
