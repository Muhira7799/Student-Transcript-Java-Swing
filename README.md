# Student Transcript – Java Swing

A Java desktop application built with Swing. The user enters a student's name and three marks, and the program generates a transcript with the total, average, and grade.

## Features

- Fields for the student name and three marks
- **Generate Transcript** button
- Transcript shown in a read-only, scrollable text area
- Validation: a name is required and marks must be between 0 and 100
- Average shown with two decimal places

## Grading Scale

| Average | Grade |
|---------|-------|
| 80 and above | A |
| 70 to 79.99 | B |
| 60 to 69.99 | C |
| 50 to 59.99 | D |
| Below 50 | F |

## Sample Output

For the name `Alice` and marks `85`, `78`, `72`:

```
STUDENT TRANSCRIPT
------------------------
Name: Alice
Mark 1: 85.0
Mark 2: 78.0
Mark 3: 72.0
Total: 235.0
Average: 78.33
Grade: B
```

## Messages

| Problem | Message shown |
|---------|---------------|
| Empty name, or a mark below 0 or above 100 | Enter a name and marks between 0 and 100. |
| A mark that is empty or not a number | Please enter valid marks. |

## Requirements

- Java Development Kit (JDK) 8 or higher (Swing is included in the JDK)

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac StudentTranscript.java
java StudentTranscript
```

## Project Structure

```
.
├── StudentTranscript.java
└── README.md
```

## Possible Improvements

- Add a student ID and subject names
- Add a Clear button
- Save the transcript to a file
- Support a variable number of subjects
