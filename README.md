# Vulnerable Spring Web MVC 

The application is built to be vulnerable to showcase basic insecure coding that leads to web security vulnerabilities from insecure login design, cross-site scripting to file uploads. Fixes are also provided to each vulnerable code.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Eclipse IDE for Java EE Developers (Oxygen is the latest version as of the time of this post)
Tomcat 7//8.x.x Plugin
Maven Compiler 3.x.x Plugin
```

### Installing

Simply clone the repo

```
git clone https://github.com/sugiantoaudi/java-training-w-spring-security.git
```

Open Eclipse and import the project directory 

```
"File" > "Open Projects From Filesystem" > ~/java-training-w-spring-security/spring```
```

## Deployment

In Eclipse, right click on the package "spring" and "Run As" > "Maven Build" > enter "tomcat7:run" in "Goals". Click "Run".

* http://localhost:3000/index to access the Index page that provides links to the vulnerabilities in the application.

## Authors

* **Audi Sugianto**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
