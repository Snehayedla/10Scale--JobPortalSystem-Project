#  Mini Job Portal System (Java Console Application)

##  Project Overview
The Mini Job Portal System is a console-based Java application developed using Core Java, Object-Oriented Programming (OOP) concepts, and the Java Collections Framework.  
It simulates a simple job portal where Admins, Companies, and Candidates interact through a menu-driven interface.

This project is implemented strictly according to the assignment guidelines, without using any frameworks or databases.

---

##  Objective
To design and implement a menu-driven Job Portal application that demonstrates:
- OOP principles
- Use of Java Collections
- Business logic validation
- Clean and modular code structure

---

##  Duration
1.5 Days

---

##  Technologies Used
- Java (Core Java)
- OOP Concepts
- Java Collections Framework
- Console-based Input/Output

---

##  Concepts Implemented
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- Collections (List, Set, Map)
- equals() and hashCode()
- Exception Handling
- Menu-driven programming

---

##  Project Structure
JobPortalSystem
└── src
└── com
└── jobportal
├── model
│ ├── User.java
│ ├── Admin.java
│ ├── Company.java
│ ├── Candidate.java
│ └── Job.java
├── service
│ └── JobService.java
└── main
└── JobPortalApp.java

---


###  Admin
- View all jobs
- View applicants for each job

###  Company
- Post new jobs
- Close posted jobs

###  Candidate
- View available jobs
- Apply for jobs

---

##  Business Rules
- Job IDs must be unique
- A candidate cannot apply for the same job more than once
- A candidate cannot apply for a CLOSED job
- Only Collections are used (arrays are not allowed)

--

---

##  Restrictions
- No Database
- No Frameworks (Spring, Hibernate, etc.)
- No Streams or Lambdas
- Console-based application only

---

##  Evaluation Criteria
- OOP Design – 30%
- Collections Usage – 30%
- Logic & Validation – 20%
- Code Quality – 20%

---
