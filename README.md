# Employee Management System

## Overview
The Employee Management System is a Java-based application designed to manage employee records efficiently. This system provides features like employee sign-up, login, update, delete, and view functionalities. It is built using Java Swing for the front-end interface and JDBC for database connectivity.

## Features
- **User Authentication**: Secure login and sign-up functionalities for employees.
- **CRUD Operations**: Create, read, update, and delete employee data.
- **Password Recovery**: Feature to reset forgotten passwords.
- **User-Friendly Interface**: Intuitive UI designed using Java Swing.

## Project Structure

```plaintext
Employee Management System/
│
├── src/
│   ├── image/                          # Images used in the project
│   ├── repository/
│   │   └── ConnectionDB.java           # Handles database connection
│   ├── service/
│   │   ├── DeleteService.java          # Handles delete operations
│   │   ├── ForgotPasswordService.java  # Handles password recovery
│   │   ├── LoginService.java           # Handles login authentication
│   │   ├── SignupService.java          # Handles user registration
│   │   ├── UpdateService.java          # Handles data update operations
│   │   └── ViewService.java            # Handles data retrieval and display
│   ├── view/
│   │   ├── DeletePage.java             # UI for deleting user account
│   │   ├── EmployeeManagementSystem.java # Main application entry point
│   │   ├── ForgotPassword.java         # UI for password recovery
│   │   ├── Login_Page.java             # Login UI
│   │   ├── Signup_Page.java            # User registration UI
│   │   ├── UpdatePage.java             # UI for updating user information
│   │   ├── ViewPage.java               # UI for viewing user information
│   │   └── Welcome_Page.java           # Initial welcome page
│
├── test/                               # Unit tests (if any)
├── lib/                                # Libraries used in the project
└── README.md                           # Project documentation
```

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   ```
2. **Open the project in NetBeans**:
   - Open NetBeans IDE.
   - Select `File` -> `Open Project` and choose the cloned directory.

3. **Set up the database**:
   - Ensure that you have a running instance of a MySQL database.
   - Create a database and update the connection details in `ConnectionDB.java`.

4. **Run the application**:
   - Right-click on `EmployeeManagementSystem.java` and select `Run File`.

## Usage

- **Login**: Existing users can log in using their credentials.
- **Sign-Up**: New users can register via the sign-up form.
- **Update Profile**: Users can update their profile information.
- **Delete Account**: Users can delete their account (requires confirmation).
- **Password Recovery**: If a user forgets their password, they can recover it using the provided functionality.

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request for any features, enhancements, or bug fixes.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Acknowledgements

- Thanks to the open-source community for providing essential tools and libraries.

