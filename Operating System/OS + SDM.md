# Operating System Basics

## What is an Operating System (OS)?

An **Operating System (OS)** is system software that acts as an intermediary between computer hardware and application software. It provides an environment in which application programs can run and facilitates user interaction with the hardware.

### Difference Between OS and Application Software:
| **Feature**           | **Operating System (OS)**                                   | **Application Software**                           |
|------------------------|------------------------------------------------------------|--------------------------------------------------|
| **Purpose**            | Manages hardware resources and provides a platform for application software. | Performs specific tasks for the user.            |
| **Dependency**         | Runs directly on hardware.                                 | Runs on top of the OS.                           |
| **Examples**           | Windows, Linux, macOS                                     | Microsoft Word, Google Chrome, Photoshop        |

### Why is OS Hardware-Dependent?
The OS interacts directly with the hardware via drivers and kernel-level instructions. Since hardware architectures (x86, ARM, etc.) and device capabilities vary, an OS must be designed to utilize the specific features and instruction sets of the target hardware.

---

## Components of an Operating System
1. **Kernel**: The core part of the OS that manages hardware, processes, and system resources.
   - Types: Monolithic Kernel, Microkernel, Hybrid Kernel.
   
2. **Process Management**: Handles the creation, scheduling, and termination of processes.
   
3. **Memory Management**: Manages RAM, virtual memory, and memory allocation.
   
4. **File System**: Manages file storage, retrieval, and metadata.
   
5. **Device Drivers**: Interfaces between hardware and the kernel.
   
6. **User Interface**:
   - **Command-Line Interface (CLI)**: Text-based interface (e.g., Bash, PowerShell).
   - **Graphical User Interface (GUI)**: Visual-based interface (e.g., Windows Explorer).
   
7. **Security & Access Control**: Ensures system protection and user authentication.

---

## Basic Computer Organization for an OS
An OS interacts with various hardware components in the system. Below is a diagram showing basic computer organization:

```
+--------------------+
|      User          |
+--------------------+
         ↓
+--------------------+
| Application Layer  |
+--------------------+
         ↓
+--------------------+
| Operating System   |
+--------------------+
         ↓
+--------------------+
|   Hardware Layer   |
+--------------------+
```

### Key Components:
1. **CPU (Central Processing Unit)**: Executes instructions and processes data.
2. **Memory (RAM)**: Temporarily stores data and instructions.
3. **Storage (HDD/SSD)**: Permanently stores data and programs.
4. **I/O Devices**: Communicates with peripherals like keyboards, monitors, etc.
5. **System Bus**: Transfers data between components.

---

## Examples of Operating Systems and Their Differences

| **Type**                  | **Examples**              | **Features and Purpose**                                                                                       |
|---------------------------|---------------------------|---------------------------------------------------------------------------------------------------------------|
| **Desktop OS**            | Windows, macOS, Linux     | Designed for personal computers with a focus on user-friendly GUIs.                                           |
| **Mobile OS**             | Android, iOS             | Optimized for touchscreens, battery efficiency, and mobile hardware.                                          |
| **Embedded System OS**    | FreeRTOS, VxWorks         | Lightweight OS for embedded systems like IoT devices, appliances, and vehicles.                               |
| **Server OS**             | Windows Server, Ubuntu Server | Designed for servers to handle multiple users, services, and scalability.                                     |
| **Real-Time OS (RTOS)**   | QNX, RTEMS               | Processes inputs within strict time constraints; used in robotics and control systems.                        |
| **Hybrid OS**             | Chrome OS                | Combines desktop and cloud capabilities.                                                                      |

---

## Functions of an OS
1. **Process Management**: Scheduling, multitasking, and handling process priorities.
2. **Memory Management**: Allocation and deallocation of memory spaces.
3. **File Management**: Organizing, storing, and retrieving files efficiently.
4. **Device Management**: Managing input/output devices through drivers.
5. **Security**: User authentication, data protection, and firewall management.
6. **Networking**: Enabling communication over networks.
7. **Error Handling**: Identifying and resolving hardware and software errors.
8. **System Performance Monitoring**: Tracking system performance and resource usage.

---

## User Space and Kernel Space; Modes, Interrupts, and System Calls

### User Space vs Kernel Space:
| **Aspect**        | **User Space**          | **Kernel Space**        |
|-------------------|-------------------------|-------------------------|
| **Access Level**  | Limited privileges      | Full privileges         |
| **Purpose**       | Runs applications       | Manages resources       |
| **Examples**      | Browsers, Text Editors  | Device drivers, Kernel  |

### Modes:
- **User Mode**: Restricted access, used for running applications.
- **Kernel Mode**: Full access to hardware, used for OS operations.

### Interrupts:
- Mechanisms by which hardware signals the CPU for immediate attention.
- Types:
  - **Hardware Interrupts**: Triggered by external devices (e.g., keyboard, mouse).
  - **Software Interrupts**: Triggered by programs via system calls.

### System Calls:
- Interface for applications to request services from the OS.
- Examples:
  - File operations: `open()`, `read()`, `write()`.
  - Process control: `fork()`, `exec()`.

```
```
# Linux Basics

## Introduction to Linux

Linux is a powerful open-source operating system that serves as the backbone for servers, desktops, and embedded systems. It provides a robust environment for managing hardware, running software, and performing tasks efficiently.

---

## Working Basics of the File System

The Linux file system is hierarchical, starting with the **root directory (`/`)**. All files and directories are organized under this root.

### Important Directories in Linux:
| **Directory** | **Purpose**                                                                 |
|---------------|-----------------------------------------------------------------------------|
| `/`           | Root directory. Starting point of the file system hierarchy.               |
| `/home`       | Contains user directories. Example: `/home/user1` for user-specific data.  |
| `/etc`        | Configuration files for the system and software.                           |
| `/bin`        | Essential binaries (commands like `ls`, `cp`, `mv`).                       |
| `/var`        | Variable files like logs and caches.                                       |
| `/tmp`        | Temporary files created by processes.                                      |
| `/dev`        | Device files for accessing hardware (e.g., disks, USBs).                   |

---

## Commands Associated with Files/Directories & Other Basic Commands


