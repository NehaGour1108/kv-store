# **Key-Value Store with MySQL Integration**  

<img width="650" alt="Screenshot 2024-11-29 at 1 50 25 PM" src="https://github.com/user-attachments/assets/c1ff9da7-d5f3-47c5-b207-e476310806ca">


This project implements a **Key-Value Store** system using Java and MySQL. It demonstrates how to perform basic CRUD operations (Create, Read, Update, Delete) with a relational database, leveraging JDBC for database connectivity.  

## **Features**  

- **Add or Update Key-Value Pairs**: Insert new key-value pairs or update existing ones in the database.  
- **Retrieve Values**: Fetch values associated with specific keys.  
- **Delete Key-Value Pairs**: Remove a key-value pair from the database.  
- **Error Handling**: Graceful handling of database connection issues and SQL exceptions.  

## **Technologies Used**  

- **Java**: Programming language for the implementation.  
- **MySQL**: Database for storing key-value pairs.  
- **JDBC**: Java Database Connectivity for interacting with MySQL.  

## **Database Schema**  

Before running the application, ensure you have the following database setup:  

### **Database Name**: `kv_store`  
### **Table Name**: `kv_table`  

```sql  
CREATE TABLE kv_table (  
    `key` VARCHAR(255) PRIMARY KEY,  
    `value` VARCHAR(255)  
);  
```  

## **Getting Started**  

### **Prerequisites**  

- Java Development Kit (JDK) 8 or higher  
- MySQL Server installed and running  
- MySQL Workbench or a similar tool (optional, for database management)  

### **Setup Instructions**  

1. **Clone the Repository**:  
   ```bash  
   git clone <repository-url>  
   cd <repository-folder>  
   ```  

2. **Update Database Configuration**:  
   Open the `DbConfig` class and update the following details to match your local MySQL setup:  
   ```java  
   private static final String URL = "jdbc:mysql://localhost:3306/kv_store";  
   private static final String USER = "root";  
   private static final String PASSWORD = "your-password";  
   ```  

3. **Create the Database and Table**:  
   Run the provided SQL commands to create the database and table in MySQL.  

4. **Build and Run the Project**:  
   - Compile the project using your IDE or command line.  
   - Run the `Main` class to test the Key-Value Store functionality.  

## **Usage**  

The `Main` class demonstrates the following actions:  

1. **Insert or Update**:  
   ```java  
   kvStore.put("key", "value");  
   ```  

2. **Retrieve Value**:  
   ```java  
   String value = kvStore.get("key");  
   ```  

3. **Delete Key**:  
   ```java  
   kvStore.delete("key");  
   ```  

### **Example Output**  
```plaintext  
Inserted/Updated key: username  
Inserted/Updated key: email  
Retrieved username: admin  
Deleted key: email  
Retrieved email after deletion: null  
```  
