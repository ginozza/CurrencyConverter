# Currency Converter

This project is part of a challenge for the Alura program, in collaboration with Oracle One Next Education. It was developed by Group 7 as part of the educational journey. The application allows you to convert currencies using an external API. The API key required for fetching conversion data is securely handled through an environment variable.

## Requirements 

- Java 11 or later.
- An exchangerate-api.com API key.

## Setting Up

To protect your API key, this project uses an environment variable instead of storing the key directly in the code.

### Set the Environment Variable

1. **On Linux or macOS:**
    - Set the environment variable using the following command:

        ```bash
        export CC_API_KEY="your-api-key-here"
        ```

    - To ensure the variable is set each time you log in, you can add it to your shell's configuration file (~/.bashrc, ~/.zshrc, etc.):

        ```bash
        echo 'export CC_API_KEY="your-api-key-here"' >> ~/.bashrc
        ```

    - Then, run the following command to load the new configuration:
        
        ```bash
        source ~/.bashrc
        ```

2. **On Windows:**
    - Set the environment variable with the following command:

        ```shell
        setx CC_API_KEY "your-api-key-here"
        ```

    This will ensure the variable is automatically loaded every time you open a new terminal.

3. **On IntelliJ IDEA:**

    - Open IntelliJ IDEA.
    - Go to **Run** > **Edit Configurations**.
    - In the **Run/Debug Configurations** window, select your application.
    - Under the Environment variables section, click the + button.
    - In the Name field, type **CC_API_KEY**.
    - In the Value field, enter your API key: **your-api-key-here**.
    - Alternatively, it can only ask you for the format **KEY=value** separated by ; each environment variable
    - Click OK to save the changes.
    
    Now, when you run the application from IntelliJ IDEA, it will use the environment variable you've set.

## Using the project

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/yourusername/your-repository.git
    ```

2. Navigate to the project folder:

    ```bash
    cd your-repository
    ```

3. Run the application:

    ```bash
    java -jar your-application.jar
    ```

The application should now use the API key set in the environment variable to perform the currency conversions.
