# Legit_CheckerV2

A JavaFX application built with the MVC (Model-View-Controller) pattern.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Project Structure

The project follows the MVC pattern:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── legitchecker/
│   │           ├── Main.java                    # Application entry point
│   │           ├── controller/
│   │           │   └── MainController.java      # Controller layer
│   │           ├── model/
│   │           │   └── MainModel.java           # Model layer
│   │           └── view/
│   └── resources/
│       └── MainView.fxml                        # View layer (FXML)
```

## How to Run

### Using Maven (Recommended)

Click "Run Java" in your IDE or run from the command line:

```bash
mvn clean javafx:run
```

### Building the Project

To compile the project:

```bash
mvn clean compile
```

To package the project:

```bash
mvn clean package
```

## Features

- **MVC Architecture**: Clean separation of concerns with Model, View, and Controller
- **JavaFX GUI**: Modern graphical user interface
- **Maven Build System**: Easy dependency management and build process