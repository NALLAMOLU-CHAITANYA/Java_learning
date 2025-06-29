# Stiver sheet:

https://takeuforward.org/system-design/complete-system-design-roadmap-with-videos-for-sdes

1. HTPP & HTTPS protocols         (HTTP -> port 80 and HTTPS -> port 443)
2. What is the Internet TCP/IP stack?  (Transmission control protocol/Internet Protocol) (5 layers: physical, data link, n/w, transport, application layers)
3. What happens when you enter “google.com”? (in the above link - very good explanation)

TCP and UDP use cases:

-> TCP is used to deliver static websites like google, wikipedia, to download any files from the internet. Because while downloading if the internet issue happens. When the internet is back, the server only sends data that needs to be received. It is somewhat slower bcz it checks that the data is received or not. 

-> UDP, on the other hand, is usually used to serve live video streams or online games. There speed matters not the data is received or not.



--> What happens when you type example.com in a browser?

Browser checks cache (local DNS cache, OS cache).

``If not found, it queries a DNS resolver (like your ISP or Google DNS).

The resolver asks the root DNS servers:

"Who is responsible for .com?"

The root servers reply:

"Ask the .com TLD name servers."

The resolver then asks the .com name servers:

"Where can I find example.com?"

.com TLD name servers reply with the authoritative name server for example.com.

That name server gives the IP address of the website.

Finally, the browser connects to that IP and loads the page.``

4. What are Relational Databases?

A Relational Database Management system (RDBMS) is a database management system that is based on the relational model. It has the following major components: Table, Record/Tuple/Row, Field, and Column/Attribute. Examples of the most popular RDBMS are MYSQL, Oracle, IBM DB2, and Microsoft SQL Server database.

Relational databases have the following properties:

Values are atomic.
All of the values in a column have the same data type.
Each row is unique.
The sequence of columns is insignificant.
The sequence of rows is insignificant.
Each column has a unique name.
Integrity constraints maintain data consistency across multiple tables.













Todo:

1. DBMS concepts