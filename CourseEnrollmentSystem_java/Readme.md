📚 Online Course Enrollment System – Problem Statement
📖 Scenario
A leading software company has partnered with a university to build an online course enrollment system.

The system must:

Support different types of courses

Validate course details

Ensure students enroll only in legitimate offerings

This project needs to be developed using Object-Oriented Programming (OOP) principles in Java.

🎯 Your Task
Implement a Java-based course enrollment system with the following requirements:

1️⃣ Class Definitions
a) Course Class
Attributes

courseName (String)

durationInWeeks (int)

fee (double)

Validations

If durationInWeeks < 1 or durationInWeeks > 52 → throw InvalidCourseDurationException

If fee < 1000 or fee > 100000 → throw InvalidCourseFeeException

b) ProgrammingCourse Class
Inherits from Course

Additional Attribute:

language (String) – e.g., "Java", "Python"

Validation

If language is null or empty → throw InvalidProgrammingLanguageException

2️⃣ Custom Exceptions
Create 3 checked exceptions (extend Exception):

InvalidCourseDurationException

InvalidCourseFeeException

InvalidProgrammingLanguageException

Each must have a constructor that accepts a custom error message.

3️⃣ OOP Concepts to Apply
Encapsulation → Private fields + Getters & Setters

Inheritance → ProgrammingCourse extends Course

Method Overriding → displayCourseDetails() in ProgrammingCourse must also display the programming language

4️⃣ Main Class Requirements
Create objects for both Course and ProgrammingCourse

Use try-catch blocks for exception handling

Demonstrate valid and invalid course creation

Print appropriate messages or course details

🧪 Sample Test Cases
Input	Expected Output
new Course("Data Structures", 12, 15000)	Displays course details
new ProgrammingCourse("Java Basics", 8, 12000, "Java")	Displays programming course details
new ProgrammingCourse("Advanced Python", 0, 12000, "Python")	Throws InvalidCourseDurationException
new ProgrammingCourse("C++ Mastery", 8, 500, "C++")	Throws InvalidCourseFeeException
new ProgrammingCourse("Kotlin for Android", 6, 15000, "")	Throws InvalidProgrammingLanguageException
📦 Deliverables
Java Classes

Course

ProgrammingCourse

Custom Exception Classes

Main Class showing:

All required functionalities

Both success and error cases in the output

🖥 Example Output
text
Course Name: Data Structures
Duration (weeks): 12
Fee: 15000.0

Course Name: Java Basics
Duration (weeks): 8
Fee: 12000.0
Programming Language: Java

Duration must be between 1 and 52 weeks.
Fee must be between 1000 and 100000.
Programming language cannot be null or empty.
