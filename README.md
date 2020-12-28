# h2database

Step 1: Create a Spring Starter Project with dependencies Spring Web, Spring Data JPA, Spring Devtools and H2 Database.

Step 2: Create a package with the name com.javatpoint.model in the folder src/main/java.

Step 3: Create a model class in the package com.javatpoint.model. We have created model class with the name Student. In the Student class, we have done the following:
        Define four variable id, age, name, and
        Generate Getters and Setters.
        Right-click on the file -> Source -> Generate Getters and Setters.
        Mark the class as Entity by using the annotation @Entity.
        Mark the class as Table name by using the annotation @Table.
        Define each variable as Column by using the annotation @Column.
       
Step 4: Create a package with the name com.javatpoint.controller in the folder src/main/java.

Step 5: Create a Controller class in the package com.javatpoint.controller. We have created controller class with the name StudentController. In the StudentController class, we have done the following:
        Mark the class as RestController by using the annotation @RestController.
        Autowire the IStudentService class by using the annotation @Autowired.
        Define the following methods:
        getAllStudent(): It returns a List of all Students.
        getStudent(): It returns a student detail that we have specified in the path variable. We have passed id as an argument by using the annotation @PathVariable. The                 annotation indicates that a method parameter should be bound to a URI template variable.
        deleteStudent(): It deletes a specific student that we have specified in the path variable.
        saveStudent(): It saves the student detail. The annotation @RequestBody indicates that a method parameter should be bound to the body of the web request.       
        
Step 6: Create a package with the name com.javatpoint.service in the folder src/main/java.

Step 7: Create a Service class. We have created a service class with the name StudentServiceImpl and Service Interface with name IStudentService in the package com.javatpoint.service.        

Step 8: Create a package with the name com.javatpoint.repository in the folder src/main/java.

Step 9: Create a Repository interface. We have created a repository interface with the name StudentRepository in the package com.javatpoint.repository. It extends the Crud Repository interface

Step 10: Open the application.properties file and configure the following properties    
      Now we will configure the datasource URL, driver class name, username, and password, in the application.properties file.



Let's access the H2 console to see the data.

Step 11: Open the browser and invoke the URL http://localhost:8080/h2-console. Click on the Connect button