| **Command**          | **Description**                                                                                       | **Example**                                         |
|-----------------------|-------------------------------------------------------------------------------------------------------|-----------------------------------------------------|
| `ls`                 | Lists files and directories in the current directory.                                                | `ls -al`                                           |
| `pwd`                | Prints the current working directory.                                                                | `pwd`                                              |
| `cd`                 | Changes the current working directory.                                                               | `cd /home/user`                                    |
| `mkdir`              | Creates a new directory.                                                                             | `mkdir new_folder`                                 |
| `mv`                 | Moves or renames files or directories.                                                               | `mv file1 file2`                                   |
| `cp`                 | Copies files or directories.                                                                         | `cp file1 file2`                                   |
| `rm`                 | Removes files or directories.                                                                        | `rm -r folder_name`                                |
| `touch`              | Creates an empty file.                                                                               | `touch newfile.txt`                                |
| `ln`                 | Creates a symbolic or hard link to a file or directory.                                              | `ln -s source_file link_name`                      |
| `clear`              | Clears the terminal screen.                                                                          | `clear`                                            |
| `cat`                | Displays the content of a file.                                                                      | `cat file.txt`                                     |
| `echo`               | Prints text to the terminal or writes it to a file.                                                  | `echo "Hello" > file.txt`                          |
| `less`               | Views file content one screen at a time.                                                             | `less file.txt`                                    |
| `man`                | Displays the manual for a command.                                                                   | `man ls`                                           |
| `uname`              | Shows system information such as kernel name and version.                                            | `uname -a`                                         |
| `whoami`             | Displays the current logged-in user.                                                                 | `whoami`                                           |
| `tar`                | Archives files and directories into a single file.                                                   | `tar -cvf archive.tar folder/`                     |
| `grep`               | Searches for a pattern in a file.                                                                    | `grep "text" file.txt`                             |
| `head`               | Displays the first lines of a file.                                                                  | `head -n 10 file.txt`                              |
| `tail`               | Displays the last lines of a file.                                                                   | `tail -n 10 file.txt`                              |
| `diff`               | Compares two files line by line.                                                                     | `diff file1.txt file2.txt`                         |
| `cmp`                | Compares two files byte by byte.                                                                     | `cmp file1.txt file2.txt`                          |
| `comm`               | Compares two sorted files line by line.                                                              | `comm file1.txt file2.txt`                         |
| `sort`               | Sorts the contents of a file.                                                                        | `sort file.txt`                                    |
| `export`             | Sets environment variables.                                                                          | `export PATH=$PATH:/new/path`                      |
| `zip`                | Compresses files into a `.zip` archive.                                                              | `zip archive.zip file1 file2`                      |
| `unzip`              | Extracts files from a `.zip` archive.                                                                | `unzip archive.zip`                                |
| `ssh`                | Connects to a remote system securely via SSH.                                                        | `ssh user@host`                                    |
| `service`            | Manages services on the system (start, stop, restart).                                               | `service apache2 start`                            |
| `ps`                 | Displays currently running processes.                                                                | `ps aux`                                           |
| `kill` and `killall` | Terminates processes using their PID or name.                                                        | `kill 1234` / `killall process_name`               |
| `df`                 | Displays disk usage of file systems.                                                                 | `df -h`                                            |
| `mount`              | Mounts a filesystem to a directory.                                                                  | `mount /dev/sdb1 /mnt`                             |
| `chmod`              | Changes file or directory permissions.                                                               | `chmod 755 file.txt`                               |
| `chown`              | Changes the ownership of a file or directory.                                                        | `chown user:group file.txt`                        |
| `ifconfig`           | Displays or configures network interfaces.                                                           | `ifconfig eth0`                                    |
| `traceroute`         | Displays the route packets take to a network destination.                                            | `traceroute google.com`                            |
| `wget`               | Downloads files from the internet.                                                                   | `wget http://example.com/file.zip`                 |
| `ufw`                | Manages the firewall (Uncomplicated Firewall).                                                       | `ufw allow 22`                                     |
| `iptables`           | Configures network packet filtering rules.                                                           | `iptables -L`                                      |
| `apt`, `pacman`, `yum`, `rpm` | Package managers for installing and managing software on different distributions.           | `apt install package` / `yum update`              |
| `sudo`               | Executes a command as a superuser.                                                                   | `sudo apt update`                                  |
| `cal`                | Displays a calendar in the terminal.                                                                 | `cal`                                              |
| `alias`              | Creates shortcuts for commands.                                                                      | `alias ll='ls -al'`                                |
| `dd`                 | Copies and converts data at the byte level.                                                          | `dd if=/dev/sda of=backup.img bs=4M`               |
| `whereis`            | Locates binaries, sources, and manuals for a command.                                                | `whereis ls`                                       |
| `whatis`             | Displays a short description of a command.                                                           | `whatis ls`                                        |
| `top`                | Displays real-time system resource usage.                                                            | `top`                                              |
| `useradd`            | Adds a new user to the system.                                                                       | `sudo useradd newuser`                             |
| `passwd`             | Changes the password for a user.                                                                     | `passwd`                                           |



---

### Redirection and Pipes

#### Redirection Operators:
| **Operator** | **Description**                          | **Example**                      |
|--------------|------------------------------------------|----------------------------------|
| `>`          | Redirects output to a file (overwrites). | `echo "Hello" > file.txt`        |
| `>>`         | Appends output to a file.                | `echo "World" >> file.txt`       |
| `<`          | Takes input from a file.                | `cat < file.txt`                 |

#### Pipes (`|`):
- Used to pass the output of one command as input to another.
- **Example**: `cat file.txt | grep "search_term"`

---

## File Permissions and How to Set Them

Linux uses a permission model to manage access to files and directories. Permissions are represented as **rwx** (read, write, execute) for the owner, group, and others.

### Permission Format:
```
-rwxr-xr--  1 user group 1234 Jan 14 10:30 file.txt
```
| **Field**    | **Meaning**                  |
|--------------|------------------------------|
| `-`          | File type (`-` for file, `d` for directory). |
| `rwxr-xr--`  | Permissions (owner, group, others).          |
| `user`       | File owner.                                  |
| `group`      | File group.                                  |

### Setting Permissions with `chmod`:
- **Symbolic Method**: `chmod u+x file.txt` (adds execute permission for the owner).
- **Octal Method**: `chmod 754 file.txt`
  - `7`: Full (rwx).
  - `5`: Read and execute (r-x).
  - `4`: Read-only (r--).

### Changing Ownership with `chown`:
- Syntax: `chown user:group file.txt`

---

## Access Control List (ACL)
ACL provides fine-grained permissions beyond the traditional model.
- **Set ACL**: `setfacl -m u:user1:rw file.txt`
- **View ACL**: `getfacl file.txt`

---

## Network Commands

| **Command**  | **Description**                                  | **Example**                  |
|--------------|--------------------------------------------------|------------------------------|
| `telnet`     | Connects to a remote host using Telnet protocol. | `telnet 192.168.1.1`         |
| `ftp`        | Transfers files using FTP protocol.              | `ftp ftp.example.com`        |
| `ssh`        | Secure shell login to a remote machine.          | `ssh user@hostname`          |
| `sftp`       | Secure file transfer using SSH.                  | `sftp user@hostname`         |
| `finger`     | Displays user information.                       | `finger username`            |

---

## System Variables (e.g., PS1, PS2)

### Common System Variables:
| **Variable** | **Description**                                  |
|--------------|--------------------------------------------------|
| `PS1`        | Primary prompt string. Customizes the shell prompt. |
| `PS2`        | Secondary prompt string (used for multi-line commands). |

### Setting System Variables:
- Temporarily: `export PS1="\u:\w\$ "` (Custom prompt).
- Permanently: Add to `.bashrc` or `.zshrc`.

---

## Flowchart: File System Permission Workflow
```plaintext
          +-----------------------+
          | Check Current Owner   |
          +-----------------------+
                      |
                      v
      +-----------------------------+
      | Change Owner (`chown`)      |
      +-----------------------------+
                      |
                      v
      +------------------------------------+
      | Modify Permissions (`chmod`)      |
      +------------------------------------+
                      |
                      v
       +---------------------------------+
       | Validate Changes (`ls -l`)     |
       +---------------------------------+
```

---

## Code Snippet: Automating Permission Setup
```bash
#!/bin/bash
# Script to set permissions for a directory

DIR_PATH=$1
if [ -d "$DIR_PATH" ]; then
    chmod -R 755 "$DIR_PATH"
    echo "Permissions set to 755 for $DIR_PATH"
else
    echo "Directory does not exist!"
fi
```

# Shell Programming in Linux

## What is a Shell?

A **shell** is a command-line interpreter that provides a user interface for accessing the services of the operating system. It processes commands entered by the user and executes them, either directly or by passing them to the appropriate program.

