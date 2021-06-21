# CURD Operation with using spring boot JPA
The CRUD stands for Create, Read/Retrieve, Update, and Delete. These are the four basic functions of the persistence storage.The CRUD operation can be defined as user interface conventions that allow view, search, and modify information through computer-based forms and reports.

## Execution steps
* Clone this code.
* Set the local host.
* Run the code.
* Now Run the API using postman and check all the CURD operation.

## Request API's - 
* For POST Request-

      api/v1/student
    
* For GET Request -

      /api/v1/student/{userid} - Fetch the student by userid
      /api/v1/student1/{name} - Fetch the student by Name
      /api/v1/student         - Fetch all student details
      
* For PUT Request -

      /api/v1/student/{userid} - Update the student details
      
* For Delete Request - 

      /api/v1/student/{userid} - Delete by userid
      /api/v1/student          - Delete all
