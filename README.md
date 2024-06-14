# PaymentAppBackend
Java Backend For A Payment App Using Stripe Payment Processor.

This service accepts a post request. The request body contains JSON with fields currency and the order UUID.
The service(has a stripe secret key) talks to the Stripe backend and creates a Payment Intent on the Stripe server.
The service responds with a payment intent object. The UI has the public key. It uses the payment intent from the
response along with the card details and public key to tell the Stripe server to process the payment. This is how
our online payments are safe as the server side code (even if it has vulnerabilities) never takes any sensitive card 
info.



# Todo
1.  Add Exception Handling.
2.  Write Unit tests.
3.  Add Logs.
4.  Make Angular UI.
5.  Integrate with Angular UI and test.
6.  Deploy to AWS BeanStalk while encrypting sensitive environment variables using KMS and test.
7.  Configure CICD and test.


# Done
1.  Make the Service run in local with basic classes.
2.  Create a Stripe Account and integrate it to the service.