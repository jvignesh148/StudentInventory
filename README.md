📘 StudentInventory
A Spring Boot application for managing student inventory, including features like adding, viewing, and deleting student-related records.

📁 Project Structure
swift
Copy
Edit
StudentInventory/
│
├── src/
│   ├── main/
│   │   ├── java/com/vignesh/StudentInventory/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   └── StudentInventoryApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   └── test/
├── pom.xml
└── README.md
🚀 Features
✅ Add new inventory records

✅ View all inventory items

✅ Fetch item by ID

✅ Delete inventory entries

✅ Integrated with H2 in-memory database

✅ RESTful APIs using Spring Boot

🔧 Tech Stack
Java 21

Spring Boot 3.5.3

Spring Web

Spring Data JPA

H2 Database

Maven

⚙️ How to Run
Clone the repository

bash
Copy
Edit
git clone https://github.com/yourusername/StudentInventory.git
cd StudentInventory
Run the application
Using IntelliJ or VS Code, run StudentInventoryApplication.java
Or use terminal:

bash
Copy
Edit
mvn spring-boot:run
Access H2 Console
Go to: http://localhost:1702/h2-console

JDBC URL: jdbc:h2:mem:webapp

User: sa

Password: password

🔗 API Endpoints
Method	Endpoint	Description
GET	/inventory	Get all inventory items
GET	/inventory/{id}	Get item by ID
POST	/inventory	Add a new item
DELETE	/inventory/{id}	Delete item by ID

📌 Sample Payload (POST /inventory)
json
Copy
Edit
{
  "name": "Laptop",
  "description": "Dell Latitude 7490",
  "quantity": 5
}
📃 License
This project is licensed under the MIT License.

