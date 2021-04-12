# pnc-book-store-app

1. Get the WSDL file from which a new SOAP WS Producer need to be created

2. Add plugin for wsdl2java (org.apache.cxf) in pom.xml

3. Copy <xs:schema> section from the wsdl file and create a new xsd file

4. Place the WSDL file and XSD file in the resource folder

5. Maven Project Update & maven clean install 
[it will create all the classes]

6. Implement the generated *PORT Interface and create new Endpoint class
[* Interface implementation will make sure the automated generated methods are used]

7. Publish the new service

8. Test from SOAP UI