### Types of Shells in Linux
| **Shell**      | **Description**                                                                                  |
|-----------------|--------------------------------------------------------------------------------------------------|
| **Bash**        | Bourne Again Shell, the most widely used shell. Supports scripting and advanced features.       |
| **Zsh**         | Z Shell, similar to Bash but with additional features like themes and plugins.                  |
| **Ksh**         | Korn Shell, combines features of the C Shell and Bourne Shell.                                  |
| **Tcsh**        | T C Shell, an enhanced version of the C Shell with scripting improvements.                      |
| **Fish**        | Friendly Interactive Shell, designed for user-friendliness and simplicity.                      |

---

## Shell Variables

Shell variables are placeholders that store data used by shell scripts and commands.

### Types of Variables
1. **System Variables**: Predefined variables maintained by the shell.
   - Examples: `$HOME`, `$PATH`, `$USER`
2. **User-Defined Variables**: Custom variables created by the user.
   - Example:
     ```bash
     MY_VAR="Hello"
     echo $MY_VAR
     ```

### Scope of Variables
- **Local Variables**: Available within the current shell or script.
- **Environment Variables**: Available to all processes started from the shell.

---

## Wildcard Symbols

Wildcards are symbols used to represent patterns in filenames or strings.

| **Symbol** | **Description**                           | **Example**                |
|------------|-------------------------------------------|----------------------------|
| `*`        | Matches zero or more characters.          | `ls *.txt` (all `.txt` files) |
| `?`        | Matches exactly one character.            | `ls file?.txt`            |
| `[ ]`      | Matches any one character within brackets.| `ls file[1-3].txt`        |

---

## Shell Meta Characters

Meta characters have special meanings in the shell and are used for various operations.

| **Character** | **Description**                                   | **Example**                |
|---------------|---------------------------------------------------|----------------------------|
| `;`           | Separates multiple commands in a single line.    | `ls; pwd`                 |
| `&`           | Executes a command in the background.            | `sleep 10 &`              |
| `|`           | Pipes output of one command to another.          | `ls | grep file`          |
| `>`           | Redirects output to a file (overwrites).         | `echo "data" > file.txt`  |
| `>>`          | Redirects output to a file (appends).            | `echo "more data" >> file.txt` |
| `<`           | Redirects input from a file.                     | `wc < file.txt`           |
| `\`           | Escapes special characters.                      | `echo \$HOME`             |

---

## Command Line Arguments

Command-line arguments allow users to pass inputs to scripts when executing them.

### Example Script
```bash
#!/bin/bash
echo "Script Name: $0"
echo "First Argument: $1"
echo "Second Argument: $2"
echo "All Arguments: $*"
echo "Number of Arguments: $#"
```

### Run the Script
```bash
./script.sh arg1 arg2
```

**Output**:
```
Script Name: ./script.sh
First Argument: arg1
Second Argument: arg2
All Arguments: arg1 arg2
Number of Arguments: 2
```

---

## `read` and `echo` Commands

### `read` Command
Used to take input from the user during script execution.
```bash
#!/bin/bash
echo "Enter your name:"
read name
echo "Hello, $name!"
```

**Run**:
```
$ ./script.sh
Enter your name:
John
Hello, John!
```

### `echo` Command
Used to display messages or output values of variables.
```bash
#!/bin/bash
echo "This is a shell script!"
VAR="Linux"
echo "Welcome to $VAR"
```

**Output**:
```
This is a shell script!
Welcome to Linux
```

---

### Flowchart: Command Execution in Shell

```plaintext
+---------------------+
|  User Enters Command|
+---------------------+
           |
           v
+---------------------+
| Shell Interprets    |
+---------------------+
           |
           v
+-----------------------------+
| Shell Locates Command/Binary|
+-----------------------------+
           |
           v
+---------------------------+
| Execute Command and Output|
+---------------------------+
```

---

### Code Snippet: Using Wildcards and Arguments
```bash
#!/bin/bash
# Script to count .txt files in a directory

