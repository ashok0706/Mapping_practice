## **Mapping practice**

### Frame Works And Language Used 
---
* JAVA Programming language
* SQL for Querries
 * Spring Boot
 * MYSQL
 * Hybernate
 * Lombook
 * Maven Biuld Tool

### Data Flow
----
1. #### **controller**
  * AddresController

  * BookController

  * LoptapController

  * CrouseController

  * StudentController

  These clasess are use for CRUD operations with help of Annaotatins i.e ***@POSTMapping, @PUTMapping, @GETMapping, @DELETEMapping***  at Methode level

 ***@RestController @Requestmapping*** at classelevel, 


2. #### Service
  * AddresServise

  * BookServise

  * LoptapServise

  * CrouseService

  * StudentServise

These All classer used for Busseness logic operations
are Annatated with  
***@service***

3. #### Model
 * Addres

  * Book

  * Loptap

  * Crouse

  * Student

  These all are Entity classes 
  every class annotated with ***@Entity, @Data, @NoArgConstructor, @Id***

4. #### Repository
 * AddresRepo

  * BookRepo

  * LoptapRepo

  * CrouseRepo

  * StudentRepo

   These all are Interfaces and all  extended with JpaCRUD repository

   every class annotated with ***@Repository***.

   ### Data Stuctures 

 Regular Array Lists Are used.

 ### Summary

 This project is designed for perfoming  basic  CRUD operations on various tables wich are internally connected as OnetoOne, ManytoOne, ManytoMany  form.





