Story1: Add new customer
As an Account Administrator I would like the bank to track new customers So that we can tie all records of them together

Acceptance Criteria:
Each customer has a ‘nickname’
Valid ‘nickname’s contain only lowercase letters or digits
Each customer has a ‘dateOfBirth’ (DateTime)
Customers may be added to the Bank provided that there is not an existing customer with the same ‘nickname’

Task:
 1. Create Bank class and Customer class, customer, add nickname to customer and add this customer into bank.
 2. add dateOfBirth to Customer
 3. add nickname format validation
 4. add nickname unique validation


Story2: Maintain Balance
As a Customer I would like to know my balance when I deposit/withdraw money So that I can have confidence in the bank

Notes:
Only dealing with whole numbers
A customer only has one account at a time

Acceptance Criteria:
Attempting to ‘overdraw’ will result in an Exception being thrown
Can withdraw all the money
Can withdraw from the balance
Can deposit money and see it reflect in the balance

Task:
 1. add an account for a customer
 2. add deposit function
 3. add withdraw function
 4. add overdraw validation

Story3: Send Welcome message to customer(Has been block by Confirm GatewayApi)
As a Bank Manager I would like customers to receive a welcome message when being added So that they feel like we are engaged with them

Notes:
You must use the Bank’s Message Gateway API (provided)

Acceptance Criteria:
A message is sent to the customer who was added to the bank
The message is addressed to the customer’s email address – the form is: nickname@thebank.com
The message content is “Dear <nickname>, Welcome to the Bank”

Task:
 1.Check Bank's Message Gateway API
 2.construct customer email address.
 3.construct email message
 4.send email from gateway

Story4: Message for Premium Customer(Has been block by Confirm GatewayApi)
As a Bank Manager
I would like to receive a message when a customer's balance goes over 40000
So that I can call them for a personalised service

Notes:
You must use the Bank’s Message Gateway API (provided)

Acceptance Criteria:
Emails should be addressed to manager@thebank.com
Content should be, “<nickname> is now a premium customer”
The manager should only ever receive the email once (once a customer is premium, they will always be premium)

Task:
 1.Check Bank's Message GateWay API
 2. construct email message
 3. send email
 4. add Premium customer flag to premium customer.

Story5: Upgrade message library(Block by get new api)
The messaging team in the Bank recently published a new artefact to fix a number of problems and solve some performance issues.

Acceptance Criteria:
We should be using FasterMessageGateway instead of StandardMessageGateway

Task:
 1.Check new message library, find the different between old one and new one.
 2. Replace and make sure function is as before.

Story6:Add Joining Date for customer
As a Bank Manager I would like to set the joining date in a customer if the customer is successfully added to the bank So that I can later give rewards for length of service 
Notes:
Initialise the date inside the Customer class

Acceptance Criteria:
The joining date is set to today’s date as soon as they are added to the bank 


