1) client makes a request for form.html

2) in this page, client is supposed to put his/her qualification and sends the request to the servlet e.g. "CareerServ"

3) servlet calls for "CareerExpert" java bean
which will accept the qualification from servlet and returns the advice to the servlet

4) servlet adds this advice into request object (attribute) and forwards the page to the "CareerDetails.jsp"
this jsp generates a page ,returns this page to the client as response.