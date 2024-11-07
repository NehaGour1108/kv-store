To create a table directly from a Java application, you can execute SQL statements from within your code. Here’s how to add a method in the Java application to initialize the database and create the required table programmatically.

### Step 1: Add a Method to Create the Table

Add a `createTable()` method in your `DbConfig` class or in a separate utility class for creating tables. This method will connect to the MySQL database and run a SQL `CREATE TABLE` statement if the table does not already exist.

Here’s how to implement it:
### Step 2: Modify the `Main` Class to Initialize the Table

Before performing any `put`, `get`, or `delete` operations, call `DbConfig.createTable()` in your `Main` class to ensure the table is created.

### Step 3: Running the Application

Now when you run the application, it will first check if the `kv_table` table exists and create it if not. You should see a message indicating the table was created or already exists.

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="org.example.Main"
```

### Expected Output

The output should be similar to this:

```plaintext
Table 'kv_table' created or already exists.
Inserted/Updated key: username
Inserted/Updated key: email
Retrieved username: admin
Deleted key: email
Retrieved email after deletion: null
```

This approach ensures that the database table setup is part of the application itself, making it easier to initialize the environment without manual SQL scripts.