read -p "Enter directory path: " DIR
if [ -d "$DIR" ]; then
    COUNT=$(ls $DIR/*.txt 2>/dev/null | wc -l)
    echo "Number of .txt files in $DIR: $COUNT"
else
    echo "Invalid directory!"
fi
```
# Advanced Shell Programming in Linux

## Decision Loops in Shell Programming

### 1. `if-else` Statement
The `if-else` statement is used to execute a block of code based on a condition.

#### Syntax:
```bash
if [ condition ]; then
    # Code to execute if condition is true
else
    # Code to execute if condition is false
fi
```

#### Example:
```bash
#!/bin/bash
read -p "Enter a number: " num
if [ $num -gt 0 ]; then
    echo "Positive number"
else
    echo "Non-positive number"
fi
```

---

### 2. `test` Command
The `test` command is used to evaluate expressions.

#### Example:
```bash
#!/bin/bash
if test $1 -gt 0; then
    echo "$1 is greater than zero"
else
    echo "$1 is less than or equal to zero"
fi
```

---

### 3. Nested `if-else`
Nested `if-else` allows multiple conditions to be checked.

#### Example:
```bash
#!/bin/bash
read -p "Enter your age: " age
if [ $age -lt 18 ]; then
    echo "You are a minor."
elif [ $age -lt 65 ]; then
    echo "You are an adult."
else
    echo "You are a senior citizen."
fi
```

---

### 4. `case` Statement
The `case` statement is used for multiple conditional checks.

#### Syntax:
```bash
case expression in
    pattern1)
        # Code for pattern1
        ;;
    pattern2)
        # Code for pattern2
        ;;
    *)
        # Default case
        ;;
esac
```

#### Example:
```bash
#!/bin/bash
read -p "Enter a day of the week: " day
case $day in
    "Monday")
        echo "Start of the work week!"
        ;;
    "Friday")
        echo "Almost weekend!"
        ;;
    *)
        echo "Have a great day!"
        ;;
esac
```

---

### 5. `while` Loop
The `while` loop runs as long as the condition is true.

#### Syntax:
```bash
while [ condition ]; do
    # Commands
done
```

#### Example:
```bash
#!/bin/bash
count=1
while [ $count -le 5 ]; do
    echo "Count: $count"
    count=$((count + 1))
done
```

---

### 6. `until` Loop
The `until` loop runs as long as the condition is false.

#### Syntax:
```bash
until [ condition ]; do
    # Commands
done
```

#### Example:
```bash
#!/bin/bash
count=1
until [ $count -gt 5 ]; do
    echo "Count: $count"
    count=$((count + 1))
done
```

---

### 7. `for` Loop
The `for` loop iterates over a list of items.

#### Syntax:
```bash
for var in list; do
    # Commands
done
```

#### Example:
```bash
#!/bin/bash
for name in Alice Bob Charlie; do
    echo "Hello, $name!"
done
```

---

## Regular Expressions in Shell

Regular expressions (regex) are patterns used to match text. In shell scripting, regex is often used with tools like `grep`, `sed`, or `awk`.

#### Example: Regex with `grep`
```bash
#!/bin/bash
echo "Enter a string:"
read string
if [[ $string =~ ^[A-Z][a-z]+$ ]]; then
    echo "The string starts with an uppercase letter."
else
    echo "The string does not match the pattern."
fi
```

#### Common Regex Symbols:
| **Symbol**  | **Description**                  | **Example**                     |
|-------------|----------------------------------|----------------------------------|
| `.`         | Matches any single character.   | `a.c` matches `abc`, `aXc`.     |
| `^`         | Matches the start of a line.    | `^abc` matches `abc` at start.  |
| `$`         | Matches the end of a line.      | `xyz$` matches `xyz` at end.    |
| `*`         | Matches zero or more occurrences.| `ab*` matches `a`, `ab`, `abb`. |
| `[ ]`       | Matches any character in brackets.| `[a-c]` matches `a`, `b`, `c`.  |

---

## Arithmetic Expressions

Shell scripting supports arithmetic operations using the `(( ))` syntax or the `expr` command.

#### Example: Using `(( ))`
```bash
#!/bin/bash
a=10
b=5
sum=$((a + b))
echo "Sum: $sum"
```

#### Example: Using `expr`
```bash
#!/bin/bash
a=10
b=5
sum=$(expr $a + $b)
echo "Sum: $sum"
```

---

## More Examples in Shell Programming

### 1. Script to Check Even or Odd
```bash
#!/bin/bash
read -p "Enter a number: " num
if [ $((num % 2)) -eq 0 ]; then
    echo "$num is even."
else
    echo "$num is odd."
fi
```

---

### 2. Script to Find Factorial
```bash
#!/bin/bash
read -p "Enter a number: " num
factorial=1
for ((i = 1; i <= num; i++)); do
    factorial=$((factorial * i))
done
echo "Factorial of $num is $factorial."
```

---

### 3. Script to Display Prime Numbers
```bash
#!/bin/bash
read -p "Enter a number: " num
for ((i = 2; i <= num; i++)); do
    is_prime=1
    for ((j = 2; j < i; j++)); do
        if [ $((i % j)) -eq 0 ]; then
            is_prime=0
            break
        fi
    done
    if [ $is_prime -eq 1 ]; then
        echo "$i is a prime number."
    fi
done
```

---

### 4. Script for File Existence Check
```bash
#!/bin/bash
read -p "Enter the filename: " filename
if [ -e "$filename" ]; then
    echo "File $filename exists."
else
    echo "File $filename does not exist."
fi
```

---

### 5. Script to Monitor Disk Usage
```bash
#!/bin/bash
while true; do
    df -h
    sleep 5
done
```
# Process Management in Operating Systems

## Processes

### What is a Process?
A **process** is an instance of a program in execution. It includes:
- Program code
- Current activity (such as the program counter, registers, and variables)
- Allocated system resources (memory, files, and I/O devices)

---

### Preemptive and Non-Preemptive Processes

| **Feature**                 | **Preemptive Process**                                      | **Non-Preemptive Process**                             |
|-----------------------------|-----------------------------------------------------------|------------------------------------------------------|
| **Definition**              | The CPU can be taken away from a process at any time.      | A process runs to completion once it starts execution.|
| **Control**                 | Controlled by the operating system.                       | Controlled by the process itself.                   |
| **Examples**                | Multitasking systems (Round-Robin scheduling).            | Batch processing systems.                           |
| **Advantages**              | Better responsiveness and fairness.                      | Simpler to implement.                               |
| **Disadvantages**           | Higher overhead due to frequent context switching.        | Inefficient if a process takes too long.            |

---

### Difference Between Process and Thread

| **Aspect**          | **Process**                                        | **Thread**                                    |
|---------------------|---------------------------------------------------|----------------------------------------------|
| **Definition**       | A program in execution.                          | A lightweight subprocess, part of a process.|
| **Resources**        | Has its own memory space and system resources.    | Shares memory and resources of its process. |
| **Creation Time**    | Slower, requires more overhead.                   | Faster, minimal overhead.                   |
| **Communication**    | Inter-process communication (e.g., pipes).        | Direct communication within the same process.|
| **Examples**         | Web browser, media player.                       | Threads in a web browser for tabs.          |

---

## Process Management

### Process Life Cycle

A process goes through several stages during its lifetime:

#### States in the Process Life Cycle:
1. **New**: Process is being created.
2. **Ready**: Process is ready to execute but waiting for CPU allocation.
3. **Running**: Process is executing on the CPU.
4. **Waiting**: Process is waiting for an I/O operation to complete.
5. **Terminated**: Process has finished execution.

#### Diagram: Process Life Cycle
```plaintext
        +-------+
        |  New  |
        +-------+
            |
            v
        +---------+      +---------+
        |  Ready  |<---->| Waiting |
        +---------+      +---------+
            |                ^
            v                |
        +---------+          |
        | Running |----------+
        +---------+
            |
            v
       +-----------+
       | Terminated|
       +-----------+
```

---

### What are Schedulers?

Schedulers are components of the operating system that manage process execution by deciding:
- **Which process to run**
- **When to run**

#### Types of Schedulers:

| **Scheduler**      | **Purpose**                                                                                                                                   | **Frequency**          | **Example**                          |
|--------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|------------------------|--------------------------------------|
| **Short-Term**     | Selects a process from the ready queue to execute on the CPU.                                                                                | Runs very frequently. | Round-Robin, Priority Scheduling.    |
| **Medium-Term**    | Temporarily removes processes from memory (swapping) to reduce CPU load.                                                                     | Runs occasionally.     | Used in systems with limited memory. |
| **Long-Term**      | Decides which processes to admit into the system for processing.                                                                              | Runs infrequently.     | Used in batch or job scheduling.     |

#### Comparison of Schedulers:

| **Aspect**         | **Short-Term Scheduler**            | **Medium-Term Scheduler**       | **Long-Term Scheduler**        |
|---------------------|-------------------------------------|----------------------------------|---------------------------------|
| **Objective**       | CPU allocation.                   | Manage memory and CPU load.     | Admission of processes.         |
| **Run Frequency**   | High (milliseconds).              | Medium (seconds).               | Low (minutes or less).          |
| **Type of Systems** | Time-sharing systems.             | Systems with memory limitations.| Batch systems.                  |

---

### Code Snippet: Process Creation Using Fork in C
```c
#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        printf("Child Process: PID = %d\n", getpid());
    } else {
        printf("Parent Process: PID = %d\n", getpid());
    }
    return 0;
}
```

---

### Examples of Schedulers

#### 1. Round-Robin Scheduling (Short-Term Scheduler)
- Each process is assigned a fixed time quantum.
- After the quantum expires, the process is preempted, and the next process in the queue is executed.

#### 2. Swapping Processes (Medium-Term Scheduler)
- A process is swapped out of memory to the disk to free up space for other processes.
- Example: Virtual memory systems.

#### 3. Job Scheduling (Long-Term Scheduler)
- Jobs are selected from a job queue for execution based on criteria like priority or deadlines.

---

# Process Scheduling and Management

## Process Scheduling Algorithms

Process scheduling algorithms determine the order in which processes are executed by the CPU. Below are the primary scheduling algorithms:

### 1. First Come First Serve (FCFS)
- **Definition**: Processes are executed in the order they arrive in the ready queue.
- **Advantages**:
  - Simple to implement.
  - No starvation.
- **Disadvantages**:
  - Can cause the "convoy effect," where smaller processes are delayed by larger ones.
  - Performance can degrade significantly if a long process arrives first, leading to high waiting times for shorter processes.

#### Handling Different Workloads:
- **Short Processes**: FCFS handles workloads with mostly short processes well, as it minimizes waiting time.
- **Mix of Short and Long Processes**: When a long process arrives first, shorter processes may experience significant delays, leading to poor throughput and higher average waiting times.
- **Impact on Throughput**: The throughput decreases as longer processes occupy the CPU, blocking subsequent processes, which causes inefficiency in high-demand systems.

#### Example:
| **Process** | **Arrival Time** | **Burst Time** | **Completion Time** | **Turnaround Time (TAT)** | **Waiting Time (WT)** |
|-------------|------------------|----------------|-----------------------|---------------------------|-----------------------|
| P1          | 0                | 5              | 5                     | 5                         | 0                     |
| P2          | 1                | 3              | 8                     | 7                         | 4                     |
| P3          | 2                | 8              | 16                    | 14                        | 6                     |

**Formulas**:
- **Turnaround Time (TAT)**: `Completion Time - Arrival Time`
- **Waiting Time (WT)**: `Turnaround Time - Burst Time`

---

### 2. Shortest Job First (SJF)
- **Definition**: Processes with the shortest burst time are executed first.
- **Advantages**:
  - Minimizes average waiting time.
- **Disadvantages**:
  - Not suitable for real-time systems.
  - Starvation of longer processes.

---

# Process Scheduling Algorithms

## 3. Priority Scheduling

### Definition

Processes are executed based on their priority. Higher priority processes are executed first.

### Advantages

- Suitable for critical tasks.

### Disadvantages

- Can cause starvation of low-priority processes.

### Example

| **Process** | **Arrival Time** | **Burst Time** | **Priority** | **Completion Time** | **Turnaround Time** | **Waiting Time** |
| ----------- | ---------------- | -------------- | ------------ | ------------------- | ------------------- | ---------------- |
| P1          | 0                | 8              | 3            | 8                   | 8                   | 0                |
| P2          | 1                | 4              | 1            | 12                  | 11                  | 7                |
| P3          | 2                | 9              | 2            | 21                  | 19                  | 10               |

### Step-by-Step Calculation

#### Order of Execution

- P1 executes first since it arrives at time 0.
- P2 (Highest priority: 1) executes next.
- P3 (Priority: 2) executes last.

#### Calculations

1. **P1**:
   - Completion Time = Arrival Time + Burst Time = 0 + 8 = **8**
   - Turnaround Time = Completion Time - Arrival Time = 8 - 0 = **8**
   - Waiting Time = Turnaround Time - Burst Time = 8 - 8 = **0**

2. **P2**:
   - Completion Time = Completion of P1 + Burst Time = 8 + 4 = **12**
   - Turnaround Time = Completion Time - Arrival Time = 12 - 1 = **11**
   - Waiting Time = Turnaround Time - Burst Time = 11 - 4 = **7**

3. **P3**:
   - Completion Time = Completion of P2 + Burst Time = 12 + 9 = **21**
   - Turnaround Time = Completion Time - Arrival Time = 21 - 2 = **19**
   - Waiting Time = Turnaround Time - Burst Time = 19 - 9 = **10**

---

## 4. Round Robin (RR)

### Definition

Each process is executed for a fixed time quantum in a cyclic order.

### Advantages

- Provides fairness and prevents starvation.

### Disadvantages

- High context-switching overhead.

### Example

| **Process** | **Arrival Time** | **Burst Time** | **Time Quantum = 4** | **Completion Time** | **Turnaround Time** | **Waiting Time** |
| ----------- | ---------------- | -------------- | -------------------- | ------------------- | ------------------- | ---------------- |
| P1          | 0                | 8              | 12                   | 12                  | 12                  | 4                |
| P2          | 1                | 4              | 5                    | 5                   | 4                   | 0                |
| P3          | 2                | 9              | 17                   | 17                  | 15                  | 6                |

### Step-by-Step Calculation

#### Time Slices

1. P1 executes from 0 to 4 (Remaining Burst = 4).
2. P2 executes from 4 to 8 (Remaining Burst = 0).
3. P3 executes from 8 to 12 (Remaining Burst = 5).
4. P1 executes from 12 to 16 (Remaining Burst = 0).
5. P3 executes from 16 to 17 (Remaining Burst = 0).

#### Completion Times

- **P1**: Completes at **12**.
- **P2**: Completes at **5**.
- **P3**: Completes at **17**.

#### Turnaround Time

- **P1**: Completion Time - Arrival Time = 12 - 0 = **12**.
- **P2**: Completion Time - Arrival Time = 5 - 1 = **4**.
- **P3**: Completion Time - Arrival Time = 17 - 2 = **15**.

#### Waiting Time

- **P1**: Turnaround Time - Burst Time = 12 - 8 = **4**.
- **P2**: Turnaround Time - Burst Time = 4 - 4 = **0**.
- **P3**: Turnaround Time - Burst Time = 15 - 9 = **6**.

---

### Additional Round Robin Example

| **Process** | **Arrival Time** | **Burst Time** | **Time Quantum = 4** | **Turnaround Time** | **Waiting Time** |
| ----------- | ---------------- | -------------- | -------------------- | ------------------- | ---------------- |
| P1          | 0                | 5              | 9                    | 9                   | 4                |
| P2          | 1                | 3              | 7                    | 6                   | 3                |
| P3          | 2                | 8              | 14                   | 12                  | 4                |

#### Time Slices

1. P1 executes from 0 to 4 (Remaining Burst = 1).
2. P2 executes from 4 to 7 (Remaining Burst = 0).
3. P3 executes from 7 to 11 (Remaining Burst = 4).
4. P1 executes from 11 to 12 (Remaining Burst = 0).
5. P3 executes from 12 to 14 (Remaining Burst = 0).

#### Completion Times

- **P1**: Completes at **9**.
- **P2**: Completes at **7**.
- **P3**: Completes at **14**.

#### Turnaround Times

- **P1**: Completion Time - Arrival Time = 9 - 0 = **9**.
- **P2**: Completion Time - Arrival Time = 7 - 1 = **6**.
- **P3**: Completion Time - Arrival Time = 14 - 2 = **12**.

#### Waiting Times

- **P1**: Turnaround Time - Burst Time = 9 - 5 = **4**.
- **P2**: Turnaround Time - Burst Time = 6 - 3 = **3**.
- **P3**: Turnaround Time - Burst Time = 12 - 8 = **4**.

---

### 5. Multilevel Queue Scheduling
- **Definition**: Processes are divided into different queues based on their priority or type.
- Example:
  - **System Queue**: Highest priority.
  - **Interactive Queue**: Medium priority.
  - **Batch Queue**: Lowest priority.

---

### Belady’s Anomaly
- **Definition**: An increase in the number of page frames can cause an increase in the number of page faults in FIFO page replacement.

#### Visual Representation:
Below is a flowchart that illustrates how Belady's Anomaly occurs with a reference string and two different frame sizes:

```plaintext
Reference String: 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5

+-----------------------------+
| Start with 3 Frames        |
+-----------------------------+
|                            |
| Page Faults = 9            |
+-----------------------------+
| Add 1 Frame (Total = 4)    |
+-----------------------------+
|                            |
| Page Faults = 10           |
+-----------------------------+
|                            |
| Belady's Anomaly Occurs:   |
| More frames => More faults |
+-----------------------------+
```

- **Example**:
  - Reference String: `1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5`
  - Frames: 3 vs. 4
  - **With 3 Frames**: 9 Page Faults.
  - **With 4 Frames**: 10 Page Faults.

#### Table of Page Faults:
| **Step** | **Reference** | **3 Frames**           | **4 Frames**           |
|----------|---------------|-------------------------|-------------------------|
| 1        | 1             | 1 -                     | 1 -                     |
| 2        | 2             | 1, 2 -                 | 1, 2 -                 |
| 3        | 3             | 1, 2, 3 -             | 1, 2, 3 -             |
| 4        | 4             | 4 replaces 1 (fault)   | 4 replaces 1 (fault)   |
| 5        | 1             | 1 replaces 2 (fault)   | 1 replaces 2 (fault)   |
| ...      | ...           | ...                    | ...                    |
| Final    | Total Faults  | 9 Faults               | 10 Faults              |
- **Definition**: An increase in the number of page frames can cause an increase in the number of page faults in FIFO page replacement.
- **Example**:
  - Reference String: `1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5`
  - Frames: 3 vs. 4
  - **With 3 Frames**: 9 Page Faults.
  - **With 4 Frames**: 10 Page Faults.

---

## Examples for Scheduling Algorithms

Below is an example to find the better-performing scheduler:

#### Scenario:
| **Process** | **Arrival Time** | **Burst Time** |
|-------------|------------------|----------------|
| P1          | 0                | 10             |
| P2          | 2                | 5              |
| P3          | 4                | 2              |

### FCFS Output
| **Metric**        | **P1** | **P2** | **P3** |
|--------------------|--------|--------|--------|
| Turnaround Time    | 10     | 13     | 15     |
| Waiting Time       | 0      | 8      | 13     |
| Average Turnaround | **12.66**                                    |
| Average Waiting    | **7.0**                                      |

#### Step-by-Step Calculation:
1. **P1**:
   - **Completion Time**: Process starts at time 0 (arrival) and runs for 10 units.
     - Completion Time = 0 + 10 = **10**.
   - **Turnaround Time**: Completion Time - Arrival Time = 10 - 0 = **10**.
   - **Waiting Time**: Turnaround Time - Burst Time = 10 - 10 = **0**.

2. **P2**:
   - **Completion Time**: Process starts after P1 finishes at time 10.
     - Completion Time = 10 (start) + 5 (burst) = **15**.
   - **Turnaround Time**: Completion Time - Arrival Time = 15 - 2 = **13**.
   - **Waiting Time**: Turnaround Time - Burst Time = 13 - 5 = **8**.

3. **P3**:
   - **Completion Time**: Process starts after P2 finishes at time 15.
     - Completion Time = 15 (start) + 2 (burst) = **17**.
   - **Turnaround Time**: Completion Time - Arrival Time = 17 - 4 = **15**.
   - **Waiting Time**: Turnaround Time - Burst Time = 15 - 2 = **13**.

**Formulas**:
- **Turnaround Time (TAT)**: `Completion Time - Arrival Time`
- **Waiting Time (WT)**: `Turnaround Time - Burst Time`

By following these calculations, FCFS averages a **Turnaround Time** of **12.66** and a **Waiting Time** of **7.0**.:
| **Metric**        | **P1** | **P2** | **P3** |
|--------------------|--------|--------|--------|
| Turnaround Time    | 10     | 13     | 15     |
| Waiting Time       | 0      | 8      | 13     |
| Average Turnaround | **12.66**                                    |
| Average Waiting    | **7.0**                                      |

### SJF Output:
| **Metric**        | **P1** | **P2** | **P3** |
|--------------------|--------|--------|--------|
| Turnaround Time    | 15     | 5      | 2      |
| Waiting Time       | 5      | 0      | 0      |
| Average Turnaround | **7.33**                                    |
| Average Waiting    | **1.66**                                    |

**Conclusion**: SJF performs better in this scenario.

---

## Process Creation Using `fork`, `waitpid`, and `exec`

### 1. `fork()`
- **Definition**: Creates a child process by duplicating the current process.
- **Return Value**:
  - `0`: In the child process.
  - `>0`: Process ID of the child in the parent process.
  - `<0`: Error in process creation.

#### Flowchart: Parent and Child Process Creation
Below is a flowchart that visually represents how `fork()` works:

```plaintext
Start
  |
  |-- fork() system call
  |
  +---------------------------+
  |                           |
Parent Process                Child Process
  |                           |
  |-- Executes parent code     |-- Executes child code
  |                           |
  +---------------------------+
            End
```

#### Example:
```c
#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        printf("Child Process: PID = %d
", getpid());
    } else {
        printf("Parent Process: PID = %d
", getpid());
    }
    return 0;
}
```

---

### 2. `waitpid()`
- **Definition**: Makes the parent process wait until a specific child process completes.
- **Syntax**:
```c
pid_t waitpid(pid_t pid, int *status, int options);
```

---

### 3. `exec()`
- **Definition**: Replaces the current process with a new program.
- **Variants**:
  - `execl`, `execp`, `execv`, `execvp`.

#### Example:
```c
#include <stdio.h>
#include <unistd.h>

int main() {
    execl("/bin/ls", "ls", NULL);
    return 0;
}
```

---

## Orphan and Zombie Processes

### 1. Orphan Processes
- **Definition**: A process whose parent has terminated but is still running.
- **Example**:
  - The `init` process adopts orphan processes.

#### Example:
```c
#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();
    if (pid == 0) {
        sleep(10); // Orphan child
        printf("Child process becomes orphan.\n");
    } else {
        printf("Parent process exiting.\n");
    }
    return 0;
}
```

---

### 2. Zombie Processes
- **Definition**: A process that has completed execution but still has an entry in the process table.
- **Cause**: The parent did not call `wait()` to remove the process entry.

#### Diagram: Zombie Process in the Process Table
Below is a representation of the process table showing how a zombie process appears:

```plaintext
+-----------+------------+-------------+
| Process ID| State      | Parent PID  |
+-----------+------------+-------------+
| 101       | Running    | 100         |
| 102       | Zombie     | 100         |
| 103       | Sleeping   | 101         |
+-----------+------------+-------------+
```

- **Explanation**:
  - **Process 102** has completed execution but remains in the table as a "zombie."
  - **Process 100 (Parent)** has not cleaned up by calling `wait()`.

#### Cleanup Process:
1. Parent process calls `wait()` or `waitpid()`.
2. OS removes the zombie process from the process table.
3. Resources held by the zombie process are released.

#### Example:
```c
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();
    if (pid == 0) {
        printf("Child process exiting.
");
    } else {
        sleep(10); // Simulate delay before cleanup
        wait(NULL); // Parent cleans up zombie process
        printf("Zombie process cleaned up.
");
    }
    return 0;
}
```
- **Definition**: A process that has completed execution but still has an entry in the process table.
- **Cause**: The parent did not call `wait()` to remove the process entry.

#### Example:
```c
#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();
    if (pid == 0) {
        printf("Child process exiting.\n");
    } else {
        sleep(10); // Parent does not call wait()
        printf("Parent process did not clean up the child.\n");
    }
    return 0;
}
```

---
# Memory Management

## Types of Memories and the Need for Memory Management

### Types of Memories:
1. **Primary Memory (RAM)**:
   - High-speed memory directly accessible by the CPU.
   - Volatile, meaning data is lost when the system is powered off.

2. **Secondary Memory (HDD/SSD)**:
   - Non-volatile memory used for long-term storage.
   - Slower but capable of storing large amounts of data.

3. **Cache Memory**:
   - Small, high-speed memory located close to the CPU.
   - Stores frequently accessed data to reduce latency.

4. **Virtual Memory**:
   - Logical extension of primary memory using disk storage.
   - Enables execution of large programs by swapping data in and out of physical memory.

5. **Registers**:
   - Smallest and fastest type of memory, located within the CPU.
   - Stores immediate instructions and data.

### Need for Memory Management:
- **Efficient Utilization**: Ensures optimal use of available memory.
- **Process Isolation**: Prevents processes from interfering with each other's memory space.
- **Dynamic Allocation**: Allocates memory dynamically as per process requirements.
- **Security**: Protects sensitive data from unauthorized access.
- **Performance Optimization**: Reduces fragmentation and increases access speed.

---

## Continuous and Dynamic Allocation

### Continuous Allocation:
- Memory is allocated in contiguous blocks.
- Simple to implement but suffers from **fragmentation**.

### Dynamic Allocation:
- Memory is allocated as needed during runtime.
- Enables efficient use of memory but requires complex management algorithms.

| Allocation Type      | Advantages                    | Disadvantages                 |
|----------------------|------------------------------|-------------------------------|
| Continuous Allocation| Simple and predictable      | Leads to fragmentation        |
| Dynamic Allocation   | Flexible and efficient usage| Requires complex algorithms   |

---

## Memory Allocation Algorithms

### 1. **First Fit**:
- Allocates the first block of memory that is large enough.
- **Advantage**: Fast.
- **Disadvantage**: Leads to fragmentation over time.

### 2. **Best Fit**:
- Allocates the smallest block of memory that fits the requirement.
- **Advantage**: Reduces wasted space.
- **Disadvantage**: Slower due to the search for the best fit.

### 3. **Worst Fit**:
- Allocates the largest block of memory available.
- **Advantage**: Avoids small leftover spaces.
- **Disadvantage**: May lead to inefficient use of memory.

| Algorithm  | Efficiency   | Fragmentation Handling  |
|------------|--------------|-------------------------|
| First Fit  | Fast         | Poor                   |
| Best Fit   | Moderate     | Better                 |
| Worst Fit  | Slow         | Poor                   |

### Example

Consider memory blocks of sizes: **100KB**, **500KB**, **200KB**, and **300KB**.  
Process sizes: **212KB**, **417KB**, and **112KB**.

#### Strategy

| Strategy    | Allocation Order      |
|-------------|-----------------------|
| First Fit   | 200KB, 500KB          |
| Best Fit    | 300KB, 500KB          |
| Worst Fit   | 500KB, 500KB          |

---

## Compaction
- **Definition**: Process of combining fragmented memory blocks into a single contiguous block.
- **Purpose**: Reduces fragmentation and makes larger blocks available for allocation.

### Example:
Before compaction:
```
[Process A][Free][Process B][Free][Process C]
```
After compaction:
```
[Process A][Process B][Process C][Free]
```

---

## Internal and External Fragmentation

### Internal Fragmentation:
- Wasted memory within allocated blocks.
- Occurs when memory is allocated in fixed-size blocks larger than required.

### External Fragmentation:
- Wasted memory outside allocated blocks due to small free spaces.
- Prevents allocation of larger blocks even if the total free space is sufficient.

| Type                    | Cause                         | Solution                     |
|-------------------------|-------------------------------|-----------------------------|
| Internal Fragmentation  | Fixed-size block allocation   | Use dynamic allocation      |
| External Fragmentation  | Non-contiguous allocation     | Use compaction or paging    |

---

## Segmentation

### What is Segmentation?
- Divides memory into variable-sized segments based on logical divisions such as functions or data structures.

### Hardware Requirements:
- **Segment Table**: Maps logical addresses to physical memory.
- **Base Register**: Stores the starting address of a segment.
- **Limit Register**: Stores the size of a segment.

### Segmentation Table:
| Segment | Base Address | Limit |
|---------|--------------|-------|
| 0       | 1000         | 500   |
| 1       | 2000         | 300   |
| 2       | 3000         | 800   |

### Interpretation:
- Logical addresses are translated into physical addresses using the base and limit values from the segmentation table.
- Address validation ensures access stays within segment boundaries.

---

## Paging

### What is Paging?
- Divides memory into fixed-size pages.
- Avoids external fragmentation by using equal-sized blocks for logical and physical memory.

### Hardware Requirements:
- **Page Table**: Maps logical pages to physical frames.
- **Translation Lookaside Buffer (TLB)**: Cache for page table entries to speed up address translation.

### Paging Table Example:
| Logical Page | Physical Frame |
|--------------|----------------|
| 0            | 2              |
| 1            | 5              |
| 2            | 8              |

### Translation Lookaside Buffer (TLB):
- High-speed memory used to store a subset of page table entries.
- Reduces the time needed for address translation.

---

## Concept of Dirty Bit
- **Definition**: A flag in a page table entry indicating whether the associated page has been modified.
- **Purpose**: Ensures that only modified pages are written back to disk, optimizing performance.
- **Example**:
  - If a page is modified (dirty bit = 1), it is saved to disk before being replaced.
  - If not modified (dirty bit = 0), no save operation is needed.

---

## Shared Pages and Reentrant Code

### Shared Pages:
- Allows multiple processes to share common code or data.
- Reduces memory usage by avoiding duplication.

### Reentrant Code:
- Code that can be safely executed by multiple processes concurrently.
- Example: Shared libraries loaded into memory once and used by multiple programs.

---

## Throttling
- **Definition**: Controlling the rate at which a process uses system resources to prevent overloading.
- **Purpose**:
  - Balances resource usage across processes.
  - Prevents bottlenecks and system degradation.

### Example:
- Limiting the bandwidth of a process to ensure fair usage in a networked environment.

---

## IO Management

### Overview:
- Manages input/output operations between the system and peripherals such as disks, printers, and keyboards.
- Ensures smooth data transfer and synchronization.

### Techniques:
| Technique  | Description                            |
|------------|----------------------------------------|
| Buffering  | Temporary storage during IO transfers |
| Caching    | Storing frequently accessed data      |
| Spooling   | Queuing jobs for sequential execution |

### Components:
- **Device Drivers**: Software interfaces for communication with hardware devices.
- **Interrupt Handlers**: Manage IO operation notifications.
- **IO Scheduler**: Optimizes the order of IO requests to enhance performance.

---
# Virtual Memory

Virtual memory is a memory management technique that provides an "illusion" of a larger main memory by abstracting physical memory into a virtual address space. It allows programs to use more memory than is physically available in RAM by utilizing disk storage for data that isn't actively in use.

## Features of Virtual Memory
1. **Logical Addressing:** Virtual addresses are translated to physical addresses through the Memory Management Unit (MMU).
2. **Demand Paging:** Only the required data/pages are loaded into physical memory, reducing memory usage.
3. **Isolation:** Each process operates within its own virtual address space.
4. **Efficient Multitasking:** Allows many processes to run simultaneously by swapping data in and out of memory.

---

## Demand Paging

**Demand paging** is a memory management scheme where pages are loaded into memory only when they are required. If a page isn't present in physical memory when a program accesses it, a **page fault** occurs, and the operating system loads the required page from disk into memory.

### Steps in Demand Paging
1. The program references a page using a virtual address.
2. If the page is not in memory (page fault), the OS:
   - Identifies the required page.
   - Finds a free frame in memory or evicts an existing page.
   - Loads the page from secondary storage (disk).
   - Updates the page table.
3. Execution resumes after the page is loaded.

---

## Page Faults

A **page fault** occurs when a program accesses a page that is not currently in physical memory. This triggers the operating system to fetch the missing page from disk.

### Types of Page Faults
1. **Minor Page Fault:** The page is in memory but not mapped into the process's page table.
2. **Major Page Fault:** The page must be retrieved from secondary storage.
3. **Invalid Page Fault:** Occurs when a program accesses a non-existent or restricted page.

### Handling a Page Fault
1. Determine the missing page using the virtual address.
2. Check the disk location of the page.
3. Allocate a frame in physical memory.
4. Load the page into the allocated frame.
5. Update the process's page table.
6. Resume execution.

---

## Page Replacement Algorithms

When a page fault occurs and memory is full, the OS must decide which page to replace using a **page replacement algorithm**.

### 1. FIFO (First-In-First-Out)
- The oldest page in memory is replaced.
- Simple but may lead to poor performance (e.g., Belady's anomaly).

#### Example
```plaintext
Pages: [1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5]
Frames: 3
FIFO: [1, 2, 3] -> [4, 1, 2] -> [5, 1, 2] -> [3, 4, 5]
Page Faults: 9
```

### 2. LRU (Least Recently Used)
- Replaces the page that has not been used for the longest time.
- More efficient but requires tracking page usage.

#### Example
```plaintext
Pages: [1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5]
Frames: 3
LRU: [1, 2, 3] -> [4, 1, 2] -> [5, 4, 1] -> [3, 5, 1]
Page Faults: 8
```

### 3. Optimal
- Replaces the page that won’t be used for the longest time in the future.
- Theoretical best performance but requires knowledge of future accesses.

#### Example
```plaintext
Pages: [1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5]
Frames: 3
Optimal: [1, 2, 3] -> [4, 1, 2] -> [5, 4, 1] -> [3, 4, 5]
Page Faults: 7
```

### 4. Clock Algorithm
- Circular implementation of LRU using a "use" bit.
- Pages are replaced in a circular manner, skipping pages with their "use" bit set to `1`.

---

## Diagrams and Tables

### Virtual Memory Architecture
```plaintext
+-------------------------+
|         Process         |
+-------------------------+
|       Virtual Memory    | <- Logical Address
+-------------------------+
         MMU
+-------------------------+
|     Physical Memory     | <- Physical Address
+-------------------------+
```

### Page Table Example
| Virtual Page | Physical Frame | Valid Bit |
|--------------|----------------|-----------|
| 0            | 3              | 1         |
| 1            | 5              | 1         |
| 2            | -              | 0         |
| 3            | 1              | 1         |

---

## Code Snippets

### Simulating FIFO in Python
```python
def fifo(pages, frames):
    memory = []
    page_faults = 0
    
    for page in pages:
        if page not in memory:
            page_faults += 1
            if len(memory) < frames:
                memory.append(page)
            else:
                memory.pop(0)
                memory.append(page)
        print(f"Memory: {memory}")
    
    return page_faults

pages = [1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5]
frames = 3
faults = fifo(pages, frames)
print(f"Total Page Faults: {faults}")
```

---

## Flowchart: Page Fault Handling

```plaintext
[Start] -> [Access Page] -> [Page in Memory?]
                          /      \
                         /        \
                       Yes        No
                       /            \
         [Continue Execution]   [Page Fault]
                                    |
                          [Load Page from Disk]
                                    |
                         [Update Page Table]
                                    |
                         [Continue Execution]
```

# Deadlock

A **deadlock** occurs when a group of processes becomes stuck in a state where no process can proceed because each process is waiting for a resource held by another. Deadlocks primarily occur in concurrent systems where multiple processes share resources.

---

## Necessary Conditions of Deadlock

For a deadlock to occur, all four of the following conditions must be true simultaneously:

1. **Mutual Exclusion:**
   - At least one resource must be held in a non-shareable mode.
   - Only one process can use the resource at a time.

2. **Hold and Wait:**
   - A process holding at least one resource is waiting to acquire additional resources held by other processes.

3. **No Preemption:**
   - Resources cannot be forcibly removed from a process holding them; they must be released voluntarily.

4. **Circular Wait:**
   - A closed chain of processes exists such that each process holds at least one resource needed by the next process in the chain.

**Diagram:**  
```plaintext
P1 -> R1 -> P2 -> R2 -> P3 -> R3 -> P1
```

---

## Deadlock Prevention and Avoidance

### 1. Deadlock Prevention
Deadlock prevention involves ensuring that at least one of the necessary conditions for deadlock does not hold.

#### Strategies:
- **Mutual Exclusion:** Make resources shareable where possible.
- **Hold and Wait:** Require processes to request all resources at once, or release current resources before requesting new ones.
- **No Preemption:** Allow preemption of resources if a process cannot acquire all needed resources.
- **Circular Wait:** Impose a strict ordering of resource allocation to prevent circular chains.

---

### 2. Deadlock Avoidance
Deadlock avoidance requires additional information about processes' resource needs to ensure that the system never enters an unsafe state.

#### Banker's Algorithm:
1. Each process declares the maximum number of resources it might need.
2. The system checks if allocating resources to the process will leave the system in a safe state.
3. A **safe state** ensures that all processes can complete without causing a deadlock.

#### Example:
- Processes: P1, P2
- Resources: R1, R2
- Max Need: [[7, 5], [3, 2]]
- Available: [10, 7]

**Flowchart:**
```plaintext
[Start] -> [Request Resources] -> [Check Safety] -> [Safe?]
                                   /    \
                                  Yes    No
                                  /        \
                         [Allocate]      [Wait]
```

---

## Semaphore

A **semaphore** is a synchronization primitive used to control access to shared resources. Semaphores can be:

1. **Binary Semaphore (Mutex):**
   - Takes values 0 or 1.
   - Used for mutual exclusion.

2. **Counting Semaphore:**
   - Represents the number of available units of a resource.

#### Operations:
- **Wait (P):** Decrements the semaphore value.
- **Signal (V):** Increments the semaphore value.

**Code Example:**
```c
Semaphore S = 1;

P(S): if (S > 0) S = S - 1;
V(S): S = S + 1;
```

---

## Mutex

A **mutex** (short for "mutual exclusion") is a locking mechanism that allows only one thread to access a critical section at a time.

### Characteristics:
- Ownership: Only the process that locks the mutex can unlock it.
- Binary: Works as a binary semaphore.

**Code Example:**
```c
pthread_mutex_t lock;

pthread_mutex_lock(&lock);
// Critical section
pthread_mutex_unlock(&lock);
```

---

## Producer-Consumer Problem

The **producer-consumer problem** illustrates synchronization issues in multi-threaded programming. A producer thread creates items and adds them to a buffer, while a consumer thread removes items from the buffer.

### Solution using Semaphores:
#### Semaphores:
- `Empty`: Tracks empty slots in the buffer.
- `Full`: Tracks filled slots in the buffer.
- `Mutex`: Ensures mutual exclusion.

**Code Example:**
```c
Semaphore empty = N, full = 0, mutex = 1;

Producer:
P(empty);
P(mutex);
// Add item to buffer
V(mutex);
V(full);

Consumer:
P(full);
P(mutex);
// Remove item from buffer
V(mutex);
V(empty);
```

---

## Deadlock vs. Starvation

| **Aspect**       | **Deadlock**                                          | **Starvation**                                      |
|-------------------|-------------------------------------------------------|----------------------------------------------------|
| **Definition**    | Processes cannot proceed due to circular resource dependency. | Processes are perpetually delayed from accessing resources. |
| **Cause**         | Mutual exclusion, hold and wait, no preemption, circular wait. | Priority scheduling or resource hoarding by high-priority processes. |
| **Detection**     | Can be detected using algorithms like Banker's.       | Cannot be easily detected; symptoms include delayed execution. |
| **Prevention**    | Modify resource allocation policies to avoid deadlocks. | Use aging to increase priority of waiting processes over time. |

---

### Flowchart: Deadlock Detection Algorithm

```plaintext
[Start] -> [Check Resource Allocation] -> [Safe State?]
                           /    \
                          Yes    No
                          /        \
                     [Proceed]   [Resolve Deadlock]
```
