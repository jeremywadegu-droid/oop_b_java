# Hospital Management System (OOP) - Activity 4

## Project Description
This project is a simple Hospital Management System created using Object-Oriented Programming concepts. 
It allows a user to manage doctors and patients by adding them, viewing stored records, and searching for doctors.

This version is an improvement of the previous activities because it now supports storing multiple objects using Java Collections
and saving/loading data using file handling.

## Collections Implemented
The project uses:
- **ArrayList** to store multiple Patient and Doctor objects.
- **HashMap (Map)** to allow quick searching of doctors by their name.

This makes the system faster and more organized compared to using single objects.

## File Storage (Saving Data)
The system saves data into text files using:
- FileWriter
- BufferedWriter

Patients are saved in: `patients.txt`  
Doctors are saved in: `doctors.txt`

Each record is stored in CSV format (comma-separated values).

## Loading Data (Reading from File)
When the program starts, it automatically loads any existing saved data using:
- FileReader
- BufferedReader

This allows the system to keep previous records even after the program is closed.

## Exception Handling
Exception handling was implemented to prevent the program from crashing.

Examples of handled errors:
- Invalid age values (negative numbers)
- Wrong input types (entering text instead of numbers)
- Missing files (FileNotFoundException)
- Incorrect file formatting

## How to Run
1. Compile the project:
   javac *.java

2. Run the program:
   java Main

3. Use the menu to add, view, search, save, and load hospital data.
