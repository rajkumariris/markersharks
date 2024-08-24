# Supplier Management Application

This is a Java Spring Boot application for managing suppliers. It allows you to create, retrieve, update, and delete supplier information based on user given supplier details .

## Prerequisites

- Java 8 or higher
- Maven
- Spring Boot
- sql
- restapi

## Installation

1. Clone the repository: `git clone https://github.com/rajkumariris/makersharks.git`
2. Navigate to the project directory: `cd makersharks`
3. Install the dependencies: `mvn install`

## Running the Application

You can run the application using the Spring Boot Maven plugin:

```bash
mvn spring-boot:run


## Curls
curl --location 'http://localhost:9090/api/supplier/query/3' \
--data '{  

  "company_name":"omegaSupplier",
   "website":"Havisupplier.com",
   "location":"Bengal",
   "nature_of_business":"small",
   "manufacturing_process":"3d_printing"
}'

curl --location 'http://localhost:9090/api/supplier/CreateSupplier' \
--header 'Content-Type: application/json' \
--data '{  

   "company_name":"rajSupplier",
   "website":"rajsupplier.com",
   "location":"Bengal",
   "nature_of_business":"small",
   "manufacturing_process":"3d_printing"
}'
