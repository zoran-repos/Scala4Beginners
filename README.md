
# Scala4Beginners

Welcome to the **Scala4Beginners** course! 

This guide will help you set up Scala on your machine and configure your development environment in Visual Studio Code (VSCode) and IntelliJ IDEA.

## Prerequisites

Before installing Scala, ensure you have **Java** installed. Scala requires Java 8 or later. You can check if Java is installed by running:

```bash
java -version
```

## Installing Scala

### Windows

1. **Download Scala:** Visit the official [Scala download page](https://www.scala-lang.org/download/) and download the Scala binaries for Windows.
2. **Install Scala:** Follow the installer instructions.
3. **Set PATH variable:** Add Scala to your PATH by locating the installation folder and updating the PATH environment variable.

To verify the installation, open the Command Prompt and type:

```bash
scala -version
```

### Linux

For Debian/Ubuntu:

1. **Update package manager:** Open the terminal and update your package list.

   ```bash
   sudo apt update
   ```

2. **Install Scala using apt:**

   ```bash
   sudo apt install scala
   ```

For Red Hat/CentOS:

1. **Add repository and install Scala:**

   ```bash
   sudo yum install scala
   ```

To verify the installation, run:

```bash
scala -version
```

### Alternative: Install with SDKMAN (Linux and Windows)

You can also install Scala using [SDKMAN](https://sdkman.io/):

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install scala
```

### Alternative: Install using Coursier

You can install Scala using [Coursier](https://get-coursier.io/), a popular Scala installer:

1. **Download Coursier:** Download the Coursier binary for Windows from [this link](https://github.com/coursier/coursier/releases/latest/download/cs-x86_64-pc-win32.zip).
2. **Extract and Run:** Extract the downloaded ZIP file and place the `cs` executable in a directory of your choice.
3. **Set PATH:** Add the directory containing `cs` to your PATH environment variable.
4. **Install Scala with Coursier:** Open a command prompt and run the following command:

   ```bash
   cs install scala
   ```

5. **Verify the Installation:**

   ```bash
   scala -version
   ```
   
## Recommended IDE Plugins

### Visual Studio Code

1. **Scala (Metals) Plugin:** Install the "Metals" extension from the VSCode marketplace, which provides IDE support for Scala.
2. **Scala Syntax (official):** This extension offers syntax highlighting for Scala code.

#### Additional VSCode Plugins

- **Scala Format**: Helps maintain consistent code style.
- **Scala Syntax**: For highlighting Scala syntax in your editor.

### IntelliJ IDEA

1. **Scala Plugin:** Go to `File > Settings > Plugins`, search for "Scala," and install the Scala plugin. This plugin provides rich support for Scala, including syntax highlighting, code completion, and debugging features.

## Running Scala Code

After installation, you can open a terminal or use the IDE's terminal and type:

```bash
scala
```

This command starts the Scala REPL, where you can begin writing and testing Scala code interactively.


