Feature: Book Store Add
    
    Background:
	* url 'http://localhost:8080/store'

    Scenario: SOAP API to add book
		Given request 
		"""
	    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:app="http://www.pnc.com/book/store/app">
		   <soapenv:Header/>
		   <soapenv:Body>
		      <app:AddBookRequest>
		         <app:Book>
		            <!--Optional:-->
		            <app:ID>1</app:ID>
		            <app:Title>title</app:Title>
		            <app:Author>goole</app:Author>
		         </app:Book>
		      </app:AddBookRequest>
		   </soapenv:Body>
		</soapenv:Envelope>
	    """
		When soap action 'http://localhost:8080/store'
		Then status 200
		And print 'response: ', response
		
		
	Scenario: Get inof of a Book based on id
		Given request 
		"""
	    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:app="http://www.pnc.com/book/store/app">
		   <soapenv:Header/>
		   <soapenv:Body>
		      <app:GetBookRequest>
		         <app:ID>2</app:ID>
		      </app:GetBookRequest>
		   </soapenv:Body>
		</soapenv:Envelope>
	    """
		When soap action 'http://localhost:8080/store'
		Then status 200
		And print 'response: ', response
		
		
	Scenario: GetAllBooks
		Given request 
		"""
	    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:app="http://www.pnc.com/book/store/app">
		   <soapenv:Header/>
		   <soapenv:Body>
		      <app:GetAllBooksRequest/>
		   </soapenv:Body>
		</soapenv:Envelope>
	    """
		When soap action 'http://localhost:8080/store'
		Then status 200
		And print 'response: ', response